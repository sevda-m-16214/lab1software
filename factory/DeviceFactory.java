package factory;

import devices.*;

public interface DeviceFactory {

    SmartLight createLight();

    SmartLock createLock();
    
    SmartThermostat createThermostat();
} 
