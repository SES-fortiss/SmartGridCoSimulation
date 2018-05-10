var chart_s;
var options_s;
var new_data = [];
var nodesChanged = [];
var originalY = [];
var lines = [];

function updateData_s() {
    $.ajax({
        dataType: "json",
        url: building_url,
        success: function (result) {
            var consumption = result.consumption;
            var producers = result.producers;
            var storages =  result.storages;
            var production_el = 0.0;
            new_data = [];

            for (var p in producers){
                if (!producers.hasOwnProperty(p)) {
                    new_data.push(["Netz", "Stromverbrauch", consumption.electrical]);
                    continue;
                }
                var obj_p = producers[p];

                for (var s in storages) {
                    var obj_s;

                    //Strom
                    if(obj_p.power_el !== 0){
                        production_el += obj_p.power_el;
                        if(obj_p.power_el > consumption.electrical) {
                            new_data.push([obj_p.name, "Stromverbrauch", consumption.electrical]);

                            //check, if storages are available
                            if (!storages.hasOwnProperty(s)) {
                                new_data.push([obj_p.name, "Netz", obj_p.power_el - consumption.electrical]);
                                continue;
                            }
                            obj_s = storages[s];
                            if (obj_s.name === "Batterie" && obj_s.p_in !== 0) {
                                new_data.push([obj_p.name, obj_s.name, obj_s.p_in]);
                                if (obj_s.p_in + consumption.electrical < obj_p.power_el){
                                    new_data.push([obj_p.name, "Netz", obj_p.power_el - consumption.electrical - obj_s.p_in]);
                                }
                            }
                            else new_data.push([obj_p.name, "Netz", obj_p.power_el - consumption.electrical]);
                        }
                        else{
                            new_data.push([obj_p.name, "Stromverbrauch", obj_p.power_el]);
                            if(obj_p.power_el < consumption.electrical){
                                //check, if storages are available
                                if (!storages.hasOwnProperty(s)) {
                                    new_data.push(["Netz", "Stromverbrauch", consumption.electrical - obj_p.power_el]);
                                    continue;
                                }
                                obj_s = storages[s];
                                if (obj_s.name === "Batterie" && obj_s.p_out !== 0) {
                                    new_data.push([obj_s.name, "Stromverbrauch", obj_s.p_out]);
                                    if (obj_s.p_out + obj_p.power_el < consumption.electrical){
                                        new_data.push(["Netz", "Stromverbrauch", consumption.electrical - obj_p.power_el - obj_s.p_out]);
                                    }
                                }
                                else new_data.push(["Netz", "Stromverbrauch", consumption.electrical - obj_p.power_el]);
                            }
                        }
                    }

                    //Wärme
                    if(obj_p.power_h !== 0){
                        //production>consumption
                        if(obj_p.power_h > consumption.dhw + consumption.heat) {
                            new_data.push([obj_p.name, "Warmwasser", consumption.dhw]);
                            new_data.push([obj_p.name, "Heizung", consumption.heat]);

                            //check, if storages are available
                            if (!storages.hasOwnProperty(s)) {
                                new_data.push([obj_p.name, "Ungenutzte Wärme", obj_p.power_h - consumption.dhw - consumption.heat]);
                                continue;
                            }
                            obj_s = storages[s];
                            if (obj_s.name === "Wärmespeicher" && obj_s.p_in !== 0) {
                                new_data.push([obj_p.name, obj_s.name, obj_s.p_in]);
                                if (obj_s.p_in + consumption.dhw + consumption.heat < obj_p.power_h){
                                    new_data.push([obj_p.name, "Ungenutzte Wärme", obj_p.power_h - consumption.dhw - consumption.heat - obj_s.p_in]);
                                }
                            }
                            else new_data.push([obj_p.name, "Ungenutzte Wärme", obj_p.power_h - consumption.dhw - consumption.heat]);
                        }
                        //production<=consumption
                        else{
                            if(obj_p.power_h >= consumption.dhw){
                                new_data.push([obj_p.name, "Warmwasser", consumption.dhw]);
                                if(obj_p.power_h - consumption.dhw >= consumption.heat){
                                    new_data.push([obj_p.name, "Heizung", consumption.heat]);
                                }
                                //production<consumption
                                else{
                                    new_data.push([obj_p.name, "Heizung", obj_p.power_h - consumption.dhw]);
                                    //check, if storages are available
                                    if (!storages.hasOwnProperty(s)) continue;
                                    obj_s = storages[s];
                                    if (obj_s.name === "Wärmespeicher" && obj_s.p_out !== 0) {
                                        new_data.push([obj_s.name, "Heizung", obj_s.p_out]);
                                    }
                                }
                            }
                            //production<consumption
                            else{
                                new_data.push([obj_p.name, "Warmwasser", obj_p.power_h]);
                                //check, if storages are available
                                if (!storages.hasOwnProperty(s)) continue;
                                obj_s = storages[s];
                                if (obj_s.name === "Wärmespeicher" && obj_s.p_out !== 0) {
                                    new_data.push([obj_s.name, "Warmwasser", consumption.dhw - obj_p.power_h]);
                                    new_data.push([obj_s.name, "Heizung", obj_s.p_out - consumption.dhw + obj_p.power_h]);
                                }
                            }
                        }
                    }
                }
            }
            if(production_el === 0) new_data.push(["Netz", "Stromverbrauch", consumption.electrical]);

            // remove all zero connections
            for (var i = 0; i < new_data.length; i++){
                if(new_data[i][2] < 1e-10) {
                    new_data.splice(i,1);
                    i = i-1;
                }
            }

            //new_data = [['PV','Stromverbrauch',0.15],['PV','Batterie',0.1],['PV','hhhhhhhhhh',0.1],['PV','other',1],['Stromnetz','other',0.1]];
            if(chart_s.series === undefined) return;
            chart_s.series[0].setData(new_data);
            avoidOverlap();
        }
    });

    // call it again after one second
    setTimeout(updateData_s, 1000);
}

