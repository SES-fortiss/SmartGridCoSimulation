package fortiss.serialization;

import java.awt.geom.Point2D;
import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import fortiss.components.Building;
import fortiss.components.Component;
import fortiss.components.Controllable;
import fortiss.components.Coupler;
import fortiss.components.Demand;
import fortiss.components.Storage;
import fortiss.components.Volatile;
import fortiss.gui.icons.BuildingIcon;

public class BuildingTypeAdapter implements JsonSerializer<Building>, JsonDeserializer<Building> {

	@Override
	public Building deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException {

		JsonObject obj = json.getAsJsonObject();
		JsonObject icon = obj.get("icon").getAsJsonObject();
		JsonObject pos = icon.get("position").getAsJsonObject();
		double x = pos.get("x").getAsDouble();
		double y = pos.get("y").getAsDouble();
		Point2D position = new Point2D.Double(x, y);

		GsonBuilder gsonBuilder = new GsonBuilder();
		gsonBuilder.registerTypeAdapter(Point2D.class, new Point2DTypeAdapter());
		gsonBuilder.registerTypeAdapter(Demand.class, new DemandTypeAdapter());
		gsonBuilder.registerTypeAdapter(Storage.class, new StorageTypeAdapter());
		gsonBuilder.registerTypeAdapter(Volatile.class, new VolatileTypeAdapter());
		gsonBuilder.registerTypeAdapter(Controllable.class, new ControllableTypeAdapter());
		gsonBuilder.registerTypeAdapter(Coupler.class, new CouplerTypeAdapter());

		Gson gson = gsonBuilder.enableComplexMapKeySerialization().excludeFieldsWithoutExposeAnnotation().create();
		Building building = gson.fromJson(json, Building.class);

		for (Component component : building.getComponents()) {
			component.setBuilding(building);
		}

		building.setIcon(new BuildingIcon(building, building.getName(), position));

		return building;
	}

	@Override
	public JsonElement serialize(Building src, Type typeOfSrc, JsonSerializationContext context) {
		GsonBuilder gsonBuilder = new GsonBuilder();
		gsonBuilder.registerTypeAdapter(Point2D.class, new Point2DTypeAdapter());
		Gson gson = gsonBuilder.enableComplexMapKeySerialization().excludeFieldsWithoutExposeAnnotation().create();
		return gson.toJsonTree(src);
	}

}
