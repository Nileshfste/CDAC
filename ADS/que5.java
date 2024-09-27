package org.example;

import java.util.Scanner;

public class que5 {

	
	

	    
	    // Method to find GCD using recursion
	    public static int findGCD(int a, int b) {
	     if(a%b==0) {
	    	 return b;
	     }
	     return findGCD(b,a%b);
	    }

	    public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);
	        
	        // Taking input from user
	        System.out.print("Enter the first number: ");
	        int num1 = sc.nextInt();
	        
	        System.out.print("Enter the second number: ");
	        int num2 = sc.nextInt();
	        
	        // Finding and displaying the GCD
	        int gcd = findGCD(num1, num2);
	        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
	        
	        sc.close();
	    }
	}


/*  hello during this example  we need to find out the Greatest Common Divisor
 * 
 * 
 * logic:-
 * 
 * 
 *                            input
 *                    a                  b
 *                    
 *                call the function  find GCD(int a,int b);
 *                
 *                function:-  
 *                  Static int findGCD(int a, int b)
 *                  {
 *                  
 *                  where the first check the condition
 *                  if(a%b==0)
 *                  return b;
 *                  
 *                  30%10==0;
 *                  
 *                   return 10 is GCD
 *                   
 *                   if above condition get false than it 
 *                   
 *                   return findGCD( b,a%b)
 *                                  where if b==10
 *                                
 *                                  a%b=2
 *                                  
 *                        after recursion call
 *                        if(a%b==0)
 *                  return b;          
 *                  
 *                  
 *                         
 */

*/