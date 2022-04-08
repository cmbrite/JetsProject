package com.skilldistillery.jets.entities;

public class CargoPlane extends Jet {

	public CargoPlane(String jetType, String model, double speed, int range, long price) {
		super(jetType, model, speed, range, price);
	}

	private double cargoCapacity;

	public double getCargoCapacity() {
		return cargoCapacity;
	}

	public void setCargoCapacity(double cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}

}
