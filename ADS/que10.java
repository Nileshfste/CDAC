package org.example;

import java.util.Scanner;

public class que10 {



	    // Recursive function to check if a year is a leap year
	    public static boolean isLeapYear(int year) {
	        // Base case for non-leap years
	        if (year < 1582) {
	            return false; // Years before 1582 are not considered in the Gregorian calendar
	        }
	        
	        // Recursive case for leap year
	        if (year % 4 == 0) {
	            if (year % 100 == 0) {
	                if (year % 400 == 0) {
	                    return true; // Divisible by 400
	                }
	                return false; // Divisible by 100 but not by 400
	            }
	            return true; // Divisible by 4 but not by 100
	        }
	        
	        return false; // Not divisible by 4
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Input: Ask the user to enter a year
	        System.out.print("Enter a year to check if it's a leap year: ");
	        int year = scanner.nextInt();

	        // Output: Check if the year is a leap year and print the result
	        boolean result = isLeapYear(year);
	        if (result) {
	            System.out.println(year + " is a leap year.");
	        } else {
	            System.out.println(year + " is not a leap year.");
	        }

	        scanner.close();
	    }
	}


/*
Time Complexity= O(1)
Start: Begin the program.
               |
    Input Year: The user is prompted to enter a year.
    Is Year < 1582?:
         |
If Yes, go to the output step indicating "Not a leap year."
If No, proceed to the next step.
                         |
           Is Year Divisible by 4?:
               ________|______________________
              |                              |
   If No,                                  If Yes,
 go to the output step                 proceed to the next step.
indicating "Not a leap year."                   |
                                                |
                                           Is Year Divisible by 100?:
                   If No                                            If Yes,
         go to the output step                                   proceed to the next step.
         indicating "Is a leap year."                                 |
                                                         Is Year Divisible by 400?:
                                                                      |
                                                        ___________       ________
                                                       |                           |
                                                  If No,                                If Yes,
                                  go to the output step 
                                  indicating "Not a leap year."                   go to the output step
                                                                              indicating "Is a leap year."
                                                                                          |
                                                                      Output Result: Display whether the year is a leap year or not.
End: The program concludes.







*/