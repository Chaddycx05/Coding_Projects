import java.io.*;

/** this is a Java program to implement a singly linked list
    in Java */

public class LinkedList {
	Node head; // this is the head of the list

	static class Node{ 
		// This inner class is made static
		// So that the main() can have acceess to it
		int data;
		Node next;
		
		// Constructor
		Node(int d){
		
			data = d;
			next = null;
		} // Node Constructor
		
	

	}// class node

	// insert method
	public static LinkedList insert(LinkedList list, int data){
		
		// Create a new Node with data that's been input by user
		Node newNode = new Node(data);
		newNode.next = null;

		// If the Linked List is empty,
		// then make the new node as the head
		if(list.head == null) {
			list.head = newNode;
		}
		else {
		// otherwise we will traverse the list to the last node
		// and insert the newNode there
			Node last = list.head;
			while(last.next != null){
				last = last.next;	
			}
			last.next = newNode;

		}
		// return the list head-first
		return list;
	}
	
	// Create a Method to print the LinkedList
	public static void printList(LinkedList list){
		Node currNode = list.head;
		System.out.println("LinkList: ");
		
		// Traverse through the LinkedList
		while (currNode != null){
			// print the data at current 
			System.out.print(currNode.data + " ");
			
			// Go to the next node
			currNode = currNode.next;	
		}
	
	}
	
	// Driver code
	public static void main(String[] args){
	
	/** Create an empty list first! */
	LinkedList list = new LinkedList();

	// Insert some crap into the list :)

	list = insert(list, 1);
	list = insert(list, 2);
	list = insert(list, 25);
	printList(list);

	list = insert(list, 3);
	list = insert(list, 4);
	list = insert(list, 5);
	printList(list);
	}
	
}
