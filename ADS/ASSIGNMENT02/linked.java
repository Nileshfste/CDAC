package org.example;

class linked {

    node head;

    static class node {
        int data;
        node next;

        node(int d) {
            data = d;
            next = null;
        }
    }

    // Method to display the linked list
    void display() {
        node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        
        void insert(int i){
        	node new_node = new node(new_data);
        	new_node.next
    		
    		
    	}
    }

    public static void main(String[] args) {
        linked l1 = new linked();
        l1.head = new node(10);
        node second = new node(20);
        node third = new node(30);

        l1.head.next = second;
        second.next = third;

        l1.display();
        l1.insert(40);
    }

	
}
