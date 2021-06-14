package fortiss.serialization;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import fortiss.components.Coupler;
import fortiss.gui.icons.ComponentIcon;
import fortiss.media.IconStore;

public class CouplerTypeAdapter implements JsonSerializer<Coupler>, JsonDeserializer<Coupler>{

	@Override
	public Coupler deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException {
		GsonBuilder gsonBuilder = new GsonBuilder();
		Gson gson = gsonBuilder.enableComplexMapKeySerialization().excludeFieldsWithoutExposeAnnotation().create();
		
		Coupler coupler = gson.fromJson(json, Coupler.class);
		coupler.setIcon(new ComponentIcon(coupler, "coupler", IconStore.sCoupler, IconStore.uCoupler));
		return coupler;
	}

	@Override
	public JsonElement serialize(Coupler src, Type typeOfSrc, JsonSerializationContext context) {
		return new Gson().toJsonTree(src);
	}

}
