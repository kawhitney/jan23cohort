package itemPkg;

import interfaces.Temperature;

// ===============================
/* Food [Inheritance from Item]:
 * 		flavor [String]
 * 		glutenFree [boolean]
*/	
// ===============================
public class Food extends Item implements Temperature {
	// === ATTRIBUTES ===
	private String flavor;
	private boolean glutenFree;

	// === CONTRUCTOR ===
	public Food(String name, double price, String flavor, boolean glutenFree) {
		// parent
		super(name, price);
		// child
		this.flavor = flavor;
		this.glutenFree = glutenFree;
	}

	// === GETTERS / SETTERS ===
	public String getFlavor() {return flavor;}
	public void setFlavor(String flavor) {this.flavor = flavor;	}

	public boolean isGlutenFree() {return glutenFree;}
	public void setGlutenFree(boolean glutenFree) {this.glutenFree = glutenFree;}
	
	// === INTERFACE: TEMPTERATURE ===
	@Override
	public void hot() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cold() {
		// TODO Auto-generated method stub
		
	}
	
	// === METHODS ===
	
}
