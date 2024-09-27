package org.example;

public class GCD {
	

	    // Recursive function to generate the formula for GCD of n integers
	    public static String gcd(int n) {
	        // Base case: if there's only one integer, just return "int"
	        if (n == 1) {
	            return "int";
	        }
	        
	        // Recursive case: concatenate "gcd(int, " and the result of the recursive call with n-1
	        return "gcd(int, " + gcd(n - 1) + ")";
	    }

	    public static void main(String[] args) {

	    	int n = 3; // You can change the value of n to test for different numbers of integers

	        // Call the function to generate and print the GCD formula
	        String formula = gcd(n);
	        System.out.println(formula);
	    }
	}

