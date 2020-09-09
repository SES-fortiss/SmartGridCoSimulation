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

import fortiss.components.Demand;
import fortiss.gui.icons.ComponentIcon;
import fortiss.media.IconStore;

public class DemandTypeAdapter implements JsonSerializer<Demand>, JsonDeserializer<Demand>{

	@Override
	public Demand deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException {
		GsonBuilder gsonBuilder = new GsonBuilder();
		Gson gson = gsonBuilder.enableComplexMapKeySerialization().excludeFieldsWithoutExposeAnnotation().create();
		
		Demand demand = gson.fromJson(json, Demand.class);
		demand.setIcon(new ComponentIcon(demand, "demand", IconStore.sDemand, IconStore.uDemand));
		
		// Fix path
		String consumptionFilePath = demand.getConsumptionProfile();
		File consumptionFile = new File(consumptionFilePath);
		if(!consumptionFile.exists() && !consumptionFilePath.isEmpty()) {
			demand.setConsumptionProfile("");
			System.out.println("<WARN> - File " + consumptionFilePath + " does not exist. Using zeros only.");
		}
		return demand;
	}

	@Override
	public JsonElement serialize(Demand src, Type typeOfSrc, JsonSerializationContext context) {
		return new Gson().toJsonTree(src);
	}
}
