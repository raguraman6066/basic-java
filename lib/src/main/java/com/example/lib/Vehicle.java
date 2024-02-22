package com.example.lib;



//parent class
public abstract class Vehicle {
    int numberOfWheels;

    public Vehicle(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    void start(){
        System.out.println("the vehicle starts");
    }
    void  stop(){
        System.out.println("the vehicle stops");
    }

    abstract void brake();
}
