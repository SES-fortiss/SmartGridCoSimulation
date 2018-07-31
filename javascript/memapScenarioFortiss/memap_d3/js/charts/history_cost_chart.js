var data_cost = [];       //Kosten

function createHistoryCostChart(){

    var margin = {top: 60, right: 20, bottom: 120, left: 200},
        width = 1160 - margin.right,
        height = 500 - margin.top - margin.bottom;

    var x,y,z,xAxis,yAxis,area_pos,area_neg,chart;

    // chart Kosten
    x = d3.scaleTime().range([0, width]);
    y = d3.scaleLinear().range([height, 0]);
    z = d3.scaleOrdinal(d3.schemeCategory10);

    area_pos = d3.area()
        .x(function(d) { return x(d.x); })
        .y0(y(0))
        .y1(function(d) { return y(d.y); });


    area_neg = d3.area()
        .x(function(d) { return x(d.x); })
        .y1(y(0))
        .y0(function(d) { return y(d.y); });

    chart = d3.select("#cost").append("p").append("svg")
        .attr("width", width + margin.left + margin.right)
        .attr("height", height + margin.top + margin.bottom)
        .append("g")
        .attr("transform", "translate(" + margin.left + "," + margin.top + ")");

    xAxis = chart.append("g")
        .attr("class", "x axis")
        .attr("transform", "translate(0," + height + ")")
        .call(x.axis = d3.axisBottom(x).tickFormat(multiFormat));

    yAxis = chart.append("g")
        .attr("class", "y axis")
        .call(y.axis = d3.axisLeft(y));

    var svg = chart.select(function() {
        return this.parentNode;
    });

    svg.append("text")
        .attr("transform", "rotate(-90)")
        .attr("y", 150)
        .attr("x",-210)
        .style("text-anchor", "middle")
        .text("ct");

    if(building_id&&start_date&&end_date) requestCostData(building_id,start_date,end_date,x,y,z,xAxis,yAxis,area_pos,area_neg,chart);
}

function sortByDateAscending(a, b) {
    return a.x - b.x;
}

function requestCostData(building, start_time, end_time, x, y, z, xAxis, yAxis, area_pos, area_neg, chart) {
    $.getJSON(rest_url+"/rest/getdata/"+building+"/"+start_time+"/"+end_time, function(result) {
        data_cost = [];
        for (var i = 0; i < result.length; i++) {

            var dataJSON = JSON.parse(result[i]);
            var currentTime = new Date(dataJSON.currentTime.date.year, dataJSON.currentTime.date.month - 1,
                dataJSON.currentTime.date.day, dataJSON.currentTime.time.hour, dataJSON.currentTime.time.minute,
                dataJSON.currentTime.time.second, 0);

            var cost = 0;
            var production_el = 0;

            // producers
            for (var p1 in dataJSON.producers) {
                if (!dataJSON.producers.hasOwnProperty(p1)) continue;
                var obj_p = dataJSON.producers[p1];
                production_el += obj_p.power_el;
                cost += obj_p.cost;
            }

            for (var s in dataJSON.storages) {
                if (!dataJSON.storages.hasOwnProperty(s)) continue;
                var obj_s = dataJSON.storages[s];
                if (obj_s.name === "Batterie") {
                    production_el += obj_s.p_out;
                }
            }

            // Strom aus dem Netz / in das Netz
            cost += 30*(1/(60*60))*(dataJSON.consumption.electrical - production_el);

            data_cost.push({x: currentTime, y: cost*(-1)});
        }

        data_cost = data_cost.sort(sortByDateAscending);

        var data_pos = [];
        var data_neg = [];

        // copy array
        for (var j = 0; j < data_cost.length ; j++) {
            data_pos[j] = {};
            data_neg[j] = {};
            for (var prop in data_cost[j]) {
                if (!data_cost[j].hasOwnProperty(prop)) continue;
                data_pos[j][prop] = data_cost[j][prop];
                data_neg[j][prop] = data_cost[j][prop];
            }
        }

        data_pos.forEach(function(currentValue, index) {
            if (currentValue.y < 0) {
                data_pos[index].y = 0;
            }
        });

        data_neg.forEach(function(currentValue, index) {
            if (currentValue.y > 0) {
                data_neg[index].y = 0;
            }
        });

        var min_y = d3.min(data_cost, function(d) { return d.y })*1.3 > 0 ? 0 : d3.min(data_cost, function(d) { return d.y })*1.3;
        var max_y = d3.max(data_cost, function(d) { return d.y })*1.3 < 0 ? 0 : d3.max(data_cost, function(d) { return d.y })*1.3;

        y.domain([min_y, max_y]);
        x.domain(d3.extent(data_cost, function(d) { return d.x; }));

        chart.append("path")
            .datum(data_pos)
            .attr("class", "area")
            .attr("opacity", 1)
            .style("fill", 'green')
            .style("stroke", 'green')
            .attr("d", area_pos.y0(y(0)));

        chart.append("path")
            .datum(data_neg)
            .attr("class", "area")
            .attr("opacity", 1)
            .style("fill", 'red')
            .style("stroke", 'red')
            .attr("d", area_neg.y1(y(0)));

        xAxis.call(x.axis);
        yAxis.call(y.axis);

        var svg = chart.select(function() {
            return this.parentNode;
        });

        var mean = svg.append('g')
            .attr('class', 'mean')
            .attr('transform', 'translate(' + (1160/2 + 150) + ',450)');

        var mean_cost = d3.format(".2f")(d3.sum(data_cost, function (d) { return d.y; })/100);
        var text_color = mean_cost >= 0 ? 'green' : 'red';

        mean.append('text')
            .style("text-anchor", "middle")
            .text("Gesamtkosten:");

        mean.append('text')
            .attr('y', 30)
            .style("text-anchor", "middle")
            .style("stroke", text_color)
            .style("fill", text_color)
            .text(mean_cost + "€");
    });
}

