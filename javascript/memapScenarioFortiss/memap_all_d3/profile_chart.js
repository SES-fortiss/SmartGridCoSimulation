function createChart_p() {
    var n = 1;
    var data1 = [
            {name: "Strom", values: []},
            {name: "Heizung", values: []},
            {name: "Warmwasser", values: []}
        ],
        data2 = [],
        data3 = [];

    var margin = {top: 60, right: 20, bottom: 20, left: 50},
        width = 960 - margin.right,
        height = 300 - margin.top - margin.bottom;


    // chart consumption
    var x1 = d3.scaleTime().range([0, width]),
        y1 = d3.scaleLinear().range([height, 0]),
        z1 = d3.scaleOrdinal(d3.schemeCategory10);

    var line1 = d3.line()
        .curve(d3.curveLinear)
        .x(function (d) {
            return x1(d.x);
        })
        .y(function (d) {
            return y1(d.y);
        });

    var chart1 = d3.select("#consumption").append("p").append("svg")
        .attr("width", width + margin.left + margin.right)
        .attr("height", height + margin.top + margin.bottom)
        .style("margin-left", margin.left + "px")
        .append("g")
        .attr("transform", "translate(" + margin.left + "," + margin.top + ")");

    var xAxis1 = chart1.append("g")
        .attr("class", "x axis")
        .attr("transform", "translate(0," + height + ")")
        .call(x1.axis = d3.axisBottom(x1).tickFormat(multiFormat));

    var yAxis1 = chart1.append("g")
        .attr("class", "y axis")
        .call(y1.axis = d3.axisLeft(y1));

    var series1 = chart1.selectAll(".series")
        .data(data1)
        .enter().append("g")
        .attr("class", "series");
    series1.append("path")
        .attr("class", "line")
        .attr("id", function (d) {
            return d.name;
        })
        .attr("d", function (d) {
            return line1(d.values);
        })
        .attr("data-legend", function (d) {
            return d.name
        })
        .style("stroke", function (d) {
            return z1(d.name);
        })
        .style("fill", "none");

    var legend1 = chart1.append("g")
        .attr("class", "legend")
        .attr("transform", "translate(50,0)")
        .style("font-size", "12px")
        .call(d3.legend);

    chart1.append("text")
        .attr("class", "title")
        .attr("x", (width / 2))
        .attr("y", 0 - (margin.top / 2))
        .text("Verbrauch");


    // chart production - Wärme
    var x2 = d3.scaleTime().range([0, width]),
        y2 = d3.scaleLinear().range([height, 0]),
        z2 = d3.scaleOrdinal(d3.schemeCategory10);

    var line2 = d3.line()
        .curve(d3.curveLinear)
        .x(function (d) {
            return x2(d.x);
        })
        .y(function (d) {
            return y2(d.y);
        });

    var chart2 = d3.select("#production_el").append("p").append("svg")
        .attr("width", width + margin.left + margin.right)
        .attr("height", height + margin.top + margin.bottom)
        .style("margin-left", margin.left + "px")
        .append("g")
        .attr("transform", "translate(" + margin.left + "," + margin.top + ")");

    var xAxis2 = chart2.append("g")
        .attr("class", "x axis")
        .attr("transform", "translate(0," + height + ")")
        .call(x2.axis = d3.axisBottom(x2).tickFormat(multiFormat));

    var yAxis2 = chart2.append("g")
        .attr("class", "y axis")
        .call(y2.axis = d3.axisLeft(y2));

    var series2;

    var legend2 = chart2.append("g")
        .attr("class", "legend")
        .attr("transform", "translate(50,0)")
        .style("font-size", "12px")
        .call(d3.legend);

    chart2.append("text")
        .attr("class", "title")
        .attr("x", (width / 2))
        .attr("y", 0 - (margin.top / 2))
        .text("Produktion - Strom");


    // chart production - Wärme
    var x3 = d3.scaleTime().range([0, width]),
        y3 = d3.scaleLinear().range([height, 0]),
        z3 = d3.scaleOrdinal(d3.schemeCategory10);

    var line3 = d3.line()
        .curve(d3.curveLinear)
        .x(function (d) {
            return x3(d.x);
        })
        .y(function (d) {
            return y3(d.y);
        });

    var chart3 = d3.select("#production_h").append("p").append("svg")
        .attr("width", width + margin.left + margin.right)
        .attr("height", height + margin.top + margin.bottom)
        .style("margin-left", margin.left + "px")
        .append("g")
        .attr("transform", "translate(" + margin.left + "," + margin.top + ")");

    var xAxis3 = chart3.append("g")
        .attr("class", "x axis")
        .attr("transform", "translate(0," + height + ")")
        .call(x3.axis = d3.axisBottom(x3).tickFormat(multiFormat));

    var yAxis3 = chart3.append("g")
        .attr("class", "y axis")
        .call(y3.axis = d3.axisLeft(y3));

    var series3;

    var legend3 = chart3.append("g")
        .attr("class", "legend")
        .attr("transform", "translate(50,0)")
        .style("font-size", "12px")
        .call(d3.legend);

    chart3.append("text")
        .attr("class", "title")
        .attr("x", (width / 2))
        .attr("y", 0 - (margin.top / 2))
        .text("Produktion - Wärme");


    var transition = d3.select({}).transition()
        .duration(1000)
        .ease(d3.easeLinear);

    (function update() {
        transition = transition.each(function () {
            var request1 = d3.json(building_url),
                request2 = d3.json("http://localhost:8100");

            Promise.all([request1, request2]).then(function (values) {
                // add producers
                if (data2.length === 0) {
                    for (var p1 in values[0].producers) {
                        if (!values[0].producers.hasOwnProperty(p1)) continue;
                        var obj1 = values[0].producers[p1];
                        if (obj1.name === "PV") {
                            data2.push({name: obj1.name, values: []});
                        }
                        else if (obj1.name === "BHKW") {
                            data2.push({name: obj1.name, values: []});
                            data3.push({name: obj1.name, values: []});
                        }
                        else data3.push({name: obj1.name, values: []});
                    }

                    series2 = chart2.selectAll(".series")
                        .data(data2)
                        .enter().append("g")
                        .attr("class", "series");
                    series2.append("path")
                        .attr("class", "line")
                        .attr("id", function (d) {
                            return d.name;
                        })
                        .attr("d", function (d) {
                            return line2(d.values);
                        })
                        .attr("data-legend", function (d) {
                            return d.name
                        })
                        .style("stroke", function (d) {
                            return z2(d.name);
                        })
                        .style("fill", "none");

                    series3 = chart3.selectAll(".series")
                        .data(data3)
                        .enter().append("g")
                        .attr("class", "series");
                    series3.append("path")
                        .attr("class", "line")
                        .attr("id", function (d) {
                            return d.name + "_h";
                        })
                        .attr("d", function (d) {
                            return line3(d.values);
                        })
                        .attr("data-legend", function (d) {
                            return d.name
                        })
                        .style("stroke", function (d) {
                            return z3(d.name);
                        })
                        .style("fill", "none");
                }

                var currentTime = values[1].currentTime;
                var now = new Date(currentTime.date.year, currentTime.date.month, currentTime.date.day, currentTime.time.hour, currentTime.time.minute, currentTime.time.second);

                var time_begin = new Date(now.getTime());
                time_begin.setMinutes(now.getMinutes() - n);

                // add new data points
                data1[0].values.push({x: now, y: values[0].consumption.electrical});
                data1[1].values.push({x: now, y: values[0].consumption.heat});
                data1[2].values.push({x: now, y: values[0].consumption.dhw});

                for (var p in values[0].producers) {
                    if (!values[0].producers.hasOwnProperty(p)) continue;
                    var obj = values[0].producers[p];

                    for (i = 0; i < data2.length; i++) {
                        if (data2[i].name === obj.name) {
                            data2[i].values.push({x: now, y: obj.power_el});
                        }
                    }
                    for (i = 0; i < data3.length; i++) {
                        if (data3[i].name === obj.name) {
                            data3[i].values.push({x: now, y: obj.power_h});
                        }
                    }
                }

                // storage
                for (var s in values[0].storages) {
                    if (!values[0].storages.hasOwnProperty(s)) continue;
                    var obj_s = values[0].storages[s];
                    if (needle === undefined) create_gauge();
                    needle.moveTo(obj_s.cur_capacity/obj_s.max_capacity);
                }


                // set domains
                y1.domain([
                    0,
                    d3.max(data1, function (d) {
                        return d3.max(d.values, function (d) {
                            return d.y;
                        });
                    }) * 1.3
                ]);
                y2.domain([
                    0,
                    d3.max(data2, function (d) {
                        return d3.max(d.values, function (d) {
                            return d.y;
                        });
                    }) * 1.3
                ]);
                y3.domain([
                    0,
                    d3.max(data3, function (d) {
                        return d3.max(d.values, function (d) {
                            return d.y;
                        });
                    }) * 1.3
                ]);

                x1.domain(d3.extent(data1[0].values, function (d) {
                    return d.x;
                }));
                x2.domain(d3.extent(data1[0].values, function (d) {
                    return d.x;
                }));
                x3.domain(d3.extent(data1[0].values, function (d) {
                    return d.x;
                }));

                // redraw the line
                series1.select(".line")
                //.attr("id",function(d){ return d.name; })
                    .attr("d", function (d) {
                        return line1(d.values);
                    })
                    .attr("data-legend", function (d) {
                        return d.name
                    })
                    .style("stroke", function (d) {
                        return z1(d.name);
                    })
                    .style("fill", "none")
                    .attr("transform", null);

                series2.select(".line")
                //.attr("id",function(d){ return d.name; })
                    .attr("d", function (d) {
                        return line2(d.values);
                    })
                    .attr("data-legend", function (d) {
                        return d.name
                    })
                    .style("stroke", function (d) {
                        return z2(d.name);
                    })
                    .style("fill", "none")
                    .attr("transform", null);

                series3.select(".line")
                //.attr("id",function(d){ return d.name; })
                    .attr("d", function (d) {
                        return line3(d.values);
                    })
                    .attr("data-legend", function (d) {
                        return d.name
                    })
                    .style("stroke", function (d) {
                        return z3(d.name);
                    })
                    .style("fill", "none")
                    .attr("transform", null);


                // update axis
                xAxis1.call(x1.axis);
                yAxis1.call(y1.axis);

                xAxis2.call(x2.axis);
                yAxis2.call(y2.axis);

                xAxis3.call(x3.axis);
                yAxis3.call(y3.axis);

                legend1.call(d3.legend);
                legend2.call(d3.legend);
                legend3.call(d3.legend);

                // pop the old data point off the front
                if (data1[0].values.length > n * 60) {
                    data1[0].values.shift();
                    data1[1].values.shift();
                    data1[2].values.shift();
                    for (i = 0; i < data2.length; i++) data2[i].values.shift();
                    for (i = 0; i < data3.length; i++) data3[i].values.shift();
                }
            });
        }).transition().on("start", update);
    })();
}

function show_p(){}