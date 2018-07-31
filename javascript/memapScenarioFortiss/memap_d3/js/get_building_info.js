function getBuildingInfo() {
    $.ajax({
        dataType: "json",
        url: building_url,
        async: true,
        success: function (result) {
            // remove old device list
            d3.select(".devices").html("");

            var html_string = "";

            // producers
            for (var p in result.producers) {
                if (!result.producers.hasOwnProperty(p)) continue;
                var obj_p = result.producers[p];

                if (html_string === "") {
                    html_string = "<table style='width:100%'>";
                }

                if (obj_p.name === "PV") {
                    html_string += "<tr><th><img src='icons/electricity.png' alt='Strom' style='width:20px;height:20px;'></th><td>" + obj_p.name + "</td></tr>";
                }
                else if (obj_p.name === "BHKW") {
                    html_string += "<tr><th><img src='icons/electricity.png' alt='Strom' style='width:20px;height:20px;'><img src='icons/sun.png' alt='Wärme' style='width:20px;height:20px;'></th><td>" + obj_p.name + "</td></tr>";
                }
                else {
                    html_string += "<tr><th><img src='icons/sun.png' alt='Wärme' style='width:20px;height:20px;'></th><td>" + obj_p.name + "</td></tr>";
                }
            }

            // storages
            for (var s in result.storages) {
                if (!result.storages.hasOwnProperty(s)) continue;
                var obj_s = result.storages[s];

                if (html_string === "") {
                    html_string = "<table style='width:100%'>";
                }

                html_string += "<tr><th><img src='icons/battery.png' alt='Speicher' style='width:20px;height:20px;'></th><td>" + obj_s.name + "</td></tr>";
            }

            if (html_string !== "") {
                html_string += "</table>";
            }

            d3.select(".devices").html(html_string);
        }
    });
}