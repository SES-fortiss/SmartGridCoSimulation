var data_live = [
        [
            {name: "Strom", values: []},
            {name: "Heizung", values: []},
            {name: "Warmwasser", values: []}
        ],
        [],
        []
    ],
    needle;

var x_live = new Array(3),
    y_live = new Array(3),
    z_live = new Array(3),
    series_live = new Array(3),
    line_live = new Array(3),
    chart_live = new Array(3),
    xAxis_live  = new Array(3),
    yAxis_live = new Array(3),
    transition = d3.transition()
        .duration(990)
        .ease(d3.easeLinear);

var n = 1; // number of minutes until data shifts


function createLiveProfileChart() {

    // chart consumption
    x_live[0] = d3.scaleTime().range([0, width]);
    y_live[0] = d3.scaleLinear().range([height, 0]);
    z_live[0] = d3.scaleOrdinal(d3.schemeCategory10);

    line_live[0] = d3.line()
        .curve(d3.curveLinear)
        .x(function (d) {
            return x_live[0](d.x);
        })
        .y(function (d) {
            return y_live[0](d.y);
        });

    chart_live[0] = d3.select("#consumption").append("p").append("svg")
        .attr("width", width + margin.left + margin.right)
        .attr("height", height + margin.top + margin.bottom)
        .append("g")
        .attr("transform", "translate(" + margin.left + "," + margin.top + ")");

    xAxis_live[0] = chart_live[0].append("g")
        .attr("class", "x axis")
        .attr("transform", "translate(0," + height + ")")
        .call(x_live[0].axis = d3.axisBottom(x_live[0]).tickFormat(multiFormat));

    yAxis_live[0] = chart_live[0].append("g")
        .attr("class", "y axis")
        .call(y_live[0].axis = d3.axisLeft(y_live[0]));

    series_live[0] = chart_live[0].selectAll(".series")
        .data(data_live[0])
        .enter().append("g")
        .attr("class", "series");
    series_live[0].append("path")
        .attr("class", "line")
        .attr("id", function (d) {
            return d.name;
        })
        .attr("d", function (d) {
            return line_live[0](d.values);
        })
        .attr("data-legend", function (d) {
            return d.name
        })
        .style("stroke", function (d) {
            return z_live[0](d.name);
        })
        .style("fill", "none");

    chart_live[0].append("text")
        .attr("class", "title")
        .attr("x", (width / 2))
        .attr("y", 0 - (margin.top / 2))
        .text("Verbrauch");


    // chart production - Strom
    x_live[1] = d3.scaleTime().range([0, width]);
    y_live[1] = d3.scaleLinear().range([height, 0]);
    z_live[1] = d3.scaleOrdinal(d3.schemeCategory10);

    line_live[1] = d3.line()
        .curve(d3.curveLinear)
        .x(function (d) {
            return x_live[1](d.x);
        })
        .y(function (d) {
            return y_live[1](d.y);
        });

    chart_live[1] = d3.select("#production_el").append("p").append("svg")
        .attr("width", width + margin.left + margin.right)
        .attr("height", height + margin.top + margin.bottom)
        .append("g")
        .attr("transform", "translate(" + margin.left + "," + margin.top + ")");

    xAxis_live[1] = chart_live[1].append("g")
        .attr("class", "x axis")
        .attr("transform", "translate(0," + height + ")")
        .call(x_live[1].axis = d3.axisBottom(x_live[1]).tickFormat(multiFormat));

    yAxis_live[1] = chart_live[1].append("g")
        .attr("class", "y axis")
        .call(y_live[1].axis = d3.axisLeft(y_live[1]));

    chart_live[1].append("text")
        .attr("class", "title")
        .attr("x", (width / 2))
        .attr("y", 0 - (margin.top / 2))
        .text("Produktion - Strom");


    // chart production - Wärme
    x_live[2] = d3.scaleTime().range([0, width]);
    y_live[2] = d3.scaleLinear().range([height, 0]);
    z_live[2] = d3.scaleOrdinal(d3.schemeCategory10);

    line_live[2] = d3.line()
        .curve(d3.curveLinear)
        .x(function (d) {
            return x_live[2](d.x);
        })
        .y(function (d) {
            return y_live[2](d.y);
        });

    chart_live[2] = d3.select("#production_h").append("p").append("svg")
        .attr("width", width + margin.left + margin.right)
        .attr("height", height + margin.top + margin.bottom)
        .append("g")
        .attr("transform", "translate(" + margin.left + "," + margin.top + ")");

    xAxis_live[2] = chart_live[2].append("g")
        .attr("class", "x axis")
        .attr("transform", "translate(0," + height + ")")
        .call(x_live[2].axis = d3.axisBottom(x_live[2]).tickFormat(multiFormat));

    yAxis_live[2] = chart_live[2].append("g")
        .attr("class", "y axis")
        .call(y_live[2].axis = d3.axisLeft(y_live[2]));

    chart_live[2].append("text")
        .attr("class", "title")
        .attr("x", (width / 2))
        .attr("y", 0 - (margin.top / 2))
        .text("Produktion - Wärme");

    for (var i = 0; i < 3; i++){
        var svg = chart_live[i].select(function() {
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

    needle = undefined;

    if (building_url) update();
}

function update() {
    transition = transition.each(function () {
        var request1 = d3.json(building_url),
            request2 = d3.json(memap_url);

        Promise.all([request1, request2]).then(function (values) {
            // add producers
            var i, j;
            if (data_live[1].length === 0 && data_live[2].length === 0) {
                for (var p1 in values[0].producers) {
                    if (!values[0].producers.hasOwnProperty(p1)) continue;
                    var obj1 = values[0].producers[p1];
                    if (obj1.name === "PV") {
                        data_live[1].push({name: obj1.name, values: []});
                    }
                    else if (obj1.name === "BHKW") {
                        data_live[1].push({name: obj1.name, values: []});
                        data_live[2].push({name: obj1.name, values: []});
                    }
                    else data_live[2].push({name: obj1.name, values: []});
                }

                series_live[1] = chart_live[1].selectAll(".series")
                    .data(data_live[1])
                    .enter().append("g")
                    .attr("class", "series");
                series_live[1].append("path")
                    .attr("class", "line")
                    .attr("id", function (d) {
                        return d.name;
                    })
                    .attr("d", function (d) {
                        return line_live[1](d.values);
                    })
                    .attr("data-legend", function (d) {
                        return d.name
                    })
                    .style("stroke", function (d) {
                        return z_live[1](d.name);
                    })
                    .style("fill", "none");

                series_live[2] = chart_live[2].selectAll(".series")
                    .data(data_live[2])
                    .enter().append("g")
                    .attr("class", "series");
                series_live[2].append("path")
                    .attr("class", "line")
                    .attr("id", function (d) {
                        return d.name + "_h";
                    })
                    .attr("d", function (d) {
                        return line_live[2](d.values);
                    })
                    .attr("data-legend", function (d) {
                        return d.name
                    })
                    .style("stroke", function (d) {
                        return z_live[2](d.name);
                    })
                    .style("fill", "none");
            }

            var currentTime = values[1].currentTime;
            var now = new Date(currentTime.date.year, currentTime.date.month, currentTime.date.day, currentTime.time.hour, currentTime.time.minute, currentTime.time.second);

            var time_begin = new Date(now.getTime());
            time_begin.setMinutes(now.getMinutes() - n);

            // add new data points
            data_live[0][0].values.push({x: now, y: values[0].consumption.electrical});
            data_live[0][1].values.push({x: now, y: values[0].consumption.heat});
            data_live[0][2].values.push({x: now, y: values[0].consumption.dhw});

            for (var p in values[0].producers) {
                if (!values[0].producers.hasOwnProperty(p)) continue;
                var obj = values[0].producers[p];

                for (i = 0; i < data_live[1].length; i++) {
                    if (data_live[1][i].name === obj.name) {
                        data_live[1][i].values.push({x: now, y: obj.power_el});
                    }
                }
                for (i = 0; i < data_live[2].length; i++) {
                    if (data_live[2][i].name === obj.name) {
                        data_live[2][i].values.push({x: now, y: obj.power_h});
                    }
                }
            }

            // pop the old data point off the front
            if (data_live[0][0].values.length > n * 60) {
                data_live[0][0].values.shift();
                data_live[0][1].values.shift();
                data_live[0][2].values.shift();
                for (i = 0; i < data_live[1].length; i++) data_live[1][i].values.shift();
                for (i = 0; i < data_live[2].length; i++) data_live[2][i].values.shift();
            }

            // storage
            for (var s in values[0].storages) {
                if (!values[0].storages.hasOwnProperty(s)) continue;
                var obj_s = values[0].storages[s];
                if (needle === undefined) createGauge(obj_s.name);
                needle.moveTo(obj_s.cur_capacity / obj_s.max_capacity);
            }

            for (j = 0; j < 3; j++) {
                (function (j) {
                    // set domains
                    y_live[j].domain([
                        0,
                        d3.max(data_live[j], function (d) {
                            return d3.max(d.values, function (d) {
                                return d.y;
                            });
                        }) * 1.3
                    ]);

                    x_live[j].domain(d3.extent(data_live[0][0].values, function (d) {
                        return d.x;
                    }));

                    // redraw lines
                    series_live[j].select(".line")
                        .attr("d", function (d) {
                            return line_live[j](d.values);
                        })
                        .attr("data-legend", function (d) {
                            return d.name
                        })
                        .style("stroke", function (d) {
                            return z_live[j](d.name);
                        })
                        .style("fill", "none")
                        .attr("transform", null);

                    // update axis
                    xAxis_live[j].call(x_live[j].axis);
                    yAxis_live[j].call(y_live[j].axis);

                    // draw legend
                    createLegendProfile(chart_live[j], line_live[j], z_live[j], data_live[j]);
                })(j);
            }
        });
    }).transition().on("start", update);
}
