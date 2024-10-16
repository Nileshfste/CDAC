package org.example;
import java.util.Stack;

public class que5 {

 public static int evaluatePostfix(String str) {
	 Stack<Integer> stack=new Stack<>();
	 
	 
	 for(String token : str.split(" ")) {
		 
		 
		 if(Character.isDigit(token.charAt(0))) {
			 stack.push(Integer.parseInt(token));
		 }
		 else {
			 int b=stack.pop();
			 int a= stack.pop();
			 
			 switch (token) {
			case "+":stack.push(a+b);break;
			case "-":stack.push(a-b);break;
			case "*":stack.push(a*b);break;
			case "/":stack.push(a/b);break;

			default:
				break;
			}
		 }
		 
	 }
	 
	 return stack.pop();
 }

	   

	    public static void main(String[] args) {
	        System.out.println(("5 3 + 2 *")); // Output: 16
	        System.out.println(evaluatePostfix("5 3 + 2 *")); // Output: 3
	    }
	}

/*Start
  |
  v
+--------------------------------+
| Split the expression by spaces |
+--------------------------------+
  |
  v
+-------------------------+
| Loop through each token |
+-------------------------+
  |
  v
+-----------------------------------------------+
| Is the token a number?                        |
| (Use Character.isDigit(token.charAt(0)))      |
+-------------------------+---------------------+
        | No                           | Yes
        v                              v
+---------------------+        +-------------------------+
| Token is an operator|        | Push the number onto    |
| Pop two elements    |        | the stack               |
| from the stack      |        +-------------------------+
| Perform operation   |
| based on token      |
| Push result to stack|
+---------------------+
        |
        v
+---------------------------+
| Loop continues for all    |
| tokens in the expression  |
+---------------------------+
        |
        v
+-----------------------------+
| Pop the final result from   |
| the stack and return it     |
+-----------------------------+
        |
        v
       End

 
 * 
 */
