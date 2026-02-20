package factory.luxury;

import devices.*;

public class LuxuryLock implements SmartLock{
        public void lock() {
        System.out.println("Luxury Lock secured with Face ID");
    }
}
