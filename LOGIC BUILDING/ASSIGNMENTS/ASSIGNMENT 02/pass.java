import java.util.Scanner;
public class pass 
 {
    public static void main(String[] args)  
    {
       Scanner scanner = new Scanner(System.in);
	   
        char grades1,grades2,grades3;
		System.out.println("ENTER THE SUBJECT 1 GRADE");
       grades1=scanner.next(). charAt(0);
       
        switch(grades1)
		{
		   case 'A','B','C':  System.out.println("ENTER THE SUBJECT 2 GRADE");
		                      grades2=scanner.next(). charAt(0);
					           switch(grades2)
                                {
		                           case 'A','B','C':  System.out.println("ENTER THE SUBJECT 3 GRADE");
		                              grades3=scanner.next(). charAt(0);
													 
									   switch(grades3)
                                      {
		                               case 'A','B','C':  System.out.println("PASS");
									   break;
									  case 'D': System.out.println("FAIL");
									  break;
		                                
							     	  }
									
									  case 'D': System.out.println("FAIL");
									  break;
								}
		                             break;
			 case 'D': System.out.println("FAIL");
		     break;
			 
		}
    }
  }