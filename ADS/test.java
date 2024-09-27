package org.example;

import java.util.Scanner;

public class test {
	
	public static int max =10;
	int top;
	int []a=new int[max];
	
	
	test()
	{
		top=-1;
	}
	//underflow
	boolean isEmpty() {
		return(top<0);
	}
	
	
	
	//push
	boolean push(int X) {
		if(top>=(max-1)) {
			System.out.println("stackover flow");
			return false;
		}
		a[++top]=X;
	    return true;
	}
	
	//pop
	int pop(int x) {
		if(top<0) 
		{
			System.out.println("stack underflow");
			return 0;
		}
		return a[top--];
		
	}
	//peek
	int peek() {
		
		return (top<0)?-1:a[top];
	}
	
	void display() {
		
	if(isEmpty())
	{
		System.out.println("empty stack");
	}else {
		System.out.println("stack element are:");
		show(top);
		System.out.println();
	}
		
		
	}
	void show(int index) {
	if(index<0)
		return;
	System.out.println(a[index]+" ");
	show(index-1);
		
	}



public static int menulist(Scanner scanner){
	System.out.println("0:EXIT");
	System.out.println("1:PUSH");
	System.out.println("2:POP");
	System.out.println("3:PEEK");
	System.out.println("4:DISPLAY");
	int key = scanner.nextInt();
	return(key);
	
}
public static void main(String[] args) {
	
     Scanner scanner = new Scanner(System.in);
     test s=new test(); 
     
	while(true) {
     switch (menulist(scanner) )
     {
	case 0: System.exit(0);
		
		     break;
	case 1:  System.out.println("PUSH the number:");
		s.push(scanner.nextInt());
	
	          break;
	case 2:System.out.println("POP the number:");
		s.pop(scanner.nextInt());
	
           break;
	case 3:System.out.println("PEEK element:");
	          System.out.println(s.peek());
	           break;
	case 4:  s.display();
	
	break;

	default: System.out.println("invalid entry");
		break;
	}
       
	}
}

}
