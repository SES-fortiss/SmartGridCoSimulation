function createGauge(storage_name){

    var barWidth, chart, chartInset, degToRad, repaintGauge,
        height, margin, padRad, percToDeg, percToRad,
        percent, radius, svg, totalPercent, width, label,
        arc1, arc2, arcStartRad, arcEndRad;

    percent = .4;
    padRad = 0.025;
    chartInset = 10;

    // Orientation of gauge:
    totalPercent = .75;

    var el = d3.select('#storage');

    margin = {
        top: 60,
        right: 20,
        bottom: 20,
        left: 20
    };

    width = 400 - margin.left - margin.right;
    height = width;
    radius = Math.min(width, height) / 2;
    barWidth = 40 * width / 300;


    /*
      Utility methods
    */
    percToDeg = function(perc) {
        return perc * 360;
    };

    percToRad = function(perc) {
        return degToRad(percToDeg(perc));
    };

    degToRad = function(deg) {
        return deg * Math.PI / 180;
    };

    // Create SVG element
    svg = el.append('svg').attr('width', width + margin.left + margin.right).attr('height', height + margin.top + margin.bottom);

    // Add layer for the panel
    chart = svg.append('g').attr('transform', "translate(" + (width/2 + margin.left) + ", " + (height/2 + margin.top) + ")");
    chart.append('path').attr('class', "arc chart-filled");
    chart.append('path').attr('class', "arc chart-empty");
    chart.append("text")
        .attr("class", "title")
        .attr("x", 0)
        .attr("y", -height/2 - margin.top/4)
        .text(storage_name);
    label = svg.append("text")
        .attr("class", "label")
        .attr("x", width/2 + margin.left)
        .attr("y", height - margin.bottom*3)
        .text(d3.format(".2%")(percent));

    arc2 = d3.arc().outerRadius(radius - chartInset).innerRadius(radius - chartInset - barWidth);
    arc1 = d3.arc().outerRadius(radius - chartInset).innerRadius(radius - chartInset - barWidth);

    repaintGauge = function (perc)
    {
        var next_start = totalPercent;
        arcStartRad = percToRad(next_start);
        arcEndRad = arcStartRad + percToRad(perc / 2);
        next_start += perc / 2;


        arc1.startAngle(arcStartRad).endAngle(arcEndRad);

        arcStartRad = percToRad(next_start);
        arcEndRad = arcStartRad + percToRad((1 - perc) / 2);

        arc2.startAngle(arcStartRad + padRad).endAngle(arcEndRad);


        chart.select(".chart-filled").attr('d', arc1);
        chart.select(".chart-empty").attr('d', arc2);

    };


    var Needle = (function() {

        /**
         * Helper function that returns the `d` value
         * for moving the needle
         **/
        var recalcPointerPos = function(perc) {
            var centerX, centerY, leftX, leftY, rightX, rightY, thetaRad, topX, topY;
            thetaRad = percToRad(perc / 2);
            centerX = 0;
            centerY = 0;
            topX = centerX - this.len * Math.cos(thetaRad);
            topY = centerY - this.len * Math.sin(thetaRad);
            leftX = centerX - this.radius * Math.cos(thetaRad - Math.PI / 2);
            leftY = centerY - this.radius * Math.sin(thetaRad - Math.PI / 2);
            rightX = centerX - this.radius * Math.cos(thetaRad + Math.PI / 2);
            rightY = centerY - this.radius * Math.sin(thetaRad + Math.PI / 2);
            return "M " + leftX + " " + leftY + " L " + topX + " " + topY + " L " + rightX + " " + rightY;
        };

        function Needle(el) {
            this.el = el;
            this.len = width / 3;
            this.radius = this.len / 6;
        }

        Needle.prototype.render = function() {
            this.el.append('circle').attr('class', 'needle-center').attr('cx', 0).attr('cy', 0).attr('r', this.radius);
            return this.el.append('path').attr('class', 'needle').attr('d', recalcPointerPos.call(this, 0));
        };

        Needle.prototype.moveTo = function(perc) {
            var self;
            self = this;

            this.el.transition().delay(0).ease(d3.easeBounce).duration(500).select('.needle').tween('progress', function() {
                return function() {
                    var progress = perc;

                    repaintGauge(progress);
                    return d3.select('.needle').attr('d', recalcPointerPos.call(self, progress));
                };
            });

            label.text(d3.format(".2%")(perc));
        };

        return Needle;

    })();

    needle = new Needle(chart);
    needle.render();

    needle.moveTo(percent);

}