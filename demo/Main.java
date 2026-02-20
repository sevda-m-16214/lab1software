package demo;

import connection.CloudConnection;
import devices.SmartLight;
import devices.SmartLock;
import devices.SmartThermostat;
import factory.luxury.LuxuryFactory;
import factory.DeviceFactory;
import adapter.*;
import builder.*;
import prototype.*;

public class Main {
    public static void main(String[] args) {
        
        // Singleton
        CloudConnection c1 = CloudConnection.getInstance();
        CloudConnection c2 = CloudConnection.getInstance();
        System.out.println(c1);
        System.out.println(c2);

        // Abstract Factory
        DeviceFactory factory = new LuxuryFactory();
        SmartLight light = factory.createLight();
        SmartLock lock = factory.createLock();
        SmartThermostat thermostat = factory.createThermostat();

        light.turnOn();
        lock.lock();
        thermostat.setTemperature(22);

        // Adapter
        GlorbThermostat legacy = new GlorbThermostat();
        GlorbAdapter adapter = new GlorbAdapter(legacy);
        adapter.setTemperature(25);

        // Builder
        AutomationRoutine movieNight = new RoutineBuilder()
                .withName("Movie Night")
                .addDevice(light)
                .addDevice(lock)
                .addDevice(thermostat)
                .addDevice(adapter)
                .atTime("20:00")
                .toggleNotification(true)
                .build();

        System.out.println(movieNight);

        // Prototype
        Configuration livingRoom = new Configuration("192.168.1.10", 8080, "v1.0");
        Configuration guestRoom = livingRoom.clone();
        guestRoom.setIp("192.168.1.20");

        System.out.println("Original IP: " + livingRoom.getIp());
        System.out.println("Cloned IP: " + guestRoom.getIp());
    }
}
