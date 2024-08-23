public class que26{
    public static void main(String[] args) {
        int n = 5;
           static int a=0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a++);
            }
            System.out.println();
        }
    }
}
