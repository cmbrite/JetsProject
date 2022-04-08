package com.skilldistillery.jets.entities;

public class PassengerPlane extends Jet {
	
	public PassengerPlane(String jetType, String model, double speed, int range, long price) {
		super(jetType, model, speed, range, price);
	}

	private int passengerCapacity;
	



	public int getPassengerCapacity() {
		return passengerCapacity;
	}

	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}

}
