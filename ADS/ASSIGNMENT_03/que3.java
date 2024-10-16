package org.example;
import java.util.Stack;

class que3 {

	    public static void REV(String input) {
	        Stack<Character> stack = new Stack<>();
/
	        for (char ch : input.toCharArray()) {
	        	
	        	 System.out.print( stack.push(ch));
	            } 
	        System.out.println("");
	        for (char ch : input.toCharArray()) {
	        	 System.out.print( stack.pop());
	            } 

	        return  ;
	    }

	    public static void main(String[] args) {
	        String testCase1 = "hello";
	        String testCase2 = "world";

	       REV(testCase1);
	       System.out.println("");
	       REV(testCase2);
	        //System.out.println(isBalanced(testCase2) );
	    }
	}

/*
 * 
+-----------------------+
|       Start           |
+-----------------------+
          |
          v
+-----------------------+
|    main() method      |
| Input: "hello",       |
|        "world"        |
+-----------------------+
          |
          v
+-------------------------------+
| Call REV() with "hello"       |
+-------------------------------+
          |
          v
+------------------------------------+
| REV() method for input: "hello"    |
|                                    |
| 1. Create Stack<Character> stack   |
| 2. For each character in "hello":  |
|    - Push character to stack       |
|    - Print character               |
| 3. Print new line                  |
| 4. For each character in "hello":  |
|    - Pop character from stack      |
|    - Print character               |
+------------------------------------+
          |
          v
+-------------------------------------------+
| Output of REV("hello"):                   |
| Pushes & prints: "h", "e", "l", "l", "o"  |
| Pops & prints: "o", "l", "l", "e", "h"    |
| Prints: "hello" in reverse order          |
+-------------------------------------------+
          |
          v
+-------------------------------+
| Call REV() with "world"       |
+-------------------------------+
          |
          v
+------------------------------------+
| REV() method for input: "world"    |
|                                    |
| 1. Create Stack<Character> stack   |
| 2. For each character in "world":  |
|    - Push character to stack       |
|    - Print character               |
| 3. Print new line                  |
| 4. For each character in "world":  |
|    - Pop character from stack      |
|    - Print character               |
+------------------------------------+
          |
          v
+-------------------------------------------+
| Output of REV("world"):                   |
| Pushes & prints: "w", "o", "r", "l", "d"  |
| Pops & prints: "d", "l", "r", "o", "w"    |
| Prints: "world" in reverse order          |
+-------------------------------------------+
          |
          v
+-----------------------+
|         End           |
+-----------------------+

 *
 */

