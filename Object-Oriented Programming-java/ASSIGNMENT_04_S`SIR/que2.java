package org.example;
import java.util.Scanner;

	class Interst{
		double principal_amt;
		float annual_interest_rate;
		int numberOfCompounds;
		int years;
		
		public double getprincipal_amt() {
			return principal_amt;
		}

		
		public void setprincipal_amt(double principal_amt) {
			this.principal_amt=principal_amt;
		}
		
		public void setannual_interest_rate(float annual_interest_rate) {
			this.annual_interest_rate=annual_interest_rate;
		}
		public float getannual_interest_rate() {
			return annual_interest_rate;
		}
		public void setnumberOfCompounds(int numberOfCompounds) {
			this.numberOfCompounds = numberOfCompounds;
					}
		public int getnumberOfCompounds() {
			return numberOfCompounds;
					}
					
		public void setyears(int years) {
			this.years=years;
		}
		public int getyears() {
			return years;
		}
		
		
		 void accept() {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter principal_amt=");
			setprincipal_amt(sc.nextDouble());
			
			System.out.print("Enter annual_interest_rate=");
			setannual_interest_rate (sc.nextFloat());
			
			System.out.print("Enter numberOfCompounds=");
			setnumberOfCompounds (sc.nextInt());
			
			System.out.print("Enter year=");
			setyears (sc.nextInt());
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


	
	
	