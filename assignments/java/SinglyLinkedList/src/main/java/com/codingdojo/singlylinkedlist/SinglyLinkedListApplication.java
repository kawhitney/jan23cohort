package com.codingdojo.singlylinkedlist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SinglyLinkedListApplication {

	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(3);
        sll.add(4);
        sll.add(10);
        sll.add(5);
        sll.add(15);
        sll.add(2);
        sll.remove();
        sll.remove();
        sll.printValues();
        
		SpringApplication.run(SinglyLinkedListApplication.class, args);
	}

}
