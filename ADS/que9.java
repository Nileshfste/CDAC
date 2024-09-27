package org.example;

import java.util.Scanner;

public class que9 {

	

	    // Function to check if an integer is a palindrome
	    public static boolean isPalindrome(int number) {
	        int originalNumber = number; // Store the original number
	        int reversedNumber = 0;
	        
	        // Reverse the number
	        while (number > 0) {
	            int digit = number % 10;           // Get the last digit
	            reversedNumber = reversedNumber * 10 + digit; // Add digit to the reversed number
	            number = number / 10;              // Remove the last digit from the number
	        }

	        // Check if the original number is equal to the reversed number
	        return originalNumber == reversedNumber;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Input: Ask the user to enter a number
	        System.out.print("Enter a number to check if it's a palindrome: ");
	        int number = scanner.nextInt();

	        // Output: Check if the number is a palindrome and print the result
	        if (isPalindrome(number)) {
	            System.out.println(number + " is a palindrome.");
	        } else {
	            System.out.println(number + " is not a palindrome.");
	        }

	        scanner.close();
	    }
	}



/*    Time Complexity:-
 *           Reverse the number:log10(n)
 *           Comparison:O(1);
 *           
 *           TIME COMPLEXITY=O(log n)
 *           
 *           
 *           
 *           
 *           
 *           
 *           
 *Start: Begin the program.
              |
Input: The program asks the user to input an integer.
              |
Check if Palindrome:
              |
Save the original number in a separate variable (originalNumber).
Reverse the number:
              |
Take the last digit of the number using modulus (% 10).
              |
Add the digit to the reversed number.
              |
Remove the last digit by dividing the number by 10 (/ 10).
              |
Continue this process until all digits are processed.
              |
Compare: Check if the reversed number is equal to the original number.
              |
Output: Based on the comparison:
If true, print "The number is a palindrome."
              |
If false, print "The number is not a palindrome."
End: Terminate the program.
 */

