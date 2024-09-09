package org.example;
import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Locale;

class Discount{
    double originalPrice;
    float discountRate;
    double discountAmount;
    double finalPrice;
  
    
    public void setoriginalPrice(double originalPrice)
    {
    	this.originalPrice = originalPrice;
    }
    
    public void setdiscountRatee(float discountRate)
    {
    	this.discountRate = discountRate;
    }
   
    void acceptRecord() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter original price: ");
        setoriginalPrice(sc.nextDouble());
        
        System.out.print("Enter discount rate (in %): ");
        
        setdiscountRatee(sc.nextFloat());
        
        sc.close();  
    }

    
    void calculate() {
       
        discountAmount = originalPrice * (discountRate / 100);
        
       
        finalPrice = originalPrice - discountAmount;
    }

   
    void print() {
       
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        
        System.out.println("Discount Amount: " + currencyFormat.format(discountAmount));
        System.out.println("Final Price: " + currencyFormat.format(finalPrice));
    }
}

public class que4 {
    public static void main(String[] args) {
       
        Discount calculator = new Discount();
            
        calculator.acceptRecord();
        calculator.calculate();
        calculator.print();
    }
}