function avoidOverlap(){
    if (chart_s) {
        // remove old lines
        for(var i=0; i<lines.length; i++){
            lines[i].destroy();
        }
        lines = [];
        $.each(chart_s.series[0].nodes, function(i, point) {
            if(point.dataLabel !== undefined) {
                //console.log('point: ', point);
                var string = point.name,
                    length = string.length,
                    bbox_width = point.shapeArgs.height,
                    dataLabely = point.dataLabel.y,
                    translate = 70,
                    connectionx = 0;

                // label too wide for node
                if (bbox_width < point.dataLabel.width){
                    if (nodesChanged.indexOf(i) !== -1) {
                        dataLabely = originalY[nodesChanged.indexOf(i)];
                    }
                    // check for collision with other translated node
                    for (var j=0; j<nodesChanged.length; j++){
                        if (nodesChanged[j] !== i){
                            var other_point = chart_s.series[0].nodes[nodesChanged[j]];
                            // check if other point is neighbor
                            if (other_point.column === point.column && other_point.x - point.x ===-1) {
                                translate = other_point.dataLabel.y - dataLabely + 40;
                            }
                        }
                    }
                    // calculate the offset
                    var factor = 0;
                    $.each(chart_s.series[0].nodes, function(k, other_node) {
                        if (other_node.column === point.column && other_node.x < point.x) factor++;
                    });
                    connectionx += factor*10;

                    // translate node
                    point.dataLabel.attr({
                        y: dataLabely + translate,
                        fill: point.color
                    });

                    // draw connecting line
                    var line = chart_s.renderer.path(['M', point.dataLabel.x + point.dataLabel.width / 2 +connectionx, dataLabely + 50, 'v', translate])
                        .attr({
                            'stroke': point.color,
                            'stroke-width': 2
                        })
                        .add();
                    //console.log('line: ', line);
                    lines.push(line);
                    if (nodesChanged.indexOf(i) === -1) {
                        nodesChanged.push(i);
                        originalY.push(dataLabely)
                    }
                }
            }
        });
    }
}

function show_s() {
    document.getElementById('container_profile').style.visibility ='hidden';
    $('#container_profile').find('.highcharts-container').hide();

    document.getElementById('container_sankey').style.visibility ='visible';
    $('#container_sankey').find('.highcharts-container').show();
}

function createChart_s() {
    options_s = {
        chart: {
            inverted: true,
            events: {
                load: updateData_s
            },
            spacingBottom: 300,
            height: 800
        },
        title: {
            text: 'Energiefluss'
        },
        credits:{
            enabled: false
        },
        plotOptions:{
            series: {
                dataLabels: {
                    useHTML: true,
                    nodeFormatter: function () {
                        if (this.point.sum === 0) {
                            return null;
                        }
                        else {
                            return '<div style="text-align:center"><span style="font-size:20px;">' +
                                this.point.name + ' - ' + Highcharts.numberFormat(this.point.sum, 2) + ' kW</span><br/></div>';
                        }
                    },
                    formatter: function () {
                        return '';
                    }
                },
                tooltip: {
                    followPointer: false,
                    pointFormat: "{point.fromNode.name} → {point.toNode.name}: <b>{point.weight:.2f} kW</b><br/>",
                    nodeFormat: "{point.name}: <b>{point.sum:.2f} kW</b><br/>"
                },
                nodeWidth: 40
            }
        },
        series: [{
            keys: ['from', 'to', 'weight'],
            data: [],
            nodes: [],
            type: 'sankey',
            name: 'Energiefluss'
        }]
    };
    chart_s = new Highcharts.Chart('container_sankey', options_s);
}
