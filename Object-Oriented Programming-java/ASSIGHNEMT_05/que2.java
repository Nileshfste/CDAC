package org.exampleq2;

import java.util.Scanner;

class Vehicle {

    private String makeBy;
    private int year;


    public Vehicle() {
        this.makeBy = "";
        this.year = 0;
    }

  
    public Vehicle(String makeBy, int year) {
        this.makeBy = makeBy;
        this.year = year;
    }

    
    public String getMakeBy() {
        return makeBy;
    }

    public void setMakeBy(String makeBy) {
        this.makeBy = makeBy;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

class Car extends Vehicle {
    private String model;

  
    public Car() {
        this.model = "";
    }

    
    public Car(String makeBy, int year, String model) {
        super(makeBy, year); 
        this.model = model;
    }

  
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

  
    public void displayDetails() {
        System.out.println("Make: " + getMakeBy());
        System.out.println("Year: " + getYear());
        System.out.println("Model: " + model);
    }
}

public class que2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        Car car = new Car();

      
        System.out.println("Enter the company name: ");
        car.setMakeBy(sc.nextLine());

        System.out.println("Enter the year of manufacture: ");
        car.setYear(sc.nextInt());
        sc.nextLine();  

        System.out.println("Enter the car model: ");
        car.setModel(sc.nextLine());

    
        car.displayDetails();
    }
}
