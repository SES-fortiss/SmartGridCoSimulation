var chart1;
var chart2;
var chart3;
var chart4;
var options1;
var options2;
var options3;
var gaugeOptions;

/**
 * In order to synchronize tooltips and crosshairs, override the
 * built-in events with handlers defined on the parent element.
 */
$('#container_sync').bind('mousemove touchmove touchstart', function (e) {
    var chart,
        point,
        i,
        event,
        serie;

    for (i = 0; i < Highcharts.charts.length-1; i = i + 1) {
        chart = Highcharts.charts[i];
        if (chart === undefined) continue;
        // Find coordinates within the chart
        event = chart.pointer.normalize(e.originalEvent);
        // Get the hovered point
        var points = [];
        for (j = 0; j < chart.series.length; j = j + 1) {
            serie = chart.series[j];
            if (!serie.visible || serie.enableMouseTracking === false) continue;

            point = serie.searchPoint(event, true);
            // Get the hovered point
            if (point) points.push(point);
        }

        if (points.length) {
            if (chart.tooltip.shared) {
                chart.tooltip.refresh(points);
            } else {
                chart.tooltip.refresh(points[0]);
            }
            chart.xAxis[0].drawCrosshair(e, points[0]);
        }
    }
});
/**
 * Override the reset function, we don't need to hide the tooltips and
 * crosshairs.
 */
Highcharts.Pointer.prototype.reset = function () {
    return undefined;
};

/**
 * Synchronize zooming through the setExtremes event handler.
 */
function syncExtremes(e) {
    var thisChart = this.chart;

    if (e.trigger !== 'syncExtremes') { // Prevent feedback loop
        Highcharts.each(Highcharts.charts, function (chart) {
            if (chart !== thisChart) {
                if (chart.xAxis[0].setExtremes) { // It is null while updating
                    chart.xAxis[0].setExtremes(
                        e.min,
                        e.max,
                        undefined,
                        false,
                        { trigger: 'syncExtremes' }
                    );
                }
            }
        });
    }
}

function requestData() {
    var ajax1 = $.ajax({
        dataType: "json",
        url: "http://localhost:8100",
        async: true,
        success: function (result) {
        }
    });


    var ajax2 = $.ajax({
        dataType: "json",
        url: building_url,
        async: true,
        success: function (result) {
        }
    });

    $.when(ajax1, ajax2).done(function (a1, a2) {
        // a1 and a2 are arguments resolved for the page1 and page2 ajax requests, respectively.
        // Each argument is an array with the following structure: [ data, statusText, jqXHR ]

        // shift if the series is longer than 1 hour
        var series = chart1.series[0],
            shift = series.data.length > 60 * 60;

        //Time
        var currentTime = a1[0].currentTime;
        var time = new Date(Date.UTC(currentTime.date.year, currentTime.date.month, currentTime.date.day, currentTime.time.hour, currentTime.time.minute, currentTime.time.second));

        //Consumption
        var data_h = [time.getTime(), a2[0].consumption.heat];
        var data_e = [time.getTime(), a2[0].consumption.electrical];
        var data_dhw = [time.getTime(), a2[0].consumption.dhw];
        // add the point
        chart1.series[0].addPoint(data_h, true, shift);
        chart1.series[1].addPoint(data_e, true, shift);
        chart1.series[2].addPoint(data_dhw, true, shift);

        //Producers
        for (var p in a2[0].producers){
            if (!a2[0].producers.hasOwnProperty(p)) continue;
            var obj = a2[0].producers[p];
            for (i = 0; i < chart2.series.length; i++){
                if (chart2.series[i].name === obj.name){
                    chart2.series[i].addPoint([time.getTime(), obj.power_h], true, shift);
                }
                if (chart3.series[i].name === obj.name){
                    chart3.series[i].addPoint([time.getTime(), obj.power_el], true, shift);
                }
            }
        }

        //Storages
        for (var s in a2[0].storages){
            if (!a2[0].storages.hasOwnProperty(s) || !chart4) continue;
            var obj_s = a2[0].storages[s];
            var point = chart4.series[0].points[0];
            var new_val = (obj_s.cur_capacity/obj_s.max_capacity)*100;
            point.update(new_val);
        }

        // call it again after one second
        setTimeout(requestData, 1000);

    });
}

