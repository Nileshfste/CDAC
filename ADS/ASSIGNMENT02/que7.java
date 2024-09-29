package org.example;

import java.util.Scanner;

public class que7 {

	

	    public static int reverseNumber(int number) {
	        int reversed = 0;

	        while (number != 0) {
	            reversed = reversed * 10 + number % 10;
	            number /= 10;
	        }

	        return reversed;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number to reverse: ");
	        int number = sc.nextInt();
	        System.out.println("Reversed number: " + reverseNumber(number));
	        sc.close();
	    }
	}


