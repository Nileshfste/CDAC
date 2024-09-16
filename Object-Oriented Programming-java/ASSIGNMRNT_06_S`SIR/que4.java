package org.example;

import java.util.Scanner;

public class que4 {
	
	
	
	
	  public static void accpet(int []arr) {
		  System.out.println("Enter the num");
		  Scanner sc =new Scanner(System.in);
		  int j=0;
			do {
				arr[j]=sc.nextInt();
			     
			     
			      j++;
			   }while(j<arr.length);
			
		
	                        }
	  public static void print(int[]arr) {
		  int i=0;
		  System.out.println("arry num:-");
			do {
			      System.out.print(arr[i]+"  ");
			      i++;
			   }while(i<arr.length);	  
		
	}

	public static void main(String[] args) {
		
		int [] arr = new int [5];
		que4.accpet(arr);
		que4.print(arr);

	}}
