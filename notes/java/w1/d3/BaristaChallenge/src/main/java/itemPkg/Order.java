package itemPkg;

import java.util.ArrayList;	// before cntrl+shift+o, make sure to add all other files needed or it will look
// ===============================
/*	Order:
 *		name [String]
 *		total [double]
 *		ready [boolean]
 *		items [ArrayList<Items>]
*/	
// ===============================
public class Order {	
	//? Encapsulation
	private String name; 	// name
	private double total; 	// total
	private boolean ready;	// ready
	private ArrayList<Item> items; 
	
	// === CONSTRUCTOR ===
	//# Original
	public Order() {
		this.name = "Not Yet Collected From Customer";
		this.total = 0.0;
		this.ready = false;
		this.items = new ArrayList<>();
	}
	//# Overloading
	public Order(String name) {
		this.name = name;
		this.total = 0.0;
		this.ready = false;
		this.items = new ArrayList<>();
	}	
	
	// === GETTERS / SETTERS ===
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}

	public double getTotal() {return total;}
	public void setTotal(double total) {this.total = total;}

	public boolean isReady() {return ready;}
	public void setReady(boolean ready) {this.ready = ready;}

	public ArrayList<Item> getItems() {return items;}
	public void setItems(ArrayList<Item> items) {this.items = items;}	
	
	// === METHODS ===
	//# add item to list
	public void addItem(Item item) {
		this.items.add(item);
		total += item.getPrice();
	}
	//# Print order
	public void printOrder() {
		System.out.printf("Order for %s:\n", this.name);
		for(Item item : items) {
			 item.printItem();		 
		}
		System.out.printf("\n\tTotal: %.2f\n", this.total);
	}
	
	//# print order status
	public void orderStatus() {
		System.out.println(this.ready ? "Order is ready." : "Order is still in progress");
	}
}
