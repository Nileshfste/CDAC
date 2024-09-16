package org.example;


public class que6 {
	
	
	
	
	  public static void accpet(int []arr) {
		  System.out.println("Enter the num");
	  }
	  
	  public static void miss(int[]arr) {
		  int i=1; 
		  int j=0;
		  
			do {  
				 if(i!=arr[j]) {
			      System.out.println(--arr[j]+" is missing ");
			      break;
				 }
				 
				 i++;   j++;
			   }while(i<arr.length);	  
		
	}

	public static void main(String[] args) {
		
	int [] arr = new int [] {1,2,3,4,5,6,8,9,10};
		
		que6.miss(arr);

	}}
