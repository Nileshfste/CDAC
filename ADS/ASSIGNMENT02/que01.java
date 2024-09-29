  package org.example;

import java.util.Scanner;

public class que01 {
	public static void main(String[] arg) { 
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number");
		int n =sc.nextInt();
		for(int i=0;i<=n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
