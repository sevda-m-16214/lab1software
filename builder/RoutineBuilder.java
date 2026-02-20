package builder;

import java.util.ArrayList;
import java.util.List;
import devices.*;

public class RoutineBuilder {
    
    private String name;
    private List<SmartDevice> devices = new ArrayList<>();
    private String triggerTime;
    private boolean sendNotification;

    public RoutineBuilder withName(String name){
        this.name = name;
        return this;
    }

    public RoutineBuilder addDevice(SmartDevice device) {
        devices.add(device);
        return this;
    }

    public RoutineBuilder atTime(String time) {
        this.triggerTime = time;
        return this;
    }

    public RoutineBuilder toggleNotification(boolean value) {
        this.sendNotification = value;
        return this;
    }

    public AutomationRoutine build(){
        if (name == null || triggerTime == null)
            throw new IllegalStateException("Name and trigger time required");
        return new AutomationRoutine(name, devices, triggerTime, sendNotification);
    }
}

