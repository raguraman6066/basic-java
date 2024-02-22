package com.example.lib;

public class Car{
    //state
   private int year;
  private int speed;
   public int getYear(){
    return year;
   }

   public void setYear(int newYear){
       year=newYear;
   }
    //methods
    void accelerate(){
        speed+=10;
        System.out.println("your new speed is "+speed);
    }
    void brake(){
        speed-=5;
        System.out.println("your new speed is "+speed);
    }


    //constructor-special method, used to create and initialize the object -set initial values
    public Car(int carSpeed,int carYear){
        year =carYear;
        speed=carSpeed;
    }
}