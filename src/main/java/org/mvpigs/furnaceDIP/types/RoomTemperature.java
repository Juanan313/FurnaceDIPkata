package org.mvpigs.furnaceDIP.types;

public class RoomTemperature {
	
	private static RoomTemperature instance = new RoomTemperature();

	private double temperature = 0;
	
	private RoomTemperature(){
		
	}

	public double getTemperature() {
		return this.temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	
	public void incrementTemperature(double increment){
		this.temperature += increment;
	}

	public static RoomTemperature getInstance() {
		return instance;
	}

}
