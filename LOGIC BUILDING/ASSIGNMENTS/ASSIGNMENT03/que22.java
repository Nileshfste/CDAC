public class que17 {
    public static void main(String[] args) {
        int n = 5; 

        for (int i = n; i >= 1; i--) {
            
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

           
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

           
            System.out.println();
        }
		 int m = 5;

        for (int p = 1; p <= m; p++) {
            for (int q = m - p; q > 0; q--) {
                System.out.print(" ");
            }
            for (int q = 1; q <= 2 * p - 1; q++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
