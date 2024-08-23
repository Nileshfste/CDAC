public class que20{
    public static void main(String[] args) {
        

        for (int i = 1; i <= 5; i++)
		{
		      for (int j = 1; j<=i; j++)
				 {
				  if(i==1||j==1)
				  {System.out.print(i);}
				  else
				  {System.out.print("*"+j);}
			     } 
            
                System.out.println();  
				}
        
    }
}
