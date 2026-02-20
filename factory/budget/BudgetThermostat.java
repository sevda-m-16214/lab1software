package factory.budget;

import devices.*;

public class BudgetThermostat implements SmartThermostat{
        public void setTemperature(double temp) {
        System.out.println("Budget Thermostat setting temp slowly to " + temp);
    }
}
