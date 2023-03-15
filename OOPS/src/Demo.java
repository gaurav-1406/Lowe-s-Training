
import Vehicles.Bike; 

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike bike = new Bike("long", "petrol", 4, 5, 6, "LED");
		
		
		
		System.out.println(bike.getEngine());
		
		
		System.out.println(bike.getHandles());
		System.out.println(bike.getEngine());
		System.out.println(bike.getFuelTank());
	}

}
