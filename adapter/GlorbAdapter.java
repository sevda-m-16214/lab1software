package adapter;

import devices.SmartThermostat;

public class GlorbAdapter implements SmartThermostat{
    private GlorbThermostat glorb;

    public GlorbAdapter(GlorbThermostat glorb) {
        this.glorb = glorb;
    }

    @Override
    public  void setTemperature(double celsius){
        int fahrenheit = (int) Math.round((celsius * 9/5) + 32);
        glorb.setHeatIndex(fahrenheit);
    }
}
