package org.example;

import java.util.Scanner;

public class que1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int [5];
		int i=0;
		do {
		      System.out.println(arr[i]);
		      i++;
		   }while(i<arr.length);
		int j=0;
		do {
			arr[j]=sc.nextInt();
		     
		     
		      j++;
		   }while(j<arr.length);
		
		if(j<5)
		{
		 System.out.println(arr[j]);
		}
		else {System.out.println("java.lang.ArrayIndexOutOfBoundsException:");

	}

	}}
