package com.skilldistillery.jets.entities;

public class FighterJet extends Jet {
	private int missleCapacity;
	
	public FighterJet(String model, double speed, int range, long price, int missleCapacity) {
		super(model, speed, range, price);
		this.missleCapacity = missleCapacity;
	}

	public int getMissleCapacity() {
		return missleCapacity;
	}

	public void setMissleCapacity(int missleCapacity) {
		this.missleCapacity = missleCapacity;
	}

}
