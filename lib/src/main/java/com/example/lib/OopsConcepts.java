package com.example.lib;




/*
1. methods-block of code that perform specific task, divide complex problem into small chunks, easy to understand and reuse
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


//1. method -user defined methods-own methods, standard library methods-in built methods in java available to use

//declare method in java
/*
return type methodName(datatype variable name){method body-programming statements} methodName- identifier

 accept value from method- parameters
 */


public class OopsConcepts {

    public static void main(String[] args) {
        //Car redCar=new Car(150,2024);//constructors of the class to create object-special method, name is same as class name
        //redCar.speed=180;//using dot operate to access members of the class
        //redCar.year=2023;
        //redCar.accelerate();
        //redCar.brake();
       // Bike bike=new Bike("C200");//create object for child class not super class
        Bus bike=new Bus("cn100");
        bike.numberOfWheels=20;//inherited from parent class
        bike.start();
        bike.honk();//getting from child class
        bike.stop();

        Vehicle v1=new Bus("BMW");
        Vehicle v2=new Truck(6);
        v1.start();
        v2.start();

    }

    //no return type -void
   static void sayHello(){
        System.out.println("hello from the method");
    }

    //return type
    static int addNumber(int x,int y){
//        int x=10;
//        int y=20;
        return x+y;
    }

    //method overloading- same method name with different parameters- in same class

    static double addNumber(double a,double b){
        return a+b;
    }


    //java -oops - break complex problem into smaller objects
    //object -an instance of the class,any entity that has state and behaviour ex bicycle
    //class - is a template or blueprint - can crate many object from one blueprint

    //object creation-Classname objectName=new ClassName();


}
/*
class ClassName
{
    //fields-state-attributes:store data
    //methods-functionalities-behaviour:perform operations
}
*/




//access modifiers are keywords used to control visibility and accessibility of class , methods ,fields
//public private, protected default - protect data from un-authorized access

//public - it can access from any other class or package.
//private- only access inside in same class
//protected - access by classes within same package and also by sub classes
//default- without specify any access modifiers. only in same package


//encapsulation- box..that you can only open and play with, we can put toys and u can take and go out and play..but no one can open
//toys are safe ..like protected toy box ..use getter and setter .. data binding


//inheritance- derive new class from parent class

 //override -methods and properties of parent class overrides by child class
//same method is defied in both super and subclass.then..subclass overrides superclass method
//same method name , same return type, same parameters

//we cant override final and static methods


//polymorphism-create single method, it execute differently for different classes
//object of different classes treated as object of common parent class
// /*
//        Vehicle v1=new Bus("BMW");
//        Vehicle v2=new Truck(6);
//        v1.start();
//        v2.start();
// */


//abstraction-hide unnecessary details and only show the needed ..vehicle
//abstract class- unable to create objects,,


//interface- set of rules what all implemented class should follow ..multiple interface supported, not inheritance
//implements - interface, extends- inheritance

//create abstract class and implement method..and crate new class and call the abstract method and use it.