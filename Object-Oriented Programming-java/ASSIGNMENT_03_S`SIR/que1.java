package org.example;
import java.util.Scanner;
class Loan{
	float principal_amount; 
	int annual_interest_rate;
	int loan_term; 
   
	
	public void calculation() {
	       double monthlyPayment = (principal_amount* annual_interest_rate * Math.pow(1 + annual_interest_rate, loan_term)) /
                   (Math.pow(1 + annual_interest_rate, loan_term) - 1);
	       System.out.printf("The monthly mortgage payment is:₹ %.2f%n", monthlyPayment);
	      
	}
    public void accept(){
	Scanner sc = new Scanner(System.in);
	System.out.print("enter the principal amount:");
	principal_amount = sc.nextFloat();
	
	System.out.print("enter the annual_interest_rate:");
	annual_interest_rate = sc.nextInt();
	
	System.out.print("enter the loan_term:");
	loan_term = sc.nextInt();
	
    }
     void print(){
    	
            
         

     }}

class que1{
	
 public static  void main(String[] args) 
 {
	 Loan l1 = new Loan();
	 l1.accept();
	 l1.calculation();
	 
	 
	
	
	
    }

}



