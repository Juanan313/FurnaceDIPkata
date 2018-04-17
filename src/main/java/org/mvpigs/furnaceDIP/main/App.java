package org.mvpigs.furnaceDIP.main;

import org.mvpigs.furnaceDIP.hardware.GasHeater;
import org.mvpigs.furnaceDIP.hardware.Regulator;
import org.mvpigs.furnaceDIP.hardware.RemoteCommandSensor;
import org.mvpigs.furnaceDIP.interfaces.Heater;
import org.mvpigs.furnaceDIP.interfaces.Thermometer;
import org.mvpigs.furnaceDIP.otherstuff.Jedi;
import org.mvpigs.furnaceDIP.types.RoomTemperature;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	final double minTemp = 15.0;
        final double maxTemp = 21.0;
        
        RoomTemperature temperature = RoomTemperature.getInstance();
        temperature.setTemperature(15);
        Heater heater = new GasHeater();
        Thermometer thermometer = new RemoteCommandSensor();
        
        Regulator regulator = new Regulator();
        
        System.out.println( "Arrancando..." );
        regulator.regulate(thermometer, heater, minTemp, maxTemp, temperature);
        
        Jedi yoda = new Jedi();
        RoomTemperature temperature2 = RoomTemperature.getInstance();
        System.out.println( "\nArrancando a Yoda: " );
        regulator.regulate(thermometer, yoda, minTemp, maxTemp, temperature2);
        yoda.speak();
    }
}
