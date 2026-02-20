package factory.budget;

import factory.DeviceFactory;
import devices.*;


public class BudgetFactory implements DeviceFactory{
    
    @Override
    public SmartLight createLight() {
        return new BudgetLight();
    }

    @Override
    public SmartLock createLock() {
        return new BudgetLock();
    }

    @Override
    public SmartThermostat createThermostat() {
        return new BudgetThermostat();
    }
}
