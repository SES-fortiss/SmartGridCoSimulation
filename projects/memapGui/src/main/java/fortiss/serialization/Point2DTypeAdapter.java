package fortiss.serialization;

import java.awt.geom.Point2D;
import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class Point2DTypeAdapter implements JsonSerializer<Point2D>, JsonDeserializer<Point2D> {
	@Override
	public JsonElement serialize(Point2D src, Type typeOfSrc, JsonSerializationContext context) {
		return new Gson().toJsonTree(src);
	}

	@Override
	public Point2D deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException {

        Point2D.Double point = new Point2D.Double();
        JsonObject obj = json.getAsJsonObject();

        point.x = obj.get("x").getAsDouble();
        point.y = obj.get("y").getAsDouble();

        return point;
	}
}
