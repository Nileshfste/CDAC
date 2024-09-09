package org.example;


import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

class Toll {
    
    double carTollRate, truckTollRate, motorcycleTollRate;
    
 
    int numberOfCars, numberOfTrucks, numberOfMotorcycles;
    
    
    double totalRevenue;
    

    public double getCarTollRate() {
        return carTollRate;
    }

    public void setCarTollRate(double carTollRate) {
        this.carTollRate = carTollRate;
    }

    public double getTruckTollRate() {
        return truckTollRate;
    }

    public void setTruckTollRate(double truckTollRate) {
        this.truckTollRate = truckTollRate;
    }

    public double getMotorcycleTollRate() {
        return motorcycleTollRate;
    }

    public void setMotorcycleTollRate(double motorcycleTollRate) {
        this.motorcycleTollRate = motorcycleTollRate;
    }

    public int getCarCount() {
        return carCount;
    }

    public void setCarCount(int carCount) {
        this.carCount = carCount;
    }

    public int getTruckCount() {
        return truckCount;
    }

    public void setTruckCount(int truckCount) {
        this.truckCount = truckCount;
    }

    public int getMotorcycleCount() {
        return motorcycleCount;
    }

    public void setMotorcycleCount(int motorcycleCount) {
        this.motorcycleCount = motorcycleCount;
    }

    void setTollRates() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter toll rate for Car (₹): ");
        carTollRate = sc.nextDouble();
        
        System.out.print("Enter toll rate for Truck (₹): ");
        truckTollRate = sc.nextDouble();
        
        System.out.print("Enter toll rate for Motorcycle (₹): ");
        motorcycleTollRate = sc.nextDouble();
    }

   
    void acceptRecord() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of Cars passing through the toll booth: ");
        numberOfCars = sc.nextInt();
        
        System.out.print("Enter number of Trucks passing through the toll booth: ");
        numberOfTrucks = sc.nextInt();
        
        System.out.print("Enter number of Motorcycles passing through the toll booth: ");
        numberOfMotorcycles = sc.nextInt();
    }

   
    void calculateRevenue() {
        totalRevenue = (numberOfCars * carTollRate) + (numberOfTrucks * truckTollRate) + (numberOfMotorcycles * motorcycleTollRate);
    }

   
    void printRecord() {
      
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        
        int totalVehicles = numberOfCars + numberOfTrucks + numberOfMotorcycles;
        System.out.println("Total number of vehicles: " + totalVehicles);
        System.out.println("Total revenue collected: " + currencyFormat.format(totalRevenue));
    }
}

public class que5 {
    public static void main(String[] args) {
        
        Toll manager = new Toll();
        
    
        manager.setTollRates();
        
       
        manager.acceptRecord();
       
        manager.calculateRevenue();
        
       
        manager.printRecord();
    }
}
