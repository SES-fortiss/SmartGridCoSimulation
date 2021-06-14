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

import fortiss.components.Storage;
import fortiss.gui.icons.ComponentIcon;
import fortiss.media.IconStore;

public class StorageTypeAdapter implements JsonSerializer<Storage>, JsonDeserializer<Storage>{

	@Override
	public Storage deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException {
		GsonBuilder gsonBuilder = new GsonBuilder();
		Gson gson = gsonBuilder.enableComplexMapKeySerialization().excludeFieldsWithoutExposeAnnotation().create();
		
		Storage storage = gson.fromJson(json, Storage.class);
		storage.setIcon(new ComponentIcon(storage, "storage", IconStore.sStorage, IconStore.uStorage));
		return storage;
	}

	@Override
	public JsonElement serialize(Storage src, Type typeOfSrc, JsonSerializationContext context) {
		return new Gson().toJsonTree(src);
	}

}
