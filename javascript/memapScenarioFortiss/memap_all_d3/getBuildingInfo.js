function getBuildingInfo() {
    $.ajax({
        dataType: "json",
        url: building_url,
        async: true,
        success: function (result) {
            //Building number
            document.getElementById("number").innerHTML = "Haus Nr.: " + building_url.charAt(20);
            // remove old device list
            var DeviceNode = document.getElementById("devices");
            while (DeviceNode.firstChild) {
                DeviceNode.removeChild(DeviceNode.firstChild);
            }

            //Producers
            for (var p in result.producers) {
                if (!result.producers.hasOwnProperty(p)) continue;
                var obj_p = result.producers[p];

                //create new li element
                var newNumberListItem_p = document.createElement("li");

                //create new text node
                var numberListValue_p = document.createTextNode(obj_p.name);

                //add text node to li element
                newNumberListItem_p.appendChild(numberListValue_p);

                //add new list element built in previous steps to unordered list
                //called numberList
                document.getElementById("devices").appendChild(newNumberListItem_p);
            }

            //Storages
            for (var s in result.storages) {
                if (!result.storages.hasOwnProperty(s)) continue;
                var obj_s = result.storages[s];

                //create new li element
                var newNumberListItem_s = document.createElement("li");

                //create new text node
                var numberListValue_s = document.createTextNode(obj_s.name);

                //add text node to li element
                newNumberListItem_s.appendChild(numberListValue_s);

                //add new list element built in previous steps to unordered list
                //called numberList
                document.getElementById("devices").appendChild(newNumberListItem_s);
            }
        }
    });
}