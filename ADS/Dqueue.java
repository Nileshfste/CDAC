package org.example;

import java.util.Queue;

public class Dqueue {
int size=5;
int Q[] = new int[size];
int front,rear;
	public Dqueue() {
	
	this.front = -1;
	this.rear = -1;
}
	
	boolean isEmpty() {
		return(front==-1);
	}
	
	boolean isfull() {
		return(rear==size-1);
	}
	
	void enqueue(int x) {
		if(isfull()) {
			System.out.println("full");
		}else {
			if(front==-1) {
				front=0;
				
			}
			rear++;
			Q[rear]=x;
			System.out.println(x+"  inserted");
			
		}
		
	}
		
		int dequeue() {
			if(isEmpty()) {
				System.out.println("queue is empty");
				return -1;
			}else {
				int x=Q[front];
				System.out.println(" ");
				System.out.println(x+"  is deleted");
				if(front>rear) {
					front=-1;
					rear=-1;
				}else {
					front++;
				}
				return x;
			}}
				
				void display() {
					if(isEmpty()) {
						System.out.println("empty");
						
					}
					else {
						
						System.out.println("elements");
						for(int i=front;i<=rear;i++) {
							System.out.print(Q[i]+"   ");
						}
					}
				}
				
				
						
	
	
	
	public static void main(String[] args) {
		Dqueue  m1= new Dqueue();
		m1.enqueue(1);
		m1.enqueue(2);
		m1.enqueue(3);
		m1.enqueue(4);
		m1.display();	
        m1.dequeue();
	}

}
