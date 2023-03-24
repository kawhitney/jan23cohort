package com.codingdojo.com.baristachallenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import itemPkg.Drink;
import itemPkg.Food;
import itemPkg.Item;
import itemPkg.Order;

@SpringBootApplication
public class BaristaChallengeApplication {	
	public static void main(String[] args) { // starting here bc of main
		createMenu();
		Item.printMenu("Welcome to Barisa Challenge Cafe");		
		
		Order Katie = new Order("Katie");
		Katie.addItem(Item.menu.get(1));
		Katie.printOrder();
		
		SpringApplication.run(BaristaChallengeApplication.class, args);	// last
	}
	
	// === FUNCTIONS ===
	public static void createMenu() {
//		Item.menu.add(new Item("Lg Coffee", 5.00));
//		Item.menu.add(new Item("Med Coffee", 3.75));
//		Item.menu.add(new Item("Sm Coffee", 3.00));
//		Item.menu.add(new Item("Lg Latte", 6.00));
//		Item.menu.add(new Item("Med Latte", 4.75));
//		Item.menu.add(new Item("Sm Latte", 4.00));
		Food bagel = new Food("Bagel", 3.75, "Plain", false); 
		Item.addToMenu(bagel);
		Drink Frap = new Drink("Frappuccino", 5.89, "Vanilla", 3);
		Item.addToMenu(Frap);
	}
	
}
