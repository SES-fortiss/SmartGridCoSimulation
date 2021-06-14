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

import fortiss.gui.listeners.helper.CO2Emission;
import fortiss.gui.listeners.helper.ElectricityPrice;
import fortiss.gui.listeners.helper.HeatPrice;
import fortiss.gui.listeners.helper.Price;
import fortiss.simulation.Parameters;

public class ParametersTypeAdapter implements JsonSerializer<Parameters>, JsonDeserializer<Parameters> {

	@Override
	public Parameters deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException {

		JsonObject obj = json.getAsJsonObject();

		int simulationSteps = obj.get("stepsPerDay").getAsInt();
		int mpcHorizon = obj.get("mpcHorizon").getAsInt();
		int days = obj.get("days").getAsInt();
		String optCriteria = obj.get("optCriteria").getAsString();
		String optimizer = obj.get("optimizer").getAsString();
		String loggingMode = obj.get("loggingMode").getAsString();

		JsonObject elecBuyingPriceObj = obj.get("elecBuyingPrice").getAsJsonObject();
		JsonObject elecSellingPriceObj = obj.get("elecSellingPrice").getAsJsonObject();
		JsonObject heatBuyingPriceObj = obj.get("heatBuyingPrice").getAsJsonObject();

		Price elecBuyingPrice = new ElectricityPrice(elecBuyingPriceObj.get("fixed").getAsBoolean(),
				elecBuyingPriceObj.get("price").getAsDouble(), elecBuyingPriceObj.get("priceFilePath").getAsString(),
				mpcHorizon);
		Price elecSellingPrice = new ElectricityPrice(elecSellingPriceObj.get("fixed").getAsBoolean(),
				elecSellingPriceObj.get("price").getAsDouble(), elecSellingPriceObj.get("priceFilePath").getAsString(),
				mpcHorizon);
		Price heatBuyingPrice = new HeatPrice(heatBuyingPriceObj.get("fixed").getAsBoolean(),
				heatBuyingPriceObj.get("price").getAsDouble(), heatBuyingPriceObj.get("priceFilePath").getAsString(),
				mpcHorizon);

		JsonObject co2EmissionsObj = obj.get("co2Emissions").getAsJsonObject();

		Price co2Emissions = new CO2Emission(co2EmissionsObj.get("fixed").getAsBoolean(),
				co2EmissionsObj.get("price").getAsDouble(), co2EmissionsObj.get("priceFilePath").getAsString(),
				mpcHorizon);

		elecBuyingPrice.loadFromFile(mpcHorizon);
		elecSellingPrice.loadFromFile(mpcHorizon);
		heatBuyingPrice.loadFromFile(mpcHorizon);
		co2Emissions.loadFromFile(mpcHorizon);

		Parameters parameters = new Parameters(simulationSteps, mpcHorizon, days, optCriteria, optimizer, loggingMode,
				elecBuyingPrice, elecSellingPrice, heatBuyingPrice, co2Emissions);

		return parameters;
	}

	@Override
	public JsonElement serialize(Parameters src, Type typeOfSrc, JsonSerializationContext context) {
		Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
		return gson.toJsonTree(src);
	}

}
