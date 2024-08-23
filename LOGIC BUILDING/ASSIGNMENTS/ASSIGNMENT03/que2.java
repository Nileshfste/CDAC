
import java.util.Scanner;

public class que2 {

    public static void main(String[] args) {
                Scanner sc= new Scanner(System.in);
            int num=sc.nextInt(); 
              int i=num;
              int fact=1;
               while(i>0)
               {
                   fact*=i;
                   i--;
               }
        System.out.println("Factorial of "+num+" is: "+fact);
    }
}