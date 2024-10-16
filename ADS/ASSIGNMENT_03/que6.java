package org.example;

public class que6 {

	
	    private int[] queue;
	    private int front, rear, size;

	    // Constructor to initialize queue
	    public que6(int capacity) {
	        queue = new int[capacity];
	        front = 0;
	        rear = -1;
	        size = 0;
	    }

	    // Method to add an element to the queue (enqueue)
	    public void enqueue(int value) {
	        if (size == queue.length) {
	            System.out.println("Queue is full");
	            return;
	        }
	        rear = (rear + 1) % queue.length;
	        queue[rear] = value;
	        size++;
	    }

	    // Method to remove and return an element from the queue (dequeue)
	    public int dequeue() {
	        if (size == 0) {
	            System.out.println("Queue is empty");
	            return -1;
	        }
	        int dequeuedValue = queue[front];
	        front = (front + 1) % queue.length;
	        size--;
	        return dequeuedValue;
	    }

	    // Method to display elements in the queue
	    public void display() {
	        System.out.print("Queue = [");
	        for (int i = 0; i < size; i++) {
	            System.out.print(queue[(front + i) % queue.length]);
	            if (i < size - 1) {
	                System.out.print(", ");
	            }
	        }
	        System.out.println("]");
	    }

	    public static void main(String[] args) {
	        // Test Case 1
	        que6 queue1 = new que6(5);
	        queue1.enqueue(5);
	        queue1.enqueue(10);
	        System.out.println("Dequeued element = " + queue1.dequeue());
	        queue1.display(); // Output: Queue = [10]

	        // Test Case 2
	        que6 queue2 = new que6(5);
	        queue2.enqueue(1);
	        queue2.enqueue(2);
	        queue2.enqueue(3);
	        System.out.println("Dequeued element = " + queue2.dequeue());
	        System.out.println("Dequeued element = " + queue2.dequeue());
	        queue2.display(); // Output: Queue = [3]
	    }
	}

