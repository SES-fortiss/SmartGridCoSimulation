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
import fortiss.components.Demand;
import fortiss.gui.DesignerPanel;

public class BimDemandTypeAdapter implements JsonDeserializer<Demand> {

	@Override
	public Demand deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException {
		
		JsonObject obj = json.getAsJsonObject();
		JsonObject attributes = obj.get("attributes").getAsJsonObject();
		JsonObject element = attributes.get("element").getAsJsonObject();
		String componentNameRaw = element.get("name").getAsString();
		String componentName = componentNameRaw.substring(componentNameRaw.lastIndexOf(":") + 1);
		
		JsonObject others = attributes.get("others").getAsJsonObject();
		String buildingNameRaw = others.get("ebene").getAsString();
		String buildingName = buildingNameRaw.replace("Ebene: ", "").replaceAll("-", "").replaceAll("_", "").replaceAll("\\.", "");
		
		boolean buildingExist = DesignerPanel.buildings.containsKey(buildingName);
		
		Building building;
		if(!buildingExist) {
			double maximumCoordinate = 90.0;
			Point2D position = new Point2D.Double(maximumCoordinate * new Random().nextDouble(), maximumCoordinate * new Random().nextDouble());
			building = new Building(buildingName, 0, position);
			DesignerPanel.buildings.put(buildingName, building);
			
		} else {
			building = DesignerPanel.buildings.get(buildingName);
		}
		
		Demand demand = new Demand(building, componentName, "");
		
		building.addDemand(demand);
		DesignerPanel.selectedBuilding = building;
		DesignerPanel.selectedComponent = demand;
		
		return demand;
	}

}
