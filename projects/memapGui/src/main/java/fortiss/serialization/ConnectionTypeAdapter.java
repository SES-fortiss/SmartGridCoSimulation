package fortiss.serialization;

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

import fortiss.components.Connection;
import fortiss.gui.DesignerPanel;
import fortiss.gui.icons.BuildingIcon;
import fortiss.simulation.helper.ConnectionManager;

public class ConnectionTypeAdapter implements JsonSerializer<Connection>, JsonDeserializer<Connection> {

	@Override
	public Connection deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException {

		JsonObject obj = json.getAsJsonObject();
		String nameNodeA = obj.get("nameNodeA").getAsString();
		String nameNodeB = obj.get("nameNodeB").getAsString();

		GsonBuilder gsonBuilder = new GsonBuilder();

		Gson gson = gsonBuilder.enableComplexMapKeySerialization().excludeFieldsWithoutExposeAnnotation().create();
		Connection connection = gson.fromJson(json, Connection.class);

		ConnectionManager cm = ConnectionManager.getInstance();
		cm.getLines().add(connection.getLn());

		BuildingIcon nodeA = DesignerPanel.buildings.get(nameNodeA).getIcon();
		BuildingIcon nodeB = DesignerPanel.buildings.get(nameNodeB).getIcon();
		connection.setNodeA(nodeA);
		connection.setNodeB(nodeB);
		connection.setLn();
		connection.setColor();

		return connection;
	}

	@Override
	public JsonElement serialize(Connection src, Type typeOfSrc, JsonSerializationContext context) {
		GsonBuilder gsonBuilder = new GsonBuilder();
		Gson gson = gsonBuilder.enableComplexMapKeySerialization().excludeFieldsWithoutExposeAnnotation().create();
		return gson.toJsonTree(src);
	}

}
