
//Interference with Interface

//Single Interference

interface Shape {
  void draw();
}

class Circle implements Shape {
  @Override
  public void draw() {
    System.out.println("Drawing Circle");
  }
}

//Multiple_Interference

interface Shape {
	  void draw();
	}

	interface Color {
	  void fill();
	}

	class Multiple_Inheritance implements Shape, Color {
	  @Override
	  public void draw() {
	    System.out.println("Drawing Circle");
	  }

	  @Override
	  public void fill() {
	    System.out.println("Filling Circle");
	  }
	}
	
 // MultiLevel Interference
	
	interface Engine {
	    void startEngine();
	}

	class Vehicle {
	    void drive() {
	        System.out.println("Driving a vehicle");
	    }
	}

	class SportsCar extends Vehicle implements Engine {
	    @Override
	    public void startEngine() {
	        System.out.println("Starting the engine");
	    }
	}