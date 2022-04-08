package com.skilldistillery.jets.entities;

public class CargoPlane extends Jet {

	public CargoPlane(String jetType, String model, double speed, int range, long price) {
		super(jetType, model, speed, range, price);
	}
	
	public void fly() {
		double flightTime = getRange() / getSpeed();
	}
}
