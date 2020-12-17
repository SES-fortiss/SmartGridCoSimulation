package fortiss.serialization;

import java.io.File;
import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import fortiss.components.Volatile;
import fortiss.gui.icons.ComponentIcon;
import fortiss.media.IconStore;
import fortiss.simulation.helper.Logger;
import memap.examples.ExampleFiles;

public class VolatileTypeAdapter implements JsonSerializer<Volatile>, JsonDeserializer<Volatile>{

	@Override
	public Volatile deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException {
		GsonBuilder gsonBuilder = new GsonBuilder();
		Gson gson = gsonBuilder.enableComplexMapKeySerialization().excludeFieldsWithoutExposeAnnotation().create();
		
		Volatile volatileProducer = gson.fromJson(json, Volatile.class);
		volatileProducer.setIcon(new ComponentIcon(volatileProducer, "volatile", IconStore.sVolatile, IconStore.uVolatile));
		
		// Fix path
		String forecastFilePath = volatileProducer.getForecastFile();
		File forecastFile = new File(forecastFilePath);
		ExampleFiles ef = new ExampleFiles();
		if(!forecastFile.exists() && !forecastFilePath.isEmpty() && !ef.isExample(forecastFilePath)) {
			volatileProducer.setForecastFile("");
			Logger.getInstance().writeWarning("File " + forecastFilePath + " does not exist. Using default file.");
		}
		
		return volatileProducer;
	}

	@Override
	public JsonElement serialize(Volatile src, Type typeOfSrc, JsonSerializationContext context) {
		return new Gson().toJsonTree(src);
	}

}
