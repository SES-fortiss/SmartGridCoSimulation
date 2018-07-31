function createLegendProfile(chart, line, z, data){

    var svg = chart.select(function() {
        return this.parentNode;
    });

    var legend = svg.selectAll('.legend')
        .data([1])
        .enter()
        .append('g')
        .attr('class', 'legend')
        .attr('transform', 'translate(' + legendRectSize + ',' + (4*legendRectSize + legendSpacing) + ')');

    legend.append('rect')
        .attr('width', legendRectSize)
        .attr('height', legendRectSize)
        .attr('opacity', 1)
        .style('fill', '#000000')
        .style('stroke', '#000000')
        .on("click", handleClickAll);

    legend.append('text')
        .attr('x', legendRectSize + legendSpacing)
        .attr('y', legendRectSize - legendSpacing)
        .text('Alle');

    legend.append('line')
        .attr('x1', 0)
        .attr('y1', legendRectSize + 3*legendSpacing)
        .attr('x2', 100)
        .attr('y2', legendRectSize + 3*legendSpacing)
        .attr("stroke-width", 1)
        .attr("stroke", "black");

    var legend_2 = svg.selectAll('.legend_2')
        .data(data)
        .enter()
        .append('g')
        .attr('class', 'legend_2')
        .attr('transform', function(d, i) {
            var height = legendRectSize + legendSpacing;
            var offset =  6*height;
            return 'translate(' + legendRectSize + ',' + (i*height + offset) + ')';
        });

    legend_2.append('rect')
        .attr('width', legendRectSize)
        .attr('height', legendRectSize)
        .attr('opacity', 1)
        .style('fill', function(d) { return z(d.name); })
        .style('stroke', function(d) { return z(d.name); })
        .on("click", handleClick);

    legend_2.append('text')
        .attr('x', legendRectSize + legendSpacing)
        .attr('y', legendRectSize - legendSpacing)
        .text(function(d) { return d.name; });

    function handleClickAll(){
        if (d3.select(this).attr('opacity') === '1') {
            chart.selectAll(".line")
                .attr("opacity", 0);
            svg.selectAll("g[class*='legend']").select('rect')
                .attr("opacity", 0.2);
        }
        else {
            chart.selectAll(".line")
                .attr("opacity", 1);
            svg.selectAll("g[class*='legend']").select('rect')
                .attr("opacity", 1);
        }
    }

    function handleClick(datum, i) {
        if (d3.select(this).attr('opacity') === '1') {
            chart.selectAll(".line").filter(function(d) {return d.name === datum.name})
                .attr("opacity", 0);
            d3.select(this)
                .attr("opacity", 0.2);
            svg.selectAll('.legend').select('rect')
                .attr("opacity", 0.2);
        }
        else {
            chart.selectAll(".line").filter(function(d) {return d.name === datum.name})
                .attr("opacity", 1);
            d3.select(this)
                .attr("opacity", 1);

            var num_active = svg.selectAll(".legend_2").select('rect').filter(function(){return d3.select(this).attr("opacity") === '1';}).size();
            if (num_active === data.length){
                svg.selectAll('.legend').select('rect')
                    .attr("opacity", 1);
            }
        }
    }
}