package org.example;

import java.util.Scanner;

public class que3 {
	
	 static int m1(int n) {
	if(n<=1)
		    return 1;
	else
		return n*m1(n-1);
		
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the num");
		int n=sc.nextInt();
		System.out.println(m1(n));

	}

}
