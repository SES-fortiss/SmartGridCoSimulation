var data_history_p = [
        [
            {name: "Strom", values: []},
            {name: "Heizung", values: []},
            {name: "Warmwasser", values: []}
        ],
        [],
        []
    ];

function createHistoryProfileChart() {
    var x = new Array(3),
        y = new Array(3),
        z = new Array(3),
        series = new Array(3),
        line = new Array(3),
        chart = new Array(3),
        xAxis  = new Array(3),
        yAxis = new Array(3);

    // chart consumption
    x[0] = d3.scaleTime().range([0, width]);
    y[0] = d3.scaleLinear().range([height, 0]);
    z[0] = d3.scaleOrdinal(d3.schemeCategory10);

    line[0] = d3.line()
        .curve(d3.curveLinear)
        .x(function (d) {
            return x[0](d.x);
        })
        .y(function (d) {
            return y[0](d.y);
        });

    chart[0] = d3.select("#profile_consumption").append("p").append("svg")
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

    series[0] = chart[0].selectAll(".series")
        .data(data_history_p[0])
        .enter().append("g")
        .attr("class", "series");
    series[0].append("path")
        .attr("class", "line")
        .attr("id", function (d) {
            return d.name;
        })
        .attr("d", function (d) {
            return line[0](d.values);
        })
        .style("stroke", function (d) {
            return z[0](d.name);
        })
        .style("fill", "none");

    chart[0].append("text")
        .attr("class", "title")
        .attr("x", (width / 2))
        .attr("y", 0 - (margin.top / 2))
        .text("Verbrauch");


    // chart production - Strom
    x[1] = d3.scaleTime().range([0, width]);
    y[1] = d3.scaleLinear().range([height, 0]);
    z[1] = d3.scaleOrdinal(d3.schemeCategory10);

    line[1] = d3.line()
        .curve(d3.curveLinear)
        .x(function (d) {
            return x[1](d.x);
        })
        .y(function (d) {
            return y[1](d.y);
        });

    chart[1] = d3.select("#profile_production_el").append("p").append("svg")
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
        .text("Produktion - Strom");


    // chart production - Wärme
    x[2] = d3.scaleTime().range([0, width]);
    y[2] = d3.scaleLinear().range([height, 0]);
    z[2] = d3.scaleOrdinal(d3.schemeCategory10);

    line[2] = d3.line()
        .curve(d3.curveLinear)
        .x(function (d) {
            return x[2](d.x);
        })
        .y(function (d) {
            return y[2](d.y);
        });

    chart[2] = d3.select("#profile_production_h").append("p").append("svg")
        .attr("width", width + margin.left + margin.right)
        .attr("height", height + margin.top + margin.bottom)
        .append("g")
        .attr("transform", "translate(" + margin.left + "," + margin.top + ")");

    xAxis[2] = chart[2].append("g")
        .attr("class", "x axis")
        .attr("transform", "translate(0," + height + ")")
        .call(x[2].axis = d3.axisBottom(x[2]).tickFormat(multiFormat));

    yAxis[2] = chart[2].append("g")
        .attr("class", "y axis")
        .call(y[2].axis = d3.axisLeft(y[2]));

    chart[2].append("text")
        .attr("class", "title")
        .attr("x", (width / 2))
        .attr("y", 0 - (margin.top / 2))
        .text("Produktion - Wärme");

    for (var i = 0; i < 3; i++){
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

    if(building_id&&start_date&&end_date) requestProfileData(building_id,start_date,end_date,x,y,z,series,line,chart,xAxis,yAxis);
}

function sortByDateAscending(a, b) {
    return a.x - b.x;
}

function requestProfileData(building, start_time, end_time,x,y,z,series,line,chart,xAxis,yAxis) {
    $.getJSON(rest_url+"/rest/getdata/"+building+"/"+start_time+"/"+end_time, function(result){
        data_history_p = [
            [
                {name: "Strom", values: []},
                {name: "Heizung", values: []},
                {name: "Warmwasser", values: []}
            ],
            [],
            []
        ];

        for (var i = 0; i < result.length; i++) {
            var dataJSON = JSON.parse(result[i]);
            var currentTime = new Date(dataJSON.currentTime.date.year, dataJSON.currentTime.date.month-1,
                dataJSON.currentTime.date.day, dataJSON.currentTime.time.hour, dataJSON.currentTime.time.minute,
                dataJSON.currentTime.time.second, 0);

            // add producers
            if (data_history_p[1].length === 0 && data_history_p[2].length === 0) {
                for (var p1 in dataJSON.producers) {
                    if (!dataJSON.producers.hasOwnProperty(p1)) continue;
                    var obj1 = dataJSON.producers[p1];
                    if (obj1.name === "PV") {
                        data_history_p[1].push({name: obj1.name, values: []});
                    }
                    else if (obj1.name === "BHKW") {
                        data_history_p[1].push({name: obj1.name, values: []});
                        data_history_p[2].push({name: obj1.name, values: []});
                    }
                    else data_history_p[2].push({name: obj1.name, values: []});
                }

                series[1] = chart[1].selectAll(".series")
                    .data(data_history_p[1])
                    .enter().append("g")
                    .attr("class", "series");
                series[1].append("path")
                    .attr("class", "line")
                    .attr("id", function (d) {
                        return d.name;
                    })
                    .attr("d", function (d) {
                        return line[1](d.values);
                    })
                    .style("stroke", function (d) {
                        return z[1](d.name);
                    })
                    .style("fill", "none");

                series[2] = chart[2].selectAll(".series")
                    .data(data_history_p[2])
                    .enter().append("g")
                    .attr("class", "series");
                series[2].append("path")
                    .attr("class", "line")
                    .attr("id", function (d) {
                        return d.name + "_h";
                    })
                    .attr("d", function (d) {
                        return line[2](d.values);
                    })
                    .style("stroke", function (d) {
                        return z[2](d.name);
                    })
                    .style("fill", "none");
            }
            // add new data points
            data_history_p[0][0].values.push({x:currentTime, y:dataJSON.consumption.electrical});
            data_history_p[0][1].values.push({x:currentTime, y:dataJSON.consumption.heat});
            data_history_p[0][2].values.push({x:currentTime, y:dataJSON.consumption.dhw});

            // producers
            for (var p in dataJSON.producers) {
                if (!dataJSON.producers.hasOwnProperty(p)) continue;
                var obj = dataJSON.producers[p];

                for (var l = 0; l < data_history_p[1].length; l++) {
                    if (data_history_p[1][l].name === obj.name) {
                        data_history_p[1][l].values.push({x: currentTime, y: obj.power_el});
                    }
                }
                for (var m = 0; m < data_history_p[2].length; m++) {
                    if (data_history_p[2][m].name === obj.name) {
                        data_history_p[2][m].values.push({x: currentTime, y: obj.power_h});
                    }
                }
            }
        }


        for (var j = 0; j < 3; j++) {
            (function (j) {
                // sort data
                for (var k = 0; k < data_history_p[j].length; k++) {
                    data_history_p[j][k].values = data_history_p[j][k].values.sort(sortByDateAscending);
                }

                // set domains
                y[j].domain([
                    0,
                    d3.max(data_history_p[j], function (d) {
                        return d3.max(d.values, function (d) {
                            return d.y;
                        });
                    }) * 1.3
                ]);

                x[j].domain(d3.extent(data_history_p[0][0].values, function (d) {
                    return d.x;
                }));

                // redraw the line
                series[j].select(".line")
                    .data(data_history_p[j])
                    .attr("d", function (d) {
                        return line[j](d.values);
                    });

                // update axis
                xAxis[j].call(x[j].axis);
                yAxis[j].call(y[j].axis);

                // draw legend
                createLegendProfile(chart[j], line[j], z[j], data_history_p[j]);
            })(j);
        }
    });
}
