public class que11{
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        
        
        int result = ++a + b-- + a;

        System.out.println("Value of a after the expression: " + a); 
        System.out.println("Value of b after the expression: " + b); 
        System.out.println("Result of the expression: " + result);   
    }
}
