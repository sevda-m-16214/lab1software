package factory.luxury;

import devices.*;

public class LuxuryThermostat implements SmartThermostat{
        public void setTemperature(double temp) {
        System.out.println("Luxury Thermostat optimizing to " + temp);
    }
}
