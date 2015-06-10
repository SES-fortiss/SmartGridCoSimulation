/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package helper;

/**
 * HTML Helper
 * 
 * @author amack
 * 
 */

public class HTMLHelper {

    public static void saveLinePlotHtml(String filePath) {
        String html = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "    <title></title>\n" +
                "    <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js\"></script>\n" +
                "    <script src=\"http://d3js.org/d3.v3.min.js\" charset=\"utf-8\"></script>\n" +
                "    <link rel=\"stylesheet\" href=\"http://netdna.bootstrapcdn.com/bootstrap/3.0.2/css/bootstrap.min.css\">\n" +
                "    <style>\n" +
                "        #drop {\n" +
                "            min-height: 150px;\n" +
                "            width: 250px;\n" +
                "            border: 1px solid blue;\n" +
                "            margin: 10px;\n" +
                "            padding: 10px;\n" +
                "        }\n" +
                "        body {\n" +
                "            font: 10px sans-serif;\n" +
                "        }\n" +
                "\n" +
                "        .axis path,\n" +
                "        .axis line {\n" +
                "            fill: none;\n" +
                "            stroke: #000;\n" +
                "            shape-rendering: crispEdges;\n" +
                "        }\n" +
                "\n" +
                "        .x.axis path {\n" +
                "            display: none;\n" +
                "        }\n" +
                "\n" +
                "        .line {\n" +
                "            fill: none;\n" +
                "            stroke: steelblue;\n" +
                "            stroke-width: 1.5px;\n" +
                "        }\n" +
                "\n" +
                "    </style>\n" +
                "\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "<div class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n" +
                "    <div class=\"container\">\n" +
                "        <div class=\"navbar-header\">\n" +
                "            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n" +
                "                <span class=\"sr-only\">Toggle navigation</span>\n" +
                "                <span class=\"icon-bar\"></span>\n" +
                "                <span class=\"icon-bar\"></span>\n" +
                "                <span class=\"icon-bar\"></span>\n" +
                "            </button>\n" +
                "            <a class=\"navbar-brand\" href=\"#\">Drag/Drop</a>\n" +
                "        </div>\n" +
                "        <div class=\"collapse navbar-collapse\">\n" +
                "\n" +
                "        </div><!--/.nav-collapse -->\n" +
                "    </div>\n" +
                "</div>\n" +
                "\n" +
                "<div class=\"container\">\n" +
                "\n" +
                "    <div class=\"starter-template\">\n" +
                "        <h1 align=center style=\"margin-top: 100px;\">Drag/Drop a csv to plot</h1>\n" +
                "        <DIV id=\"status\">Drag a .csv File, works in Firefox</DIV>\n" +
                "        <DIV id=\"drop\">Drop files here.</DIV>\n" +
                "\n" +
                "        <DIV id=\"list\"></DIV>\n" +
                "    </div>\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</body>\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "<script>\n" +
                "    if(window.FileReader) {\n" +
                "        var drop;\n" +
                "        addEventHandler(window, 'load', function() {\n" +
                "            var status = document.getElementById('status');\n" +
                "            drop   = document.getElementById('drop');\n" +
                "            var list   = document.getElementById('list');\n" +
                "\n" +
                "            function cancel(e) {\n" +
                "                if (e.preventDefault) { e.preventDefault(); }\n" +
                "                return false;\n" +
                "            }\n" +
                "\n" +
                "            // Tells the browser that we *can* drop on this target\n" +
                "            addEventHandler(drop, 'dragover', cancel);\n" +
                "            addEventHandler(drop, 'dragenter', cancel);\n" +
                "\n" +
                "            addEventHandler(drop, 'drop', function (e) {\n" +
                "                e = e || window.event; // get window.event if e argument missing (in IE)\n" +
                "                if (e.preventDefault) { e.preventDefault(); } // stops the browser from redirecting off to the image.\n" +
                "\n" +
                "                var dt    = e.dataTransfer;\n" +
                "                var files = dt.files;\n" +
                "                for (var i=0; i<files.length; i++) {\n" +
                "                    var file = files[i];\n" +
                "                    var reader = new FileReader();\n" +
                "\n" +
                "                    //attach event handlers here...\n" +
                "\n" +
                "                    reader.readAsDataURL(file);\n" +
                "                    addEventHandler(reader, 'loadend', function(e, file) {\n" +
                "                        var bin           = this.result;\n" +
                "                        var newFile       = document.createElement('div');\n" +
                "                        newFile.innerHTML = 'Loaded : '+file.name+' size '+file.size+' B';\n" +
                "                        list.appendChild(newFile);\n" +
                "                        var fileNumber = list.getElementsByTagName('div').length;\n" +
                "                        status.innerHTML = fileNumber < files.length\n" +
                "                                ? 'Loaded 100% of file '+fileNumber+' of '+files.length+'...'\n" +
                "                                : 'Done loading. processed '+fileNumber+' files.';\n" +
                "\n" +
                "                        var img = document.createElement(\"img\");\n" +
                "                        img.file = file;\n" +
                "                        img.src = bin;\n" +
                "                        list.appendChild(img);\n" +
                "\n" +
                "\n" +
                "                        //d3 start\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "                        d3.csv(bin, function(error, data) {\n" +
                "                            color.domain(d3.keys(data[0]).filter(function(key) { return key !== \"timeStep\"; }));\n" +
                "\n" +
                "                            var physicalProperty = color.domain().map(function(name) {\n" +
                "                                return {\n" +
                "                                    name: name,\n" +
                "                                    values: data.map(function(d) {\n" +
                "                                        return {timeStep: d.timeStep, givenValue: +d[name]};\n" +
                "                                    })\n" +
                "                                };\n" +
                "                            });\n" +
                "\n" +
                "                            x.domain(d3.extent(data, function(d) { return d.timeStep; }));\n" +
                "\n" +
                "                            y.domain([\n" +
                "                                d3.min(physicalProperty, function(c) { return d3.min(c.values, function(v) { return v.givenValue; }); }),\n" +
                "                                d3.max(physicalProperty, function(c) { return d3.max(c.values, function(v) { return v.givenValue; }); })\n" +
                "                            ]);\n" +
                "\n" +
                "                            svg.append(\"g\")\n" +
                "                                    .attr(\"class\", \"x axis\")\n" +
                "                                    .attr(\"transform\", \"translate(0,\" + height + \")\")\n" +
                "                                    .call(xAxis);\n" +
                "\n" +
                "                            svg.append(\"g\")\n" +
                "                                    .attr(\"class\", \"y axis\")\n" +
                "                                    .call(yAxis)\n" +
                "                                    .append(\"text\")\n" +
                "                                    .attr(\"transform\", \"rotate(-90)\")\n" +
                "                                    .attr(\"y\", 6)\n" +
                "                                    .attr(\"dy\", \".71em\")\n" +
                "                                    .style(\"text-anchor\", \"end\")\n" +
                "                                    .text(\"Power [W]\");\n" +
                "\n" +
                "                            var property = svg.selectAll(\".property\")\n" +
                "                                    .data(physicalProperty)\n" +
                "                                    .enter().append(\"g\")\n" +
                "                                    .attr(\"class\", \"property\");\n" +
                "\n" +
                "                            property.append(\"path\")\n" +
                "                                    .attr(\"class\", \"line\")\n" +
                "                                    .attr(\"d\", function(d) { return line(d.values); })\n" +
                "                                    .style(\"stroke\", function(d) { return color(d.name); });\n" +
                "\n" +
                "                            property.append(\"text\")\n" +
                "                                    .datum(function(d) { return {name: d.name, value: d.values[d.values.length - 1]}; })\n" +
                "                                    .attr(\"transform\", function(d) { return \"translate(\" + x(d.value.timeStep) + \",\" + y(d.value.givenValue) + \")\"; })\n" +
                "                                    .attr(\"x\", 3)\n" +
                "                                    .attr(\"dy\", \".35em\")\n" +
                "                                    .text(function(d) { return d.name; });\n" +
                "                        });\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "                        //d3 end\n" +
                "\n" +
                "                    }.bindToEventHandler(file));\n" +
                "                }\n" +
                "                return false;\n" +
                "            });\n" +
                "            Function.prototype.bindToEventHandler = function bindToEventHandler() {\n" +
                "                var handler = this;\n" +
                "                var boundParameters = Array.prototype.slice.call(arguments);\n" +
                "                //create closure\n" +
                "                return function(e) {\n" +
                "                    e = e || window.event; // get window.event if e argument missing (in IE)\n" +
                "                    boundParameters.unshift(e);\n" +
                "                    handler.apply(this, boundParameters);\n" +
                "                }\n" +
                "            };\n" +
                "        });\n" +
                "    } else {\n" +
                "        document.getElementById('status').innerHTML = 'Your browser does not support the HTML5 FileReader.';\n" +
                "    }\n" +
                "    function addEventHandler(obj, evt, handler) {\n" +
                "        if(obj.addEventListener) {\n" +
                "            // W3C method\n" +
                "            obj.addEventListener(evt, handler, false);\n" +
                "        } else if(obj.attachEvent) {\n" +
                "            // IE method.\n" +
                "            obj.attachEvent('on'+evt, handler);\n" +
                "        } else {\n" +
                "            // Old school method.\n" +
                "            obj['on'+evt] = handler;\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    var margin = {top: 20, right: 80, bottom: 30, left: 50},\n" +
                "            width = 960 - margin.left - margin.right,\n" +
                "            height = 500 - margin.top - margin.bottom;\n" +
                "\n" +
                "    var x = d3.scale.linear()\n" +
                "            .range([0, width]);\n" +
                "\n" +
                "    var y = d3.scale.linear()\n" +
                "            .range([height, 0]);\n" +
                "\n" +
                "    var color = d3.scale.category10();\n" +
                "\n" +
                "    var xAxis = d3.svg.axis()\n" +
                "            .scale(x)\n" +
                "            .orient(\"bottom\");\n" +
                "\n" +
                "    var yAxis = d3.svg.axis()\n" +
                "            .scale(y)\n" +
                "            .orient(\"left\");\n" +
                "\n" +
                "    var line = d3.svg.line()\n" +
                "            .interpolate(\"basis\")\n" +
                "            .x(function(d) { return x(d.timeStep); })\n" +
                "            .y(function(d) { return y(d.givenValue); });\n" +
                "\n" +
                "    var svg = d3.select(\"body\").append(\"svg\")\n" +
                "            .attr(\"width\", width + margin.left + margin.right)\n" +
                "            .attr(\"height\", height + margin.top + margin.bottom)\n" +
                "            .append(\"g\")\n" +
                "            .attr(\"transform\", \"translate(\" + margin.left + \",\" + margin.top + \")\");\n" +
                "\n" +
                "\n" +
                "\n" +
                "</script>\n" +
                "</html>";
        IoHelper.saveFile(filePath, html);
    }
}
