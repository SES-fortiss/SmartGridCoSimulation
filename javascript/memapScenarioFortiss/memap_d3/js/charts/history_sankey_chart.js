function createHistorySankeyChart(){
    var margin = {top: 60, right: 20, bottom: 20, left: 200},
        width = 1160 - margin.right,
        height = 600 - margin.top - margin.bottom;

    var formatNumber = d3.format(",.0f"),
        color = d3.scaleOrdinal(d3.schemeCategory10),
        format = function(d) { return formatNumber(d/(60*60)) + " kWh"; };

    var svg = d3.select("#sankey").append("svg")
        .attr("width", width + margin.left + margin.right)
        .attr("height", height + margin.top + margin.bottom)
        .append("g")
        .attr("transform", "translate(" + margin.left + "," + margin.top + ")");

    var sankey = d3.sankey()
        .nodeWidth(15)
        .nodePadding(10)
        .size([width, height])
        .nodeId(function id(d) {return d.name;});

    if(building_id&&start_date&&end_date) requestSankeyData(building_id, start_date, end_date, svg, sankey, color, format, width);
}

function requestSankeyData(building, start_time, end_time, svg, sankey, color, format, width){
    $.getJSON(rest_url+"/rest/getdata/"+building+"/"+start_time+"/"+end_time, function(result) {
        var data = JSON.parse(result[0]);
        for (i = 1; i < result.length; i++) {
            var dataJSON = JSON.parse(result[i]);
            var currentTime = new Date(dataJSON.currentTime.date.year, dataJSON.currentTime.date.month-1,
                dataJSON.currentTime.date.day, dataJSON.currentTime.time.hour, dataJSON.currentTime.time.minute,
                dataJSON.currentTime.time.second, 0);
            data.consumption.electrical += dataJSON.consumption.electrical;
            data.consumption.heat += dataJSON.consumption.heat;
            data.consumption.dhw += dataJSON.consumption.dhw;

            for (var p in dataJSON.producers) {
                if (!dataJSON.producers.hasOwnProperty(p)) continue;
                var obj = dataJSON.producers[p];
                for (var l in data.producers) {
                    if (!data.producers.hasOwnProperty(l)) continue;
                    var obj_l = data.producers[l];
                    if (obj_l.name === obj.name) {
                        obj_l.cost += obj.cost;
                        obj_l.power_el += obj.power_el;
                        obj_l.power_h += obj.power_h;
                    }
                }
            }

            for (var s in dataJSON.storages) {
                if (!dataJSON.storages.hasOwnProperty(s)) continue;
                var obj_s = dataJSON.storages[s];
                for (var m in data.storages) {
                    if (!data.storages.hasOwnProperty(m)) continue;
                    var obj_m = data.storages[m];
                    if (obj_m.name === obj_s.name) {
                        obj_m.cost += obj_s.cost;
                        if (currentTime === Date.parse(end_time)) {obj_m.cur_capacity = obj_s.cur_capacity;}
                        obj_m.p_in += obj_s.p_in;
                        obj_m.p_out += obj_s.p_out;
                    }
                }
            }
        }

        var graph = computeGraph(data);

        var graph_s = sankey(graph);

        for (var i = 0; i < graph.nodes.length; i++){
            if((graph.nodes[i].sourceLinks.length === 0 && graph.nodes[i].targetLinks.length === 0) || graph.nodes[i].value === 0) {
                graph.nodes.splice(i,1);
                i = i-1;
            }
        }

        svg.append("g")
            .attr("stroke", "#000")
            .attr("class", "node")
            .selectAll("rect")
            .data(graph_s.nodes)
            .enter().append("rect")
                .attr("x", function(d) {return d.x0;})
                .attr("y", function(d) {return d.y0;})
                .attr("height", function(d) { return (d.y1 - d.y0); })
                .attr("width", function(d) {return (d.x1 - d.x0); })
                .attr("fill", function(d) {return color(d.name); })
                .append("title")
                     .text(function(d) { return d.name + "\n" + format(d.value); });


        const link = svg.append("g")
            .attr("fill", "none")
            .attr("stroke-opacity", 0.5)
            .selectAll("g")
            .data(graph_s.links)
            .enter().append("g")
            .attr("class", "link")
            .style("mix-blend-mode", "multiply");


        const gradient = link.append("linearGradient")
            .attr("id", function(d) {return "gradient"+d.index;})
            .attr("gradientUnits", "userSpaceOnUse")
            .attr("x1", function(d) {return d.source.x1;})
            .attr("x2", function(d) {return d.target.x0;});

        gradient.append("stop")
            .attr("offset", "0%")
            .attr("stop-color", function(d) {return color(d.source.name);});

        gradient.append("stop")
            .attr("offset", "100%")
            .attr("stop-color", function(d) {return color(d.target.name);});

        link.append("path")
            .attr("d", d3.sankeyLinkHorizontal())
            .attr("stroke", function(d) {return "url(#gradient"+d.index+")";})
            .attr("stroke-width", function(d) { return Math.max(1, d.width); });

        link.append("title")
            .text(function(d) { return d.source.name + " → " + d.target.name + "\n" + format(d.value); });

        svg.append("g")
            .style("font", "10px sans-serif")
            .selectAll("text")
            .data(graph_s.nodes)
            .enter().append("text")
            .attr("class", "node")
            .attr("x", function(d) {return (d.x0 < width / 2 ? d.x1 + 6 : d.x0 - 6); })
            .attr("y", function(d) {return ((d.y1 + d.y0) / 2);})
            .attr("dy", "0.35em")
            .attr("text-anchor", function(d) {return (d.x0 < width / 2 ? "start" : "end");})
            .text(function(d) {return d.name;});
    });
}

