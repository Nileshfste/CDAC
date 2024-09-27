package org.example;

import java.util.Scanner;

public class que6 {
	
	

	    // Function to find the square root using iteration
	    public static int findSquareRoot(int x) {
	        int result = 0;
	        
	        // Start checking from 1 and find the largest number whose square is <= x
	        for (int i = 1; i * i <= x; i++) {
	            result = i;
	        }
	        
	        return result;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int x = sc.nextInt();

	        // Call the square root function
	        int result = findSquareRoot(x);

	        System.out.println("The square root of " + x + " is approximately: " + result);
	    }
	}
/*Explanation:
This solution uses a simple for loop to find the largest integer i such that i * i is less than or equal to x.
It iterates starting from 1 and keeps updating result until the square of i exceeds x.
The function returns the largest integer that, when squared, does not exceed x.
Test Cases:
Input: x = 16

Output: 4 (because 4 * 4 = 16)
Input: x = 27

Output: 5 (because 5 * 5 = 25, which is the largest square ≤ 27)
This method is simple and easy to understand, making it a good choice for smaller values of x.
 * 
 * 
 * 
 */


