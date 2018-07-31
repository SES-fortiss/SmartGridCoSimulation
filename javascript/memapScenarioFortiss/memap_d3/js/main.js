var building_url, rest_url, memap_url, start_date, end_date, building_id;

var legendRectSize = 18;
var legendSpacing = 4;

var margin = {top: 60, right: 20, bottom: 20, left: 200},
    width = 1160 - margin.right,
    height = 500 - margin.top - margin.bottom;


$(document).ready(function() {

    date_time();
    rest_url = "http://localhost:9999";
    memap_url = "http://localhost:8100";
    building_url = "http://localhost:8101";
    building_id = building_url.charAt(building_url.length-1);

    getBuildingInfo();

    d3.select("#history")
        .selectAll("div")
        .style('display', 'none');

    d3.select("#timeperiod")
        .style('display', 'none');

    document.getElementById("live_tab").className += " active";

    createLiveProfileChart();

    createHistoryProfileChart();
    createHistoryAreaChart();
    createHistoryCostChart();

});

function date_time(){
    document.getElementById('realtime').innerHTML = new Date().toLocaleString();
    setTimeout('date_time();','1000');
}

function show_live_charts(){
    d3.select("#profile")
        .selectAll("div")
        .style('display', 'block');

    d3.select("#history")
        .selectAll("div")
        .style('display', 'none');

    d3.select("#timeperiod")
        .style('display', 'none');

    d3.select("#realtime")
        .style('display', 'block');

    document.getElementById("history_tab").className = "button";
    document.getElementById("live_tab").className = "button active";

}

function show_history_charts(chart_type){

    d3.select("#profile")
        .selectAll("div")
        .style('display', 'none');

    d3.select("#history")
        .selectAll("div")
        .style('display', 'none');

    d3.select("#timeperiod")
        .style('display', 'block');

    d3.select("#realtime")
        .style('display', 'none');

    d3.select("#history")
        .selectAll("div[id*='"+chart_type+"']")
        .style('display', 'block');


    document.getElementById("live_tab").className = "button";
    document.getElementById("history_tab").className = "button active";
}

$("#live_tab").click(function(){ show_live_charts(); return false; });
$("#history_tab").click(function(){ show_history_charts("area"); return false; });
$("#history_profile_tab").click(function(){ show_history_charts("profile"); return false; });
$("#history_area_tab").click(function(){ show_history_charts("area"); return false; });
$("#history_sankey_tab").click(function(){ show_history_charts("sankey"); return false; });
$("#history_cost_tab").click(function(){ show_history_charts("cost"); return false; });


function changeBuilding(){
    building_url = "http://localhost:810" + document.getElementById("building").value;
    building_id = building_url.charAt(building_url.length-1);
    getBuildingInfo();

    // reset live data
    data_live = [
        [
            {name: "Strom", values: []},
            {name: "Heizung", values: []},
            {name: "Warmwasser", values: []}
        ],
        [],
        []
    ];

    // reset charts
    d3.select("#charts").selectAll("p,svg").remove();
    
    createLiveProfileChart();

    createHistoryProfileChart();
    createHistoryAreaChart();
    createHistorySankeyChart();
    createHistoryCostChart();

}

function update_history_charts()
{
    start_date = document.getElementById("start_date").value + " " + document.getElementById("start_time").value + ":00";
    end_date = document.getElementById("end_date").value + " " + document.getElementById("end_time").value + ":00";
    building_id = building_url.charAt(building_url.length-1);

    // reset history charts
    d3.select("#history").selectAll("p,svg").remove();

    createHistoryAreaChart();
    createHistoryProfileChart();
    createHistorySankeyChart();
    createHistoryCostChart();

}