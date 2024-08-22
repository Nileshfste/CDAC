

public class calcultor {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
               int num1, num2;
               char op;
        
      
        System.out.print("Enter first number: ");
        num1 = scanner.nextint();
        System.out.print("Enter an operator (+, -, *, /): ");
        op = scanner.next().charAt(0);
        System.out.print("Enter second number: ");
        num2 = scanner.nextint();
        
       
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