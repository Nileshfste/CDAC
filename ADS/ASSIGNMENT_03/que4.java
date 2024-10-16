package org.example;
import java.util.Stack;

public class que4 {

	
	    public static String convertToPostfix(String expression) {
	        Stack<Character> stack = new Stack<>();
	        StringBuilder postfix = new StringBuilder();

	        for (char ch : expression.toCharArray()) {
	            if (Character.isLetter(ch)) {
	                postfix.append(ch).append(' ');
	            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
	                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch)) {
	                    postfix.append(stack.pop()).append(' ');
	                }
	                stack.push(ch);
	            }
	        }

	        while (!stack.isEmpty()) {
	            postfix.append(stack.pop()).append(' ');
	        }

	        return postfix.toString().trim();
	    }

	    private static int precedence(char operator) {
	        return (operator == '+' || operator == '-') ? 1 : 2;
	    }

	    public static void main(String[] args) {
	        System.out.println(convertToPostfix("A + B * C")); // Output: "A B C * +"
	        System.out.println(convertToPostfix("A * B + C / D")); // Output: "A B * C D / +"
	    }
	}






/*
 +----------------------------+
|         Start               |
+----------------------------+
            |
            v
+----------------------------+
| Initialize stack and        |
| empty postfix string        |
+----------------------------+
            |
            v
+----------------------------+
| For each character in       |
| the infix expression:       |
| - If operand (A-Z), add to  |
|   postfix string            |
| - If operator (+, -, *, /), |
|   pop higher precedence     |
|   operators from stack and  |
|   add to postfix string     |
| - Push the current operator |
|   to the stack              |
+----------------------------+
            |
            v
+----------------------------+
| After processing all        |
| characters, pop remaining   |
| operators from the stack    |
| and add to postfix string   |
+----------------------------+
            |
            v
+----------------------------+
|        Return postfix       |
+----------------------------+
            |
            v
+----------------------------+
|           End               |
+----------------------------+
*/