package org.example;

import java.util.Scanner;

public class que4 {
	

	    // Recursive function to calculate Fibonacci number
	    static int m1(int n) {

	    	if (n <= 1) { // Base case: fibonacci(0) = 0, fibonacci(1) = 1
	            return n;
	        } else {
	            return m1(n - 1) + m1(n - 2);  // Fibonacci logic
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number of terms for Fibonacci sequence: ");
	        int n = sc.nextInt();

	        System.out.println("Fibonacci sequence up to " + n + " terms:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(m1(i) + " ");
	        }

	        sc.close();
	    }
	}

