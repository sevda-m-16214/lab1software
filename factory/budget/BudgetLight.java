package factory.budget;

import devices.*;

public class BudgetLight implements SmartLight{
    public void turnOn() {
        System.out.println("Budget Plastic Light ON");
    }
}
