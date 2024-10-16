package org.example;

import org.example.que01.Node;

public class DLL {
	
	Node head;
	static class node{
		int data;
		node next;
		node prev;
		node(int d){
			
			data=d;
			next=null;
			prev=null;
		}
				
	}

	
	void insert(int new_data) {
		Node new_node=new Node(new_data);
		new_node.next=head;
		new_node.prev=null;
	}
	public static void main(String[] args) {
		// TOD

	}

}
