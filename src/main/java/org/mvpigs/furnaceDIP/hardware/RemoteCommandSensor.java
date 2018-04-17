package org.mvpigs.furnaceDIP.hardware;

import org.mvpigs.furnaceDIP.interfaces.Thermometer;
import org.mvpigs.furnaceDIP.types.RoomTemperature;

public class RemoteCommandSensor implements Thermometer {
	
	public double read(RoomTemperature temperature){
		return temperature.getTemperature();
	}

}
