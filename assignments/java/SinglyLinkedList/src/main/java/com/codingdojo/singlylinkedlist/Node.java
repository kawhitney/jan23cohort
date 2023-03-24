package com.codingdojo.singlylinkedlist;

public class Node {
    // ==========================
    //        ATTRIBUTES
    // ==========================	
	public int value;
    public Node next;
    
    // ==========================
    //        CONSTRUCTOR
    // ==========================    
    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}
