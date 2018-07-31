var data_history = [[],[]];

function createHistoryAreaChart(){
    var x = new Array(2),
        y = new Array(2),
        z = new Array(2),
        area = new Array(2),
        chart = new Array(2),
        xAxis  = new Array(2),
        yAxis = new Array(2);

    // chart Strom
    x[0] = d3.scaleTime().range([0, width]);
    y[0] = d3.scaleLinear().range([height, 0]);
    z[0] = d3.scaleOrdinal(d3.schemeCategory10);

    area[0] = d3.area()
        .x(function(d) { return x[0](d.data.x); })
        .y0(function(d) { return y[0](d[0]); })
        .y1(function(d) { return y[0](d[1]); });

    chart[0] = d3.select("#area_electricity").append("p").append("svg")
        .attr("width", width + margin.left + margin.right)
        .attr("height", height + margin.top + margin.bottom)
        .append("g")
        .attr("transform", "translate(" + margin.left + "," + margin.top + ")");

    xAxis[0] = chart[0].append("g")
        .attr("class", "x axis")
        .attr("transform", "translate(0," + height + ")")
        .call(x[0].axis = d3.axisBottom(x[0]).tickFormat(multiFormat));

    yAxis[0] = chart[0].append("g")
        .attr("class", "y axis")
        .call(y[0].axis = d3.axisLeft(y[0]));

    chart[0].append("text")
        .attr("class", "title")
        .attr("x", (width / 2))
        .attr("y", 0 - (margin.top / 2))
        .text("Strom");

    // chart Wärme
    x[1] = d3.scaleTime().range([0, width]);
    y[1] = d3.scaleLinear().range([height, 0]);
    z[1] = d3.scaleOrdinal(d3.schemeCategory10);

    area[1] = d3.area()
        .x(function(d) { return x[1](d.data.x); })
        .y0(function(d) { return y[1](d[0]); })
        .y1(function(d) { return y[1](d[1]); });

    chart[1] = d3.select("#area_heat").append("p").append("svg")
        .attr("width", width + margin.left + margin.right)
        .attr("height", height + margin.top + margin.bottom)
        .append("g")
        .attr("transform", "translate(" + margin.left + "," + margin.top + ")");

    xAxis[1] = chart[1].append("g")
        .attr("class", "x axis")
        .attr("transform", "translate(0," + height + ")")
        .call(x[1].axis = d3.axisBottom(x[1]).tickFormat(multiFormat));

    yAxis[1] = chart[1].append("g")
        .attr("class", "y axis")
        .call(y[1].axis = d3.axisLeft(y[1]));

    chart[1].append("text")
        .attr("class", "title")
        .attr("x", (width / 2))
        .attr("y", 0 - (margin.top / 2))
        .text("Wärme");

    for (var i = 0; i < 2; i++){
        var svg = chart[i].select(function() {
            return this.parentNode;
        });

        svg.append("text")
            .attr("transform", "rotate(-90)")
            .attr("y", 140)
            .attr("x", -250)
            .attr("dy", "1em")
            .style("text-anchor", "middle")
            .text("kW");
    }

    if(building_id&&start_date&&end_date) requestAreaData(building_id,start_date,end_date,x,y,z,area,chart,xAxis,yAxis);

}

function sortByDateAscending(a, b) {
    return a.x - b.x;
}

