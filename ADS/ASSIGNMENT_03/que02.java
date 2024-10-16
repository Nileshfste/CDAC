package org.example;
import java.util.Stack;

class que02 {

	    public static boolean isBalanced(String input) {
	        Stack<Character> stack = new Stack<>();

	        for (char ch : input.toCharArray()) {
	            if (ch == '(' || ch == '{' || ch == '[') {
	                stack.push(ch);
	            } else if (ch == ')' || ch == '}' || ch == ']') {
	                if (stack.isEmpty()) {
	                    return false;
	                }
	                char openBracket = stack.pop();
	                if ((ch == ')' && openBracket != '(') ||
	                    (ch == '}' && openBracket != '{') ||
	                    (ch == ']' && openBracket != '[')) {
	                    return false;
	                }
	            }
	        }

	        return stack.isEmpty();
	    }

	    public static void main(String[] args) {
	        String testCase1 = "({[()]})";
	        String testCase2 = "([)]";

	        System.out.println(isBalanced(testCase1) ? "Balanced" : "Not Balanced");
	        System.out.println(isBalanced(testCase2) ? "Balanced" : "Not Balanced");
	    }
	}



/*
 Start
  |
  V
Read input string
  |
  V
Create an empty stack
  |
  V
For each character in the input string:
  |
  V
Is the character an opening bracket? ( '(' or '{' or '[' )
  |
  +---> Yes --> Push the character onto the stack
  |       |
  |       V
  |     Continue to next character
  |
  V
Is the character a closing bracket? ( ')' or '}' or ']' )
  |
  +---> Yes
  |       |
  |       V
  |    Is the stack empty? 
  |       |
  |       +---> Yes --> Return "Not Balanced" (No matching opening bracket)
  |       |
  |       V
  |    Pop the top of the stack
  |       |
  |       V
  |    Does the popped bracket match the closing bracket? 
  |       |
  |       +---> No --> Return "Not Balanced"
  |       |
  |       V
  |    Continue to next character
  |
  V
Is the input string fully processed?
  |
  +---> Yes --> Is the stack empty?
               |
               +---> Yes --> Return "Balanced"
               |
               +---> No  --> Return "Not Balanced"
  |
  V
End

 */
*/