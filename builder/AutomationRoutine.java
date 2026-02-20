package builder;

import java.util.List;
import devices.*;

public class AutomationRoutine {
    
    private String name;
    private List<SmartDevice> devices;
    private String triggerTime;
    private boolean sendNotification;

    public AutomationRoutine(String name, List<SmartDevice> devices, 
                            String triggerTime, boolean sendNotification) {
        this.name = name;
        this.devices = devices;
        this.triggerTime = triggerTime;
        this.sendNotification = sendNotification;
    }

    @Override
    public String toString(){
        return "Routine: " + name + "at " + triggerTime +
                ", Devices: " + devices.size() + 
                ", Notification: " + sendNotification;
    }
}
