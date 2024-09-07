package org.example;

import java.util.Scanner;

class Interst{
	double principal_amt;
	float annual_interest_rate;
	int numberOfCompounds;
	int years;
	
	 void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter principal_amt=");
		principal_amt =sc.nextDouble();
		
		System.out.print("Enter annual_interest_rate=");
		annual_interest_rate =sc.nextFloat();
		
		System.out.print("Enter numberOfCompounds=");
		numberOfCompounds =sc.nextInt();
		
		System.out.print("Enter year=");
		years =sc.nextInt();
		sc.close();
		
		
	}
	public double cal() {
		 double futureValue = principal_amt * Math.pow((1 + annual_interest_rate / numberOfCompounds), numberOfCompounds * years);
		 double  totalInterest = futureValue - principal_amt;
		 return totalInterest;
	}
	
	void print(double totalInterest) {
		  System.out.printf("The monthly mortgage payment is:₹ %.2f%n",totalInterest);
		
	}

}
public class que2 {

	public static void main(String[] args) {
		Interst I1 = new Interst();
 		   I1.accept();
		 double totalInterest =I1.cal();  
        I1.print(totalInterest);
       
      
     
	}

}
