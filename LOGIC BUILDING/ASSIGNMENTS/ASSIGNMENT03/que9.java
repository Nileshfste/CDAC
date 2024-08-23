import java.util.Scanner;
public class que9{
	public static void main(String[] args)
	{
		  int num,r=1,sum=0,digit=0;
		  Scanner sc =new Scanner(System.in);
		  System.out.print("inter the 4 digit number=");
		  num= sc.nextInt();
		  for(int i=0;i<=3;i++)
		  {
			  r=num%10;
			  num=num/10;
			   System.out.print(r);
			  if(r>sum)
			  {
				  
				  sum=r;
			 
		  }
		   
		  }
		  System.out.println("largest digit is="+sum);
	}
}