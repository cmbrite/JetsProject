package com.skilldistillery.jets.entities;

public class FighterJet extends Jet {

	public FighterJet(String jetType, String model, double speed, int range, long price) {
		super(jetType, model, speed, range, price);
	}

	private int missleCapacity;

	public int getMissleCapacity() {
		return missleCapacity;
	}

	public void setMissleCapacity(int missleCapacity) {
		this.missleCapacity = missleCapacity;
	}

}
