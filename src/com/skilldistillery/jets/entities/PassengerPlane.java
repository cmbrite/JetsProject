package com.skilldistillery.jets.entities;

public class PassengerPlane extends Jet {
	private int passengerCapacity;
	

	public PassengerPlane(String model, double speed, int range, long price, int passengerCapacity) {
		super(model, speed, range, price);
		this.passengerCapacity = passengerCapacity;
	}

	public int getPassengerCapacity() {
		return passengerCapacity;
	}

	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}

}
