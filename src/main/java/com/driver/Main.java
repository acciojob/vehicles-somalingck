package com.driver;

public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("Mercedes", false);
        mercedes.changeSpeed(40, 0);
        System.out.println("Current Speed: " + mercedes.getCurrentSpeed());
        System.out.println("Current Gear: " + mercedes.getCurrentGear());

        mercedes.accelerate(20);
        System.out.println("Accelerating...");

        System.out.println("New Speed: " + mercedes.getCurrentSpeed());
        System.out.println("New Gear: " + mercedes.getCurrentGear());

        mercedes.accelerate(-60);
        System.out.println("Decelerating...");

        System.out.println("New Speed: " + mercedes.getCurrentSpeed());
        System.out.println("New Gear: " + mercedes.getCurrentGear());
    }
}
