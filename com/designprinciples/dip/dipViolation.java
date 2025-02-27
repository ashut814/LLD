package com.designprinciples.dip;

class Lightbulb{
    public void turnOn(){
        System.out.println("Lightbulb is turned on");
    }

    public void turnOff(){
        System.out.println("Lightbulb is turned off");
    }
}

class Switch {
    private Lightbulb lightbulb;

    public Switch(Lightbulb lightbulb) {
        this.lightbulb = lightbulb;
    }

    public void toggle(boolean state){
        if(state){
            lightbulb.turnOn();
        } else{
            lightbulb.turnOff();
        }
    }
}

public class dipViolation {
}


//(DIP Violation)
// - Switch directly depends on LightBulb → tightly coupled.
// - If we want to control a Fan instead of a LightBulb, we must modify Switch.
// - This violates DIP because high-level module (Switch) depends on low-level module (LightBulb) instead of an abstraction.
