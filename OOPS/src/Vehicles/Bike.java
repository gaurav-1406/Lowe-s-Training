package Vehicles;

import Parent.Vehicle;

public class Bike extends Vehicle {
	
	public String handles;

	public Bike() {
		
		this.handles="short";
	}

	public Bike(String handles, String engine, int wheels, int fuelTank, int seats, String lights) {
		
		super(engine, wheels, fuelTank, seats, lights);
		
		this.handles = handles;
	}

	public String getHandles() {
		return handles;
	}
	
	
	
	
	
	

}
