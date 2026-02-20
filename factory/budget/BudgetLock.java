package factory.budget;

import devices.*;

public class BudgetLock implements SmartLock{
        public void lock() {
        System.out.println("Budget Lock secured (No camera)");
    }
}
