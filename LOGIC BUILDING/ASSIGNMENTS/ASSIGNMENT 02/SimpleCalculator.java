import java.util.Scanner;


public class SimpleCalculator {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        
       
        int num1, num2;
        char op, a;
        
       
        System.out.print("Enter first number: ");
        num1 = scanner.nextInt();
		System.out.print("Enter second number: ");
        num2 = scanner.nextInt();
        
		
        System.out.print("Enter an operator (+, -, *, /): ");
        op = scanner.next().charAt(0);
        a = scanner .next(). charAt(0);
        
      
        switch(op) {
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;
            case '/':
                // Nested if-else to check for division by zero
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
        }
        
     
        scanner.close();
    }
}