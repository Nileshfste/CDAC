package org.example;

import java.util.Scanner;

class arry{
	public int [] arr;
	public static Scanner sc =new Scanner(System.in);
	public arry (int size) 
	{
		
	arr = new int[size]; 
		
	}
	
	public void accept() {
		System.out.print("Enter the num in arr=");
		for (int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	}
		public void print() {
			System.out.print(" arr elements:-");
			for (int j=0;j<arr.length;j++)
			{ 
				System.out.print(arr[j]+"    ");
			}
		
	}
	
}

public class que7 {
	
  public static void main(String[] args) {
	  
	  arry a = new arry(5);
	  a.accept();
	  a.print();
	
	  
  }
	
	
	}
