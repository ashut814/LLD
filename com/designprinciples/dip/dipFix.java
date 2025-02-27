package com.designprinciples.dip;

// Step 1: Define an abstraction (interface)


interface switchableDevice{
    void turnOn();
    void turnOff();
}

// Step 2: Implement this interface in different devices

class LightBulb implements switchableDevice {
    @Override
    public void turnOn() {
        System.out.println("light is on...");
    }

    @Override
    public void turnOff() {
        System.out.println("light is off");
    }
}

class Fan implements switchableDevice{
    @Override
    public void turnOn() {
        System.out.println("fan is on...");
    }

    @Override
    public void turnOff() {
        System.out.println("fan is off....");
    }
}

// Step 3: Modify Switch to depend on the abstraction

class Switch1{
    private switchableDevice device; // depends on abstraction

    public Switch1(switchableDevice device){
        this.device = device;
    }

    public void toggle(boolean state){
        if(state){
            device.turnOn();
        } else{
            device.turnOff();
        }
    }

}

public class dipFix {
}
