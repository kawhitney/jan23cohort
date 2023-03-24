package itemPkg;

import java.util.ArrayList;
//===============================
/*	Item:
 * 		name [String]
 * 		price [double]
*/		
//===============================
public abstract class Item {
	// === ATTRIBUTES === 
	public static ArrayList<Item> menu = new ArrayList<>();
	
	//? Abstraction
	private String name;
	private double price;
	
	// === CONSTRUCTOR ===
	public Item(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	// === GETTER / SETTER ===
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}

	public double getPrice() {return price;}
	public void setPrice(double price) {this.price = price;}
	
	// === METHODS ===
	//# add menu item
	public static void addToMenu(Item item) {
		Item.menu.add(item);
	}
	
	//# Print item info
	public void printItem() {
		System.out.printf("\t%s - %.2f\n", this.name, this.price);
	}
	
	//# print menu
	public static void printMenu(String greeting) {
		System.out.println(greeting);
		System.out.println("=".repeat(30));
		System.out.println(" ".repeat(12) + "MENU");
		System.out.println("_".repeat(30));
		for(Item item : Item.menu) {
			item.printItem();
		}
		System.out.println("=".repeat(30));
	}
	
}
