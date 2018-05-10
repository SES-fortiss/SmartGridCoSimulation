//var building_url = "http://localhost:8103";

$(document).ready(function() {
    getBuildingInfo();
    createChart_s();
    createChart_p();
    document.getElementById('container_sankey').style.visibility ='hidden';
    $('#container_sankey').find('.highcharts-container').hide();
});