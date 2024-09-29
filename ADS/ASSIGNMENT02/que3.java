package org.example;

import java.util.Iterator;
import java.util.Scanner;

public class que3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	   String str=sc.nextLine();
	   char arr[]=str.toCharArray();
	   char sp=32;
	   for(int i=0;i<str.length();i++) {
		   if(arr[i]!=sp) {
	   System.out.print(arr[i]);
		   }
	   }

	}

}
