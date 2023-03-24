package com.codingdojo.zookeeper;

public class Mammal{
	// ==========================
    //        ATTRIBUTES
    // ==========================	
	private int energy;

    // ==========================
    //        CONSTRUCTOR
    // ==========================
	public Mammal(int energy) {
		this.energy = energy;
	}

    // ==========================
    //     GETTERS / SETTERS
    // ==========================
	public int getEnergy() {return energy;}
	public void setEnergy(int energy) {this.energy = energy;}
	
    // ==========================
    //         METHODS
    // ==========================	
	public int displayEnergy() { // seriously, why are we returning energy when it is literally NOT USED FOR ANYTHING?!
		System.out.printf("Energy: %d%n", energy);
		return energy;
	}
}
