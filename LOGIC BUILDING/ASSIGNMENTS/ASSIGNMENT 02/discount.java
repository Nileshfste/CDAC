import java.util.Scanner;
public class discount  
 {
    public static void main(String[] args)  
    {
       
       Scanner scanner = new Scanner(System.in);
	    int total, dis;
		System.out.print("Enter total price: ");
        total = scanner.nextInt();

       if(total>1000)
	   {           
		   System.out.println("discount is :-  " +(total *20/100));
	   }
      else if(total>=500&& total<=999)
	   {           
		   System.out.println("discount is:-  " +(total *10/100));
	   }
	   else if(total<=500)
	   {           
		   System.out.println("discount is:-  " +(total *5/100));
	   }
	   
	   
    }
  }