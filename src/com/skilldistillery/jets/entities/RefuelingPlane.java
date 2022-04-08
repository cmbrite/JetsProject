package com.skilldistillery.jets.entities;

public class RefuelingPlane extends Jet{
	
	public RefuelingPlane(String jetType, String model, double speed, int range, long price) {
		super(jetType, model, speed, range, price);
	}

	private int fuelCapacity;
	



	public int getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

}