function show_p(){
    document.getElementById('container_sankey').style.visibility ='hidden';
    $('#container_sankey').find('.highcharts-container').hide();

    document.getElementById('container_profile').style.visibility ='visible';
    $('#container_profile').find('.highcharts-container').show();
}

function createChart_p() {
    options1 = {
        chart: {
            renderTo: "chart_consumption",
            defaultSeriesType: 'spline',
            zoomType: "x",
            events: {
                load: requestData
            }
        },
        title: {
            text: 'Verbrauch'
        },
        xAxis: {
            crosshair: true,
            events: {
                setExtremes: syncExtremes
            },
            type: 'datetime',
            tickPixelInterval: 150
        },
        yAxis: {
            title: {
                text: 'kW',
                margin: 80
            }
        },
        tooltip: {
            split: true,
            valueDecimals: 2
        },
        series: [{
            name: 'Heizung',
            data: []
        }, {
            name: 'Strom',
            data: []
        }, {
            name: 'Warmwasser',
            data: []
        }]
    };

    options2 = {
        chart: {
            renderTo: "chart_production_h",
            defaultSeriesType: 'spline',
            zoomType: "x",
            events: {
                load: requestData
            }
        },
        title: {
            text: 'Produktion - Wärme'
        },
        xAxis: {
            crosshair: true,
            events: {
                setExtremes: syncExtremes
            },
            type: 'datetime',
            tickPixelInterval: 150
        },
        yAxis: {
            title: {
                text: 'kW',
                margin: 80
            }
        },
        tooltip: {
            split: true,
            valueDecimals: 2
        },
        series: []
    };

    gaugeOptions = {
        chart: {
            renderTo: "chart_storage",
            type: 'solidgauge',
            events: {
                load: requestData
            }
        },

        title: null,

        pane: {
            center: ['50%', '85%'],
            size: '140%',
            startAngle: -90,
            endAngle: 90,
            background: {
                backgroundColor: (Highcharts.theme && Highcharts.theme.background2) || '#EEE',
                innerRadius: '60%',
                outerRadius: '100%',
                shape: 'arc'
            }
        },
        tooltip: {
            enabled: false
        },

        yAxis: {
            stops: [
                [0.1, '#DF5353'], // red
                [0.5, '#DDDF0D'], // yellow
                [0.9, '#55BF3B'] // green
            ],
            lineWidth: 0,
            minorTickInterval: null,
            tickAmount: 2,
            labels: {
                y: 20,
                style: {
                  fontSize: "14px"
                },
                format: "{value:.0f} %"
            },
            min: 0,
            max: 100,
            title: {
                text: ''
            }
        },

        plotOptions: {
            solidgauge: {
                dataLabels: {
                    y: 5,
                    borderWidth: 0,
                    useHTML: true
                }
            }
        },

        series: [{
            name: 'storage',
            data: [0],
            dataLabels: {
                useHTML: true,
                format: '<div style="text-align:center"><span style="font-size:25px;color:' +
                ((Highcharts.theme && Highcharts.theme.contrastTextColor) || 'black') + '">{y:.1f}</span><br/>' +
                '<span style="font-size:20px;color:silver">%</span></div>'
            }
        }]

    };

    $.ajax({
        dataType: "json",
        url: building_url,
        success: function (result) {
            //set options
            for (var p in result.producers){
                if (!result.producers.hasOwnProperty(p)) continue;
                var obj = result.producers[p];
                options2.series.push({
                    name: obj.name,
                    data: []
                });
            }
            options3 = JSON.parse(JSON.stringify(options2));
            options3.chart.renderTo = "chart_production_el";
            options3.title.text = "Produktion - Strom";

            for(var s in result.storages) {
                if (!result.storages.hasOwnProperty(s)) {
                    gaugeOptions.title = null;
                    continue;
                }
                var obj_s = result.storages[s];
                gaugeOptions.title = {text: obj_s.name};
            }

            //create charts
            chart1 = new Highcharts.Chart(options1);
            chart2 = new Highcharts.Chart(options2);
            chart3 = new Highcharts.Chart(options3);
            if(gaugeOptions.title != null){
                chart4 = new Highcharts.Chart(gaugeOptions);
            }
        }
    });
}