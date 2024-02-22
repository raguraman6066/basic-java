package com.example.lib;
//child class
public class Bus extends Vehicle implements  VehicleInterface{
    String bikeModel;
    public Bus(String bikeModel) {
        super(2);
        this.bikeModel=bikeModel;//reference variable used to refer current instance of the class
    }

    void honk(){//sound
        System.out.println("Beep! Beep!");
    }

    @Override
    void start() {
        super.start();
    }

    @Override
    void stop() {
        super.stop();
    }

    @Override
    void brake() {

    }

    @Override
    public void startEngine() {

    }

    @Override
    public void stopEngine() {

    }
}
