package memap.helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

import memap.examples.ExampleFiles;
import memap.main.TopologyConfig;
import simulation.SimulationStarter;

public abstract class Prices {
	
	private String examplePath;
	private ArrayList<Double> buyingPrices;
	private ArrayList<Double> sellingPrices;
	
	protected ArrayList<Double> getBuyingPrices(){
		return buyingPrices;
	}
	protected ArrayList<Double> getSellingPrices(){
		return sellingPrices;
	}
	
	protected ArrayList<Double> readPrices(String pricePath) {
		ArrayList<Double> prices = new ArrayList<Double>();
		
		if (pricePath == null || pricePath.isEmpty()) {
			pricePath = examplePath; // Load empty data
			System.err.println("Variable market price selected but input file [" + pricePath + "] is not provided. Using example file");
		}
		try {	
			FileManager fm = new FileManager();
			ExampleFiles ef = new ExampleFiles();
			if (ef.isExample(pricePath)) {
				prices = read(fm.readFromResources(ef.getFile(pricePath)));
			} else {
				prices = read(fm.readFromSource(pricePath));
			}
		} catch (Exception e) {
			System.err.println("Error reading or parsing price data " + pricePath);
			SimulationStarter.stopSimulationStatic();
			e.printStackTrace();
		}
		return prices;	
	}
	
	abstract protected ArrayList<Double> read(BufferedReader br) throws IOException, ParseException;
	
	protected ArrayList<Double> repeatPrice(double price){
		ArrayList<Double> prices = new ArrayList<Double>();
		for (int i = 0; i < TopologyConfig.getInstance().getNrStepsMPC() * 2; i++) {
			prices.add(price);
		}
		return prices;
	}
	
	public Prices(double buyingPrice, double sellingPrice, String examplePath) {
		buyingPrices = repeatPrice(buyingPrice);
		sellingPrices = repeatPrice(sellingPrice);
	}
	
	public Prices(double buyingPrice, String sellingPricePath, String examplePath) {
		buyingPrices = repeatPrice(buyingPrice);
		sellingPrices = readPrices(sellingPricePath);
	}

	public Prices(String buyingPricePath, double sellingPrice, String examplePath) {
		buyingPrices = readPrices(buyingPricePath);
		sellingPrices = repeatPrice(sellingPrice);
	}
	
	public Prices(String buyingPricePath, String sellingPricePath, String examplePath) {
		buyingPrices = readPrices(buyingPricePath);
		sellingPrices = readPrices(sellingPricePath);
	}
	
	public double getBuyingPriceForTimestep(int timestep) {
		return buyingPrices.get(timestep % buyingPrices.size());
	}
	
	public double getSellingPriceForTimestep(int timestep) {
		return sellingPrices.get(timestep % sellingPrices.size());
	}
	
}
