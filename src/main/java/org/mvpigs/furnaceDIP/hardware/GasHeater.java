package org.mvpigs.furnaceDIP.hardware;

import org.mvpigs.furnaceDIP.interfaces.Heater;
import org.mvpigs.furnaceDIP.types.RoomTemperature;

public class GasHeater implements Heater {
	
	public void engage(RoomTemperature temperature){
		temperature.incrementTemperature(1);
	}
	
	public void disengage(RoomTemperature temperature){
		temperature.incrementTemperature(-1);
	}
}
