package org.example;

import javax.swing.Popup;

class Stack{
		static final int MAX = 10;
		int top;
		int a[] = new int[MAX];
		
		Stack()
		{
			top = -1;
		}
		//Underflow
		boolean isEmpty()
		{
			return (top < 0);
		}
		//insertion in stack
		boolean push(int x)
		{
			if(top >= (MAX-1))
			{
				System.out.println("Stack Overflow");
				return false;
			}
			a[++top] = x;
			return true;
		}
		
		//deletion
		int pop()
		{
			if(top < 0)
			{
				System.out.println("Stack underflow");
				return 0;
			}
			return a[top--];
			
			
		}
		
		int peek()
		{
			return (top < 0)? -1: a[top]; 
		}
		
		void display()
		{
			if(isEmpty())
			{
				System.out.println("Empty stack!");
				
			}
			else
				System.out.println("Stack elements are:");
				show(top);
				System.out.println();
		}
		
		void show(int index)
		{
			if(index < 0 )//base condition
				return;
			System.out.print(a[index] + " ");
			show(index-1);//recursive call
		}
		
		
	}
		class que01 {
		public static void main(String args[])
		{
			Stack s1 = new Stack();
			s1.push(10);
			s1.push(20);
			s1.push(30);
			int p=s1.pop();
			s1. display();
			
			System.out.println("pop element is: " +p);
			
			
			
		}
	
}
		
/*
 * 
+--------------------------------------+
|         Start (main method)          |
+--------------------------------------+
                   |
                   v
+--------------------------------------+
| Create an object `s1` of Stack class |
+--------------------------------------+
                   |
                   v
   +----------------------------+
   | Push 10, 20, 30 onto stack  |
   +----------------------------+
                   |
                   v
+-------------------------------------+
| Pop top element from stack, store in|
| variable `p`                        |
+-------------------------------------+
                   |
                   v
+-------------------------------+
| Display elements in the stack |
+-------------------------------+
                   |
                   v
+------------------------------------------+
| Print the popped element: "pop element is|
| p"                                       |
+------------------------------------------+
                   |
                   v
              +-----------+
              |   End      |
              +-----------+

		 */
		 */


	 
