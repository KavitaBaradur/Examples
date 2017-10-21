package math_problems;

import java.util.ArrayList;

public class Cars {
	
	public void drive() {
		System.out.println("Car drive");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Cars> carlist = new ArrayList<Cars>();
		carlist.add(new Cars());
		carlist.add(new Cars());
		carlist.add(new Cars());
		carlist.add(new Cars());
		
		for (Cars car: carlist) {
			
			car.drive();
		}
	}

}
