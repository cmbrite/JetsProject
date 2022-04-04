package com.skilldistillery.jets.entities;

public class RefuelingPlane extends Jet{
	private int fuelCapacity;
	

	public RefuelingPlane(String model, double speed, int range, long price, int fuelCapacity) {
		super(model, speed, range, price);
		this.fuelCapacity = fuelCapacity;
	}

	public int getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

}
