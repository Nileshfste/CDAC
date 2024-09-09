package org.example;


import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class que1 {
    
    private double principal;
    private double annualInterestRate;
    private int loanTermInYears;
    
    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getLoanTermInYears() {
        return loanTermInYears;
    }

    public void setLoanTermInYears(int loanTermInYears) {
        this.loanTermInYears = loanTermInYears;
    }
    
    public void acceptRecord(Scanner scanner ) {
  
        
        System.out.print("Enter the loan amount (principal): ");
        setPrincipal(scanner.nextDouble());
        
        System.out.print("Enter the annual interest rate (in %): ");
        setAnnualInterestRate(scanner.nextDouble());
        
        System.out.print("Enter the loan term (in years): ");
        setLoanTermInYears(scanner.nextInt());
        
        scanner.close();
    }
    
    public double calculateMonthlyPayment() {
        double monthlyInterestRate = getAnnualInterestRate() / 12 / 100;
        int numberOfMonths = getLoanTermInYears() * 12;
        
       
        double monthlyPayment = getPrincipal() * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) 
                                / (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);
        
        return monthlyPayment;
    }
    
    public void printRecord() {
        double monthlyPayment = calculateMonthlyPayment();
        int numberOfMonths = getLoanTermInYears() * 12;
        double totalPayment = monthlyPayment * numberOfMonths;
        
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        
        System.out.println("Monthly Payment: " + currencyFormat.format(monthlyPayment));
        System.out.println("Total Payment (over " + getLoanTermInYears() + " years): " + currencyFormat.format(totalPayment));
    }

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        que1 calculator = new que1();
        while(true)
        	
        {   System.out.println("1:-call acceptRecord" );
           
            System.out.println("2:-call   EXIT" );
                int count=scanner.nextInt();
                switch(count)
                {  case 1:{
                	      calculator.acceptRecord(scanner);
                	
           	               calculator.printRecord();
           	              break;
                          }
                case 2:{
             	        System.exit(0);
             	     break;
                       }
                
                }
               
                
        
        }
        	
        
       
    }
}


