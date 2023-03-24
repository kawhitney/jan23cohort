package itemPkg;

import interfaces.Temperature;

// ===============================
/* Drink [Inheritance from Item]:
 * 		flavor [String]
 * 		size [int]
*/		
// ===============================
public class Drink extends Item implements Temperature {
	// === ATTRIBUTES ===
	private String flavor;
	private int size;
	
	// === CONSTRUCTOR ===
	public Drink(String name, double price, String flavor, int size ) {
		// parent
		super(name, price);
		// child
		this.flavor = flavor;
		this.size = size;
	}
	
	// === GETTERS / SETTERS ===
	public String getFlavor() {return flavor;}
	public void setFlavor(String flavor) {this.flavor = flavor;}

	public int getSize() {return size;}
	public void setSize(int size) {this.size = size;}

	// === INTERFACE: TEMPTERATURE ===
	@Override
	public void hot() {
		// TODO Auto-generated method stub
	}

	@Override
	public void cold() {
		// TODO Auto-generated method stub
	}
	
	

}
