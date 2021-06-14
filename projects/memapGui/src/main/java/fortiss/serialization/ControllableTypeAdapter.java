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

import fortiss.components.Controllable;
import fortiss.gui.icons.ComponentIcon;
import fortiss.media.IconStore;

public class ControllableTypeAdapter implements JsonSerializer<Controllable>, JsonDeserializer<Controllable>{

	@Override
	public Controllable deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException {
		GsonBuilder gsonBuilder = new GsonBuilder();
		Gson gson = gsonBuilder.enableComplexMapKeySerialization().excludeFieldsWithoutExposeAnnotation().create();
		
		Controllable controllableProducer = gson.fromJson(json, Controllable.class);
		controllableProducer.setIcon(new ComponentIcon(controllableProducer, "controllable", IconStore.sControllable, IconStore.uControllable));
		return controllableProducer;
	}

	@Override
	public JsonElement serialize(Controllable src, Type typeOfSrc, JsonSerializationContext context) {
		return new Gson().toJsonTree(src);
	}

}