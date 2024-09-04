import java.util.Scanner;

public class nop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = 10;
        int p = 10;
        int n = 10; 

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n - 1; j++)
				{
                
                if (j == s || j == p || i == n) 
				{
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            s--;
            p++;
        }
    }
}
