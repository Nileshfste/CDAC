package org.example;

import java.util.Scanner;

public class que2 {

	public static void main(String[] args) {
		int count=0;
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter the number");
	int num =scanner.nextInt();
	
	for(int i=1;i<=num;i++)
	{
	  if(num%i==0)
	  {
		  count++;
	  }
	

	}


	if(count==2) {
		System.out.println("number is prime");
	}
	else {
		System.out.println("not prime");
	}
	}}