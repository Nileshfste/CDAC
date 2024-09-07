package org.example;


import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

class Toll {
    
    double carTollRate, truckTollRate, motorcycleTollRate;
    
 
    int numberOfCars, numberOfTrucks, numberOfMotorcycles;
    
    
    double totalRevenue;
    


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

    // Method to calculate the total revenue
    void calculateRevenue() {
        totalRevenue = (numberOfCars * carTollRate) + (numberOfTrucks * truckTollRate) + (numberOfMotorcycles * motorcycleTollRate);
    }

    // Method to display the total number of vehicles and the total revenue
    void printRecord() {
        // Format the output to Indian Rupees (₹)
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
