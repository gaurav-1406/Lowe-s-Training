package Parent;

public class Vehicle {
	
	private String engine;
	private int wheels;
	private int fuelTank;
	private int seats;
	private String lights;



public Vehicle () {
	 
	this.engine = "petrol";
	this.wheels=4;
	this.seats=4;
	this.fuelTank=35;
	this.lights="LED";
	
}

public Vehicle(String engine, int wheels, int fuelTank, int seats, String lights) {
	//super();
	this.engine = engine;
	this.wheels = wheels;
	this.fuelTank = fuelTank;
	this.seats = seats;
	this.lights = lights;
}

public String getEngine() {
	return engine;
}

public int getWheels() {
	return wheels;
}

public int getFuelTank() {
	return fuelTank;
}

public int getSeats() {
	return seats;
}

public String getLights() {
	return lights;
}



}

