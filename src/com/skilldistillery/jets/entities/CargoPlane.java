package com.skilldistillery.jets.entities;

public class CargoPlane extends Jet {
	private double cargoCapacity;
	

	public CargoPlane(String model, double speed, int range, long price, double cargoCapacity) {
		super(model, speed, range, price);
		this.cargoCapacity = cargoCapacity;
	}

	public double getCargoCapacity() {
		return cargoCapacity;
	}

	public void setCargoCapacity(double cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}

}
