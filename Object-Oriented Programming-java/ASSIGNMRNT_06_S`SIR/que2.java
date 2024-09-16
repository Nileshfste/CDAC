package org.example;

import java.lang.reflect.AnnotatedArrayType;
import java.util.Scanner;

public class que2 {
	
	
	
	
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
		do {
	            int temp = arr[i];  
	            int count = 0;
	            
	            
	            for (int j = 0; j < arr.length; j++) {
	                if (arr[j] == temp) {
	                    count++;
	                }
	            }

	           
	            if (count > 1) {
	            	
	            
	                System.out.print(temp+"  ");
	            }
	           

	            
	            i++;

	        } while (i < arr.length);
	}

	public static void main(String[] args) {
		
		int [] arr = new int [5];
		
		que2.accpet(arr);
		que2.print(arr);

	}}
