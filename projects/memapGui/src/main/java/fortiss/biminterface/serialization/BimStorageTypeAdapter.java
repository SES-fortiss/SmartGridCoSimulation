package fortiss.biminterface.serialization;

import java.awt.geom.Point2D;
import java.lang.reflect.Type;
import java.util.Random;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import fortiss.components.Building;
import fortiss.components.Storage;
import fortiss.gui.DesignerPanel;

public class BimStorageTypeAdapter implements JsonDeserializer<Storage> {

	@Override
	public Storage deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException {

		JsonObject obj = json.getAsJsonObject();
		JsonObject attributes = obj.get("attributes").getAsJsonObject();
		JsonObject element = attributes.get("element").getAsJsonObject();
		String componentNameRaw = element.get("name").getAsString();
		String componentName = componentNameRaw.substring(componentNameRaw.lastIndexOf(":") + 1);

		JsonObject others = attributes.get("others").getAsJsonObject();
		String buildingNameRaw = others.get("ebene").getAsString();
		String buildingName = buildingNameRaw.replace("Ebene: ", "").replaceAll("-", "").replaceAll("_", "").replaceAll("\\.", "");
		String networkType = (others.get("network type_wärme").getAsInt() == 1) ? "Heat" : "Electricity";
		double capacity = others.get("installed capacity").getAsDouble() / 1000 / 38750.0775;
		
		capacity = Math.round(capacity*100) / 100;
		
		double soc = others.get("state of charge").getAsDouble() / 100;
		double losses = 0.01;
		double maxCharging = others.get("max. charge rate").getAsDouble() / 1000;
		double maxDischarging = others.get("max. discharge rate").getAsDouble() / 1000;
		double effIN = others.get("charge efficiency").getAsDouble();
		double effOUT = others.get("discharge efficiency").getAsDouble();

		Building building;
		synchronized (DesignerPanel.buildings) {
		
			boolean buildingExist = DesignerPanel.buildings.containsKey(buildingName);
			
			if (!buildingExist) {
				double maximumCoordinate = 90.0;
				Point2D position = new Point2D.Double(maximumCoordinate * new Random().nextDouble(), maximumCoordinate * new Random().nextDouble());
				building = new Building(buildingName, 0, position);
				DesignerPanel.buildings.put(buildingName, building);
			} else {
				building = DesignerPanel.buildings.get(buildingName);
			}
		}
			
		Storage storage = new Storage(building, componentName, networkType, capacity, soc, losses, maxCharging,
				maxDischarging, effIN, effOUT);

		building.addStorage(storage);
		DesignerPanel.selectedBuilding = building;
		DesignerPanel.selectedComponent = storage;

		return storage;
	}

}
