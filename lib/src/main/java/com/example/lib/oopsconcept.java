package com.example.lib;


import test.Car;


public class oopsconcept {
    public static void main(String[] args) {
        sayHello();

       System.out.println("result "+addNumbers(10,22,30));
       //class - object
        Car redCar=new Car(150,2024);
//        redCar.speed=180;
//        redCar.year=2023;
        System.out.println("getter"+redCar.getYear());
        redCar.accelerate();
        redCar.brack();


        //

        Vehicle v1=new Truck(4);
        Vehicle v2=new Bike("BMW");
        v1.brack();
        v2.brack();





    }
    static void sayHello(){
        System.out.println("Hello...");
    }
    static int addNumbers(int x,int y){
        return x+y;
    }
    static int addNumbers(int x,int y,int z){
        return x+y+z;
    }

}

 class ClassName{
    //fields-store data
     //methods-perform actions
 }

 //class
 abstract   class Vehicle {
     int numberOfWheels;

     public Vehicle(int numberOfWheels) {
         this.numberOfWheels = numberOfWheels;
     }
     void start(){
         System.out.println("vehicle starts");
     }
     void stop(){
         System.out.println("vehicle stops");
     }
     abstract void brack();
 }

 class Truck extends  Vehicle{

    public Truck(int numberOfWheels) {
        super(numberOfWheels);
    }

     @Override
     void start() {
         super.start();
         System.out.println("truck starts");
     }

     @Override
     void brack() {
         System.out.println("truck break");
     }
 }
 class Bike extends  Vehicle implements  VehicleInterface{
    String carModel;
    public Bike(String carModel) {
        super(4);
        this.carModel=carModel;
    }

     @Override
     void start() {
         super.start();
         System.out.println("bike start");
     }
     @Override
     void brack() {
         System.out.println("bike break");
     }

     @Override
     public void startEngine() {

     }

     @Override
     public void stop() {

     }
 }



/*
1. methods
2. return type
3. method parameters
4. method overloading
5. class
6. objects
7. constructors (spl method . create and initialize object(with values))
8. access modifiers(class, field, methods-public, private, protected)
9. encapsulation (protect data or methods-spl toy box) - using getter and setter(public methods) access private data
10. inheritance
11. inheritance - refer super class members use super keyword
12. this- reference to current instance of class
13. method override
14. polymorphism
14. abstraction-hiding implementation details
15. interface

**/

