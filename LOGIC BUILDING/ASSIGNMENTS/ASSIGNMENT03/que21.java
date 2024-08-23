public class que21{
    public static void main(String[] args) {
        int n = 10;

        for (int i = 0; i <= n; i++) {
			 if(i%2!=0)
                {continue;}
            for (int j = 1; j<i; j++) {
				    int a=j;
				  if(a%2!=0)
                {System.out.print(a);
			} else{System.out.print("*");}
            }
            System.out.println();
        }
    }
}
