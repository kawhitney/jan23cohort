package com.codingdojo.singlylinkedlist;

public class SinglyLinkedList {
    // ==========================
    //        ATTRIBUTES
    // ==========================
	public Node head;
	
    // ==========================
    //        CONSTRUCTOR
    // ==========================	
    public SinglyLinkedList() {
        this.head = null;
    }
    
    // ==========================
    //         METHODS
    // ==========================    
    //# add a node to the list
    public void add(int value) {
        Node newNode = new Node(value); // create new node
        if(head == null) { // if list is empty
            head = newNode; // head will point to new node
        } else { // otherwise 
            Node runner = head; // run through list
            while(runner.next != null) { // loop until instance of Node.next is null
                runner = runner.next; // get next node
            }
            runner.next = newNode; // new node will be placed at found next position
        }
    }
    
    //# remove a node from the end of the list
    public void remove() {
    	if(head.next == null) { // if list does not have a next item
    		head = null; // make sure head is "deleted"
    	}
    	else {
    		Node prev = head;	// previous position
    		Node runner = head.next; // run through list
    		while(runner.next != null) { // loop until instance of Node.next is null
    			prev = runner;  // update previous
    			runner = runner.next;  // get next node
    		}
    		prev.next = null; // remove link from 2nd-to-last and last value
    		runner = null; // remove last data value in list
    	}    	
    }
    
    //# print node values form the list
    public void printValues() {
    	if(head == null) { // if list does not have an item
    		System.out.println("There are no items in the Linked List");
    	}
    	else {
    		System.out.println("Nodes in Linked List:");
    		System.out.print("[ ");
    		Node runner = head;
    		while(runner.next != null) {
    			System.out.printf("%s, ", runner.value);
    			runner = runner.next;
    		}
    		System.out.printf("%s ]%n", runner.value);
    	}
    	
    }
    
    
}
