package com.driver;

public class F1 extends Car {
    public F1(String name, boolean isManual) {
        super(name, 4, 2, 7, isManual, "Formula 1", 1);
    }

    public void accelerate(int rate) {
        int newSpeed = getCurrentSpeed() + rate;

        if (newSpeed >= 0 && newSpeed <= 250) {
            if (newSpeed <= 50) {
                changeGear(1);
            } else if (newSpeed <= 100) {
                changeGear(2);
            } else if (newSpeed <= 150) {
                changeGear(3);
            } else if (newSpeed <= 200) {
                changeGear(4);
            } else if (newSpeed <= 250) {
                changeGear(5);
            }
        } else if (newSpeed > 250) {
            changeGear(6);
        } else {
            stop();
            changeGear(1);
        }

        if (newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
