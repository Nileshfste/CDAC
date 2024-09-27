package org.example;

import java.util.Queue;

public class cir_queue {
int size=5;
int Q[] = new int[size];
int front,rear;
	public cir_queue() {
	
	this.front = -1;
	this.rear = -1;
}
	
	boolean isEmpty() {
		return(front==-1);
	}
	
	boolean isfull() {
		return((rear+1%size)==front);
	}
	
	void enqueue(int x) {
		if(isfull()) {
			System.out.println("full");
		}else {
			if(front==-1) {
				front=0;
				
			}
			rear=(rear+1)%size;
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
					front=(front+1)%size;
				}
				return x;
			}}
				
				void display() {
					if(isEmpty()) {
						System.out.println("empty");
						
					}
					else {
						
						System.out.println("elements");
						int i=front;
						while(i!=rear) {
							System.out.print(Q[i]+"   ");
							i=(i+1)%size;
						}
						System.out.print("   ");
					}
				}
				
				
						
	
	
	
	public static void main(String[] args) {
		cir_queue  m1= new cir_queue();
		m1.enqueue(1);
		m1.enqueue(2);
		m1.enqueue(3);
		m1.enqueue(4);
		m1.enqueue(4);
		m1.display();	
        m1.dequeue();
        m1.dequeue();
        m1.dequeue();
	}

}
