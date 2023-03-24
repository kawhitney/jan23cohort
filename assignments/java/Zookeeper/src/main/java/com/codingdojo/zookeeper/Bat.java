package com.codingdojo.zookeeper;

public class Bat extends Mammal {
    // ==========================
    //        CONSTRUCTOR
    // ==========================
	public Bat() {
		// Parent
		super(300);
	}
	
	// ==========================
    //         METHODS
    // ==========================	
	//# PARENT OVERRIDE
	public int displayEnergy() {
		System.out.print("Bat ");
		return super.displayEnergy();
	}

	//# fly (-50 energy)
	public void fly() {
		// print sound of bat taking off
		System.out.println("The Bat makes a *Swoosh* sound as it takes off flying.");
		// get energy, remove 50
		int newEnergy = super.getEnergy() - 50;
		// set new energy
		super.setEnergy(newEnergy);
	}
	
	//# eat humans (+25 energy)
	public void eatHuman() {
		// print sound of bat taking off
		System.out.println("The Bat grabs a human and swallows them whole.");
		// get energy, add 25
		int newEnergy = super.getEnergy() + 25;
		// set new energy
		super.setEnergy(newEnergy);
	}
	
	//# attack town (-100 energy)
	public void attackTown() {
		// print sound of bat taking off
		System.out.println("The Bat destroys a town.");
		// get energy, remove 100
		int newEnergy = super.getEnergy() - 100;
		// set new energy
		super.setEnergy(newEnergy);
	}
}