function requestAreaData(building,start_time,end_time,x,y,z,area,chart,xAxis,yAxis) {
    $.getJSON(rest_url+"/rest/getdata/"+building+"/"+start_time+"/"+end_time, function(result){
        // *_p = Produktion
        // *_c = Verbrauch

        data_history = [[],[]];

        var keys_p = [[],[]],
            keys_c = [["Strom"],["Heizung", "Warmwasser"]],
            series_c = new Array(2),
            series_p = new Array(2),
            stack_c = new Array(2),
            stack_p = new Array(2);

        for (var i = 0; i < result.length; i++) {

            var dataJSON = JSON.parse(result[i]);
            var currentTime = new Date(dataJSON.currentTime.date.year, dataJSON.currentTime.date.month-1,
                dataJSON.currentTime.date.day, dataJSON.currentTime.time.hour, dataJSON.currentTime.time.minute,
                dataJSON.currentTime.time.second,0);

            data_history[0].push({x: currentTime, values: []});
            data_history[1].push({x: currentTime, values: []});

            // add new data points
            data_history[0][i].values.push({name:"Strom", y:dataJSON.consumption.electrical});
            data_history[1][i].values.push({name:"Heizung", y:dataJSON.consumption.heat});
            data_history[1][i].values.push({name:"Warmwasser", y:dataJSON.consumption.dhw});

            // add producers
            for (var p1 in dataJSON.producers) {
                if (!dataJSON.producers.hasOwnProperty(p1)) continue;
                var obj1_p = dataJSON.producers[p1];
                if (obj1_p.name === "PV") {
                    if (!keys_p[0].includes("PV")) {keys_p[0].push("PV");}
                    data_history[0][i].values.push({name:"PV", y: obj1_p.power_el});
                }
                else if (obj1_p.name === "BHKW") {
                    if (!keys_p[0].includes("BHKW")) {keys_p[0].push("BHKW");}
                    data_history[0][i].values.push({name:"BHKW", y: obj1_p.power_el});
                    if (!keys_p[1].includes("BHKW")) {keys_p[1].push("BHKW");}
                    data_history[1][i].values.push({name:"BHKW", y: obj1_p.power_h});
                }
                else {
                    if (!keys_p[1].includes(obj1_p.name)) {keys_p[1].push(obj1_p.name);}
                    data_history[1][i].values.push({name:obj1_p.name, y: obj1_p.power_h});
                }
            }

            // add storages
            for (var s1 in dataJSON.storages) {
                if (!dataJSON.storages.hasOwnProperty(s1)) continue;
                var obj1_s = dataJSON.storages[s1];
                if (obj1_s.name === "Batterie") {
                    if (!keys_c[0].includes("BatterieC")) {
                        keys_c[0].push("BatterieC");
                    }
                    data_history[0][i].values.push({name: "BatterieC", y: obj1_s.p_in});

                    if (!keys_p[0].includes("BatterieP")) {
                        keys_p[0].push("BatterieP");
                    }
                    data_history[0][i].values.push({name: "BatterieP", y: obj1_s.p_out});
                }
                else {
                    if (!keys_c[1].includes("WärmespeicherC")) {
                        keys_c[1].push("WärmespeicherC");
                    }
                    data_history[1][i].values.push({name: "WärmespeicherC", y: obj1_s.p_in});

                    if (!keys_p[1].includes("WärmespeicherP")) {
                        keys_p[1].push("WärmespeicherP");
                    }
                    data_history[1][i].values.push({name: "WärmespeicherP", y: obj1_s.p_out});
                }
            }
        }

        for (var j = 0; j < 2; j++){
            (function (j) {
                stack_c[j] = d3.stack()
                    .keys(keys_c[j])
                    .value(function (d, key) {
                        var map_a = d3.map(d.values, function (p) {
                            return p.name
                        });
                        var obj = map_a.get(key);
                        return obj.y;
                    });

                stack_p[j] = d3.stack()
                    .keys(keys_p[j])
                    .value(function (d, key) {
                        var map_a = d3.map(d.values, function (p) {
                            return p.name
                        });
                        var obj = map_a.get(key);
                        return obj.y;
                    });

                data_history[j] = data_history[j].sort(sortByDateAscending);

                series_c[j] = stack_c[j](data_history[j]);
                series_p[j] = stack_p[j](data_history[j]);

                y[j].domain([
                    0,
                    d3.max(data_history[j], function (d) {
                        return d3.max(d.values, function (p) {
                            return p.y
                        });
                    }) * 1.3
                ]);
                x[j].domain(d3.extent(data_history[j], function (d) {
                    return d.x;
                }));

                var layer_c = chart[j].selectAll(".layer_c" + (j + 1))
                    .data(series_c[j])
                    .enter().append("g")
                    .attr("class", "layer_c" + (j + 1));

                layer_c.append("path")
                    .attr("class", "area" + (j + 1) + "_c")
                    .attr("opacity", 1)
                    .style("fill", function (d) {
                        return z[j](d.key);
                    })
                    .style("stroke", function (d) {
                        return z[j](d.key);
                    })
                    .attr("d", area[j]);

                var layer_p = chart[j].selectAll(".layer_p" + (j + 1))
                    .data(series_p[j])
                    .enter().append("g")
                    .attr("class", "layer_p" + (j + 1));

                layer_p.append("path")
                    .attr("class", "area" + (j + 1) + "_p")
                    .attr("opacity", 1)
                    .style("fill", function (d) {
                        return z[j](d.key);
                    })
                    .style("stroke", function (d) {
                        return z[j](d.key);
                    })
                    .attr("d", area[j]);

                xAxis[j].call(x[j].axis);
                yAxis[j].call(y[j].axis);

                createLegendArea(chart[j],series_c[j],series_p[j],stack_c[j],stack_p[j],z[j],data_history[j],keys_c[j],keys_p[j]);
            })(j);
        }
    });
}

