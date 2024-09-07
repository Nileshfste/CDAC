package org.example;

import java.util.Scanner;

class Bmi{
	float w;
	float h;
	
	 void accept() {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter weight=");
		w =sc.nextFloat();
		
		System.out.print("Enter the height ih meter=");
		h =sc.nextFloat();
		
		sc.close();
		
		
	}
	public float cal() {
		float BMI = w / (h * h);
		 return BMI;
	}
	
	void print(double bmi) {
		if(bmi<=30)

		{

		if(bmi>18.5&&bmi<24.9) {

		 System.out.print("Normal weight");}

		else{

		if(bmi>25&&bmi<29.9) {

		  System.out.print("Overweight");}

		else{

		System.out.print("underweight"); }

		}}

		else {
			System.out.print("Obesity");

		}

		
		 
		
	}

}
public class que3 {

	public static void main(String[] args) {
		Bmi I1 = new Bmi();
 		   I1.accept();
		 double bmi =I1.cal();  
        I1.print(bmi);
       
      
     
	}

}