function computeGraph(data){
    var consumption = data.consumption;
    var producers = data.producers;
    var storages =  data.storages;
    var production_el = 0.0;
    var obj_s;
    var graph = {nodes: [{name: "Stromverbrauch"},{name: "Warmwasser"},{name: "Heizung"},{name: "Netz"},{name: "Ungenutzte Wärme"}],
        links:[]};

    for (var p in producers){
        if (!producers.hasOwnProperty(p)) {
            graph.links.push({source: "Netz", target: "Stromverbrauch", value: consumption.electrical});
            continue;
        }
        var obj_p = producers[p];
        checkAndAdd(graph.nodes,obj_p.name);

        //Strom
        if(obj_p.power_el !== 0){
            production_el += obj_p.power_el;
            //production>consumption
            if(obj_p.power_el > consumption.electrical) {
                graph.links.push({source: obj_p.name, target: "Stromverbrauch", value: consumption.electrical});

                //check, if storages are available
                for (var s in storages) {
                    if (!storages.hasOwnProperty(s)) {
                        graph.links.push({
                            source: obj_p.name,
                            target: "Netz",
                            value: obj_p.power_el - consumption.electrical
                        });
                        continue;
                    }
                    obj_s = storages[s];
                    checkAndAdd(graph.nodes,obj_s.name);
                    var p_in_all = obj_s.p_in-obj_s.p_out;
                    if (obj_s.name === "Batterie" && p_in_all > 0) {
                        graph.links.push({source: obj_p.name, target: obj_s.name, value: p_in_all});
                        if (p_in_all + consumption.electrical < obj_p.power_el) {
                            graph.links.push({
                                source: obj_p.name,
                                target: "Netz",
                                value: obj_p.power_el - consumption.electrical - p_in_all
                            });
                        }
                    }
                    else graph.links.push({
                        source: obj_p.name,
                        target: "Netz",
                        value: obj_p.power_el - consumption.electrical
                    });
                }
            }
            //production<=consumption
            else{
                graph.links.push({source: obj_p.name, target: "Stromverbrauch", value: obj_p.power_el});
                if(obj_p.power_el < consumption.electrical){
                    //check, if storages are available
                    for (s in storages) {
                        if (!storages.hasOwnProperty(s)) {
                            graph.links.push({
                                source: "Netz",
                                target: "Stromverbrauch",
                                value: consumption.electrical - obj_p.power_el
                            });
                            continue;
                        }
                        obj_s = storages[s];
                        checkAndAdd(graph.nodes,obj_s.name);
                        var p_out_all = obj_s.p_out-obj_s.p_in;
                        if (obj_s.name === "Batterie" && p_out_all > 0) {
                            graph.links.push({source: obj_s.name, target: "Stromverbrauch", value: p_out_all});
                            if (p_out_all + obj_p.power_el < consumption.electrical) {
                                graph.links.push({
                                    source: "Netz",
                                    target: "Stromverbrauch",
                                    value: consumption.electrical - obj_p.power_el - p_out_all
                                });
                            }
                        }
                        else graph.links.push({
                            source: "Netz",
                            target: "Stromverbrauch",
                            value: consumption.electrical - obj_p.power_el
                        });
                    }
                }
            }
        }

        //Wärme
        if(obj_p.power_h !== 0){
            //production>consumption
            if(obj_p.power_h > consumption.dhw + consumption.heat) {
                graph.links.push({source: obj_p.name, target: "Warmwasser", value: consumption.dhw});
                graph.links.push({source: obj_p.name, target: "Heizung", value: consumption.heat});

                //check, if storages are available
                for (s in storages) {
                    if (!storages.hasOwnProperty(s)) {
                        graph.links.push({
                            source: obj_p.name,
                            target: "Ungenutzte Wärme",
                            value: obj_p.power_h - consumption.dhw - consumption.heat
                        });
                        continue;
                    }
                    obj_s = storages[s];
                    checkAndAdd(graph.nodes,obj_s.name);
                    p_in_all = obj_s.p_in-obj_s.p_out;
                    if (obj_s.name === "Wärmespeicher" && p_in_all > 0) {
                        graph.links.push({source: obj_p.name, target: obj_s.name, value: p_in_all});
                        if (p_in_all + consumption.dhw + consumption.heat < obj_p.power_h) {
                            graph.links.push({
                                source: obj_p.name,
                                target: "Ungenutzte Wärme",
                                value: obj_p.power_h - consumption.dhw - consumption.heat - p_in_all
                            });
                        }
                    }
                    else graph.links.push({
                        source: obj_p.name,
                        target: "Ungenutzte Wärme",
                        value: obj_p.power_h - consumption.dhw - consumption.heat
                    });
                }
            }
            //production<=consumption
            else{
                if(obj_p.power_h >= consumption.dhw){
                    graph.links.push({source: obj_p.name, target: "Warmwasser", value: consumption.dhw});
                    if(obj_p.power_h - consumption.dhw >= consumption.heat){
                        graph.links.push({source: obj_p.name, target: "Heizung", value: consumption.heat});
                    }
                    //production<consumption
                    else{
                        graph.links.push({source: obj_p.name, target: "Heizung", value: obj_p.power_h - consumption.dhw});

                        //check, if storages are available
                        for (s in storages) {
                            if (!storages.hasOwnProperty(s)) continue;
                            obj_s = storages[s];
                            checkAndAdd(graph.nodes,obj_s.name);
                            p_out_all = obj_s.p_out-obj_s.p_in;
                            if (obj_s.name === "Wärmespeicher" && p_out_all > 0) {
                                graph.links.push({source: obj_s.name, target: "Heizung", value: p_out_all});
                            }
                        }
                    }
                }
                //production<consumption
                else{
                    graph.links.push({source: obj_p.name, target: "Warmwasser", value: obj_p.power_h});

                    //check, if storages are available
                    for (s in storages) {
                        if (!storages.hasOwnProperty(s)) continue;
                        obj_s = storages[s];
                        checkAndAdd(graph.nodes,obj_s.name);
                        p_out_all = obj_s.p_out-obj_s.p_in;
                        if (obj_s.name === "Wärmespeicher" && p_out_all > 0) {
                            graph.links.push({
                                source: obj_s.name,
                                target: "Warmwasser",
                                value: consumption.dhw - obj_p.power_h
                            });
                            graph.links.push({
                                source: obj_s.name,
                                target: "Heizung",
                                value: p_out_all - consumption.dhw + obj_p.power_h
                            });
                        }
                    }
                }
            }
        }
    }
    if(production_el === 0) graph.links.push({source: "Netz", target: "Stromverbrauch", value: consumption.electrical});

    return graph;
}

function checkAndAdd(arr,name) {
    var found = arr.some(function (el) {
        return el.name === name;
    });
    if (!found) { arr.push({ name: name }); }
}
