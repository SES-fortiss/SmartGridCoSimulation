function createLegendArea(chart, series_c, series_p, stack_c, stack_p, z, data, keys_c, keys_p){

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

    legend.append('text')
        .attr('x', legendSpacing)
        .attr('y', 3*legendRectSize + legendSpacing)
        .attr('font-weight', 'bold')
        .text('Verbrauch');

    var vert_c;
    var legend_c = svg.selectAll('.legend_c')
        .data(series_c)
        .enter()
        .append('g')
        .attr('class', 'legend_c')
        .attr('transform', function(d, i) {
            var height = legendRectSize + legendSpacing;
            var offset =  7*height;
            var horz = legendRectSize;
            vert_c = i * height + offset;
            return 'translate(' + horz + ',' + vert_c + ')';
        });

    legend_c.append('rect')
        .attr('width', legendRectSize)
        .attr('height', legendRectSize)
        .attr('opacity', 1)
        .style('fill', function(d) { return z(d.key); })
        .style('stroke', function(d) { return z(d.key); })
        .on("click", handleClick);

    legend_c.append('text')
        .attr('x', legendRectSize + legendSpacing)
        .attr('y', legendRectSize - legendSpacing)
        .text(function(d) {
            if(d.key === 'BatterieC') {
                return "Batterie";
            }
            else if(d.key === 'WärmespeicherC') {
                return "Wärmespeicher";
            }
            else {
                return d.key;
            }
        });

    var legend_c_end = d3.selectAll('.legend_c').filter(function(d){return (d.key===keys_c[keys_c.length-1])});
    legend_c_end.append('line')
        .attr('x1', 0)
        .attr('y1', legendRectSize + 3*legendSpacing)
        .attr('x2', 100)
        .attr('y2', legendRectSize + 3*legendSpacing)
        .attr("stroke-width", 1)
        .attr("stroke", "black");

    legend_c_end.append('text')
        .attr('x', legendSpacing)
        .attr('y', 3*legendRectSize + legendSpacing)
        .attr('font-weight', 'bold')
        .text('Produktion');

    var legend_p = svg.selectAll('.legend_p')
        .data(series_p)
        .enter()
        .append('g')
        .attr('class', 'legend_p')
        .attr('transform', function(d, i) {
            var height = legendRectSize + legendSpacing;
            var offset =  2*height + 3*legendSpacing;
            var horz = legendRectSize;
            var vert = (i+1) * height + vert_c + offset;
            return 'translate(' + horz + ',' + vert + ')';
        });

    legend_p.append('rect')
        .attr('width', legendRectSize)
        .attr('height', legendRectSize)
        .attr('opacity', 1)
        .style('fill', function(d) { return z(d.key); })
        .style('stroke', function(d) { return z(d.key); })
        .on("click", handleClick);

    legend_p.append('text')
        .attr('x', legendRectSize + legendSpacing)
        .attr('y', legendRectSize - legendSpacing)
        .text(function(d) {
            if(d.key === 'BatterieP') {
                return "Batterie";
            }
            else if(d.key === 'WärmespeicherP') {
                return "Wärmespeicher";
            }
            else {
                return d.key;
            }
        });


    function handleClickAll(){
        if (d3.select(this).attr('opacity') === '1') {
            chart.selectAll("path[class*='area']")
                .attr("opacity", 0);
            svg.selectAll("g[class*='legend']").select('rect')
                .attr("opacity", 0.2);
        }
        else {
            chart.selectAll("path[class*='area']")
                .attr("opacity", 1);
            svg.selectAll("g[class*='legend']").select('rect')
                .attr("opacity", 1);
        }
    }

    function handleClick(datum, i) {
        if (d3.select(this).attr('opacity') === '1') {
            chart.selectAll("path[class*='area']").filter(function(d) {return d.key === datum.key})
                .attr("opacity", 0);
            d3.select(this)
                .attr("opacity", 0.2);
            svg.selectAll('.legend').select('rect')
                .attr("opacity", 0.2);
        }
        else {
            chart.selectAll("path[class*='area']").filter(function(d) {return d.key === datum.key})
                .attr("opacity", 1);
            d3.select(this)
                .attr("opacity", 1);

            var num_active = svg.selectAll("g[class*='legend_']").select('rect').filter(function(){return d3.select(this).attr("opacity") === '1';}).size();
            if (num_active === keys_c.length+keys_p.length){
                svg.selectAll('.legend').select('rect')
                    .attr("opacity", 1);
            }


        }
    }
}