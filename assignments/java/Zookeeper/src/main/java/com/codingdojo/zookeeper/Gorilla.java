package com.codingdojo.zookeeper;

public class Gorilla extends Mammal {
    // ==========================
    //        CONSTRUCTOR
    // ==========================
	public Gorilla() {
		super(100);
	}
	
    // ==========================
    //         METHODS
    // ==========================	
	//# PARENT OVERRIDE
	public int displayEnergy() {
		System.out.print("Gorilla ");
		return super.displayEnergy();
	}
	
	//# throw something (-5 energy)
	public void throwSomething() {
		// print message that gorilla has thrown something
		System.out.println("The Gorilla throws something quesitonable at a visitor.");
		// get energy of gorilla, remove 5 from energy
		int newEnergy = super.getEnergy() - 5;
		// set new energy
		super.setEnergy(newEnergy);
	}
	
	//# eat bananas (+10 energy)
	public void eatBanana() {
		// print message that gorilla has eaten a banana
		System.out.println("The Gorilla sits to eat a banana.");
		// get energy of gorilla, add 10 to energy
		int newEnergy = super.getEnergy() + 10;
		// set new energy
		super.setEnergy(newEnergy);
	}
	
	//# climb (-10 energy)
	public void climb() {
		// print message that gorilla has climbed something
		System.out.println("The Gorilla is trying to climb out of his cage.");
		// get energy of gorilla, remove 10 from energy
		int newEnergy = super.getEnergy() - 10;
		// set new energy
		super.setEnergy(newEnergy);
	}

}
