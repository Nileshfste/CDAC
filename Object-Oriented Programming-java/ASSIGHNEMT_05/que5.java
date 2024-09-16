package org.exampleq5;
class Vehicle {
 
 public void startEngine() {
     System.out.println("Vehicle engine is starting...");
 }


 public void stopEngine() {
     System.out.println("Vehicle engine is stopping...");
 }
}

class Car extends Vehicle {

 @Override
 public void startEngine() {
     System.out.println("Car engine is starting with a smooth ignition...");
 }


 @Override
 public void stopEngine() {
     System.out.println("Car engine is stopping quietly...");
 }
}


class Motorcycle extends Vehicle {

 @Override
 public void startEngine() {
     System.out.println("Motorcycle engine is revving up with a loud roar...");
 }

 
 @Override
 public void stopEngine() {
     System.out.println("Motorcycle engine is shutting down with a loud bang...");
 }
}

public class que5{
 public static void main(String[] args) {
     // Create a Car object
     Vehicle car = new Car();
     car.startEngine();  
     car.stopEngine();   

     System.out.println(); 

    
     Vehicle motorcycle = new Motorcycle();
     motorcycle.startEngine(); 
     motorcycle.stopEngine();  
 }
}

