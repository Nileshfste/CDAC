package org.example;

import java.util.Iterator;
import java.util.Scanner;

public class que4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	   String str=sc.nextLine();
	   char arr[]=str.toCharArray();
	   
	   for(int i=str.length()-1;i>=0;i--) {
		  {
	   System.out.print(arr[i]);
		   }
	   }

	}

}
