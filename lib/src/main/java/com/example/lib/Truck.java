package com.example.lib;

public class Truck extends Vehicle{
    public Truck(int numberOfWheels) {
        super(numberOfWheels);
    }

    @Override
    void start() {
        super.start();
        System.out.println("truck starts");
    }

    @Override
    void brake() {

    }
}
