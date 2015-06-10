//Width, height, margins
var margin = {top: 20, right: 10, bottom: 20, left: 40},
    height = 200;
    width = 940;         
                    
var margin2 = {top: 20, right: 10, bottom: 20, left: 40},
    width2 = 1200
    height2 = 300

//Create SVG element
var svg1 = d3.select("#chart1")
    .append("svg")
    .attr("id", "chart1")
    .attr("width", width)
    .attr("height", height)
    .append("g")
    
var svg2 = d3.select("#chart2")
    .append("svg")
    .attr("id", "chart2")
    .attr("width", width2)
    .attr("height", height2)
    .append("g")
    
var element_properties = d3.select("#properties")

var counter = 0;
var element_index;
    
// Data
d3.json("DEMSResults.json", function (jsondata) {
    /***********************************************
    *
    *  The first graph with the DEMS component
    *
    ************************************************/ 
    var DEMSdata = jsondata.data;    
    
    var xScale = d3.scale.linear()
         .domain([0, d3.max(DEMSdata, function(d) { return d.time; })])
         .range([margin.left, width-margin.right]);
         
    var yScale = d3.scale.linear()
         .domain([0, d3.max(DEMSdata, function(d) { return  1.1*d.currentProduction; })])
         .range([height-margin.bottom, margin.top]);
         
    //Define X axis
    var xAxis = d3.svg.axis()
        .scale(xScale)
        .orient("bottom")
        .innerTickSize(-10)
        .outerTickSize(0)            
        .ticks(9);
          
    //Define Y axis
    var yAxis = d3.svg.axis()
        .scale(yScale)
        .orient("left")
        .innerTickSize(-10)
        .outerTickSize(0)
        .ticks(5);       
    
    var area = d3.svg.area()
        .x(function(d) { return xScale(d.time); })
        .y0(height-margin.top)
        .y1(function(d) { return yScale(d.currentProduction); });
    
    svg1.append("path")
        .datum(DEMSdata)
        .attr("class", "area")
        .attr("d", area);
        
    // Define the function to draw lines
    var line = d3.svg.line() 
        .x(function(d) { return xScale(d.time);	})
        .y(function(d) { return yScale(d.currentProduction); })
    
    // Draw the lines
    svg1.append("path")
        .attr("d", line(DEMSdata))

    /*
    svg1.selectAll("circle")
        .data(DEMSdata)
        .enter()
        .append("circle")
        .attr("cx", function(d) {
            return xScale(d.time);
        })
        .attr("cy", function(d) {
            return yScale(d.currentProduction);
        })
        .attr("r", 3);
    */

    // Define YGrid
    var yAxisGrid = d3.svg.axis()
        .scale(yScale)
        .orient("left")
        .innerTickSize(-width)
        .outerTickSize(0)
        .tickFormat("")
        .ticks(5)
        
    svg1.append("g")
        .attr("class", "axisGrid")
        .attr("transform", "translate(" + margin.left + ",0)")
        .call(yAxisGrid)
        
    //Create Y axis
    svg1.append("g")
        .attr("class", "axis")
        .attr("transform", "translate(" + margin.left + ",0)")
        .call(yAxis)
        
    //Create X axis
    svg1.append("g")
        .attr("class", "axis")  //Assign "axis" class
        .attr("transform", "translate(0," + (height-margin.bottom) + ")")
        .call(xAxis)
        
    svg1.append("rect")
        .attr("class", "overlay")
        .attr("width", width)
        .attr("height", height)
        .on("mouseover", mouseover)
        .on("mousemove", mousemove)
        .on("mouseout", mouseout)

    //Mouse behaviour preparation   
    var bisectDate = d3.bisector(function(d) { return d.time; }).left;            
    var format = d3.format(".0f")
    var format_k = d3.format(".1f")
    
    var focusCircle = svg1
        .append("g")
        .attr("class", "focus")
        .append("circle")
        .style("display", "none")
        .attr("r", 5);
    
    var focusText = svg1
        .append("g")
        .attr("class", "focus")
        .append("text")        
        .attr("x", width - 200)
        .attr("y", "20")
        .text("VPP Power = .............")

    var verticalLine = svg1
        .append('line')
        .attr({
            'x1': 0,
            'y1': height - margin.bottom,
            'x2': 0,
            'y2': margin.top
        })
        .attr("stroke", "steelblue")
        .style("display", "none")        
        
    function mouseover() { 
        focusCircle.style("display", null);
        focusText.style("display", null);
        verticalLine.style("display", null);
    }
    
    function mouseout(){
        focusText.text("VPP Power = " + format(DEMSdata[counter].currentProduction) + " kW");
        verticalLine.attr("transform", "translate(" + xScale(DEMSdata[counter].time) + ",0)");        
        focusCircle.attr("transform", "translate(" + xScale(DEMSdata[counter].time) + "," + yScale(DEMSdata[counter].currentProduction) + ")");
    }            
    
    function mousemove() {
        var x0 = xScale.invert(d3.mouse(this)[0]),
            i = bisectDate(DEMSdata, x0, 1),
            d0 = DEMSdata[i - 1],
            d1 = DEMSdata[i],
            d = x0 - d0 > d1 - x0 ? d1 : d0;

        counter = x0 - d0 > d1 - x0 ? i : i-1;
        
        focusText.text("VPP Power = " + format(d.currentProduction) + " kW");
        focusCircle.attr("transform", "translate(" + xScale(d.time) + "," + yScale(d.currentProduction) + ")");
        verticalLine.attr("transform", "translate(" + xScale(d.time) + ",0)")
        
        svg2.selectAll(".bar")
            .attr("y", function(d) {return y2Scale(d.data[counter].expectedProduction) - margin.bottom ;} )
            .attr("height", function(d) { return height - y2Scale(d.data[counter].expectedProduction) - margin.bottom; })
        
        svg2.selectAll(".bar")
            .attr("y", function(d) {return y2Scale(d.data[counter].currentProduction) - margin.bottom ;} )
            .attr("height", function(d) { return height - y2Scale(d.data[counter].currentProduction) - margin.bottom; })
        
        svg2.selectAll("#textNumbers")
           .text(function(d) {
                if (d.data[counter].currentProduction <= 1000) {return format(d.data[counter].currentProduction);}
                else {return format_k(d.data[counter].currentProduction / 1000.0) + "k" } } )
        
        textNames
            .filter(function(d)  {return (d.data[counter].currentProduction !=  d.data[counter].scheduledProduction )})
            .style("fill", "red")
        
        if (element_index != null){
            element_properties.html(generateText)}

        // "transform", "translate(10,20)"
    }    
    
    /***********************************************
    *
    *  The second graph with the Children components
    *
    ************************************************/ 
    
    var y2Scale = d3.scale.linear()
        .domain([0, 1100])
        .range([height-margin.bottom, margin.top]);    
        
    var children = jsondata.children;
    var xBarWidth = (width - margin.left - margin.right) / children.length;
    
    //Define Y axis
    var y2Axis = d3.svg.axis()
        .scale(y2Scale)
        .orient("left")
        .innerTickSize(-10)
        .outerTickSize(0)
        .ticks(5);    
    
    svg2.append("g")
        .attr("class", "axis")
        .attr("transform", "translate(" + margin.left + "," + (0 - margin.bottom) + ")")
        .call(y2Axis)
        
    var rects = svg2.selectAll("rect")
        .data(children)
      .enter() // enter the data with children
        .append("rect")
        .attr("x", function(d, i) { return i * xBarWidth + margin.left})
        .attr("y", function(d) { return y2Scale(d.data[counter].currentProduction ) - margin.bottom ; })
        .attr("class", "bar")
        .attr("width", xBarWidth - 1)
        .attr("height", function(d) { return height - y2Scale(d.data[counter].currentProduction)- margin.bottom; })
        .style("fill", "green")
    
    var textNumbers = svg2.selectAll("#textNumbers")
        .data(children)
        .enter()
        .append("text")
        .attr("id", "textNumbers")
        .text(function(d) {if (d.data[counter].currentProduction <= 1000) {return format(d.data[counter].currentProduction);}
            else {return format_k(d.data[counter].currentProduction / 1000.0) + "k" } } )
        .attr("x", function(d, i) { return (i+0.5) * xBarWidth + margin.left; })
        .attr("y", height - 45)  
       
    var textNames = svg2.selectAll("#textNames")
        .data(children)
        .enter()
        .append("text")
        .attr("id", "textNames")
        .text( function(d) { return d.name; })
        .attr("x", function(d, i) { return (i+0.5) * xBarWidth + 2 + margin.left; })
        .attr("y", height-margin.bottom - margin.top + 5)
        .attr("transform", function (d, i) {return "rotate(-90 " + ( (i+0.5) * xBarWidth + margin.left + 2 ) + "," + (height-margin.bottom - margin.top + 5) + ")"})
       
    svg2.append("rect")
        .attr("class", "overlay")
        .attr("width", width2)
        .attr("height", height2)
        .on("click", SVG2mouseclick)
        
    function SVG2mouseclick(){    
        var index_double = (d3.mouse(this)[0] - margin.left) * children.length / (width - margin.left - margin.right);        
        element_index = Math.floor(index_double);

        svg2.selectAll(".bar")
            .style("fill", function(d,i) {if(i == element_index){return "orange"} else {return "green"}})    
            
        element_properties
            .attr("style","padding:5px")
            .html(generateText);
    }    
    
    function generateText(){
        var t = children[element_index];
        //console.log(t);
        
        return "Eigenschaften <hr> " + 
            "Name:  " + t.name + "\<br\>" +
            "Max.Leistung: " + format_k(t.data[counter].installedPower) + " kW<hr>" +
            "Zeit:" + t.data[counter].time + "\<br\>" +
            "Produktion IST: " + format_k(t.data[counter].currentProduction) + " kW<br>" + 
            "Produktion SOLL: " + format_k(t.data[counter].scheduledProduction) + " kW<br>" + 
            "Vorhersage: " + format_k(t.data[counter].expectedProduction) + " kW<hr>" + 
            "Nachricht IN: <br>" + t.data[counter].IN + "<hr>" + 
            "Nachricht OUT: <br>" + t.data[counter].OUT;
    }

});