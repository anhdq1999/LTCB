package exercise.lab4_3.vehicles;

public class Bus extends Vehicles {
	private String color;
	private int numberOfSeat;

	public Bus(String name, String brand, double price, String color, int numberOfSeat) {
		super(name, brand, price);
		this.color = color;
		this.numberOfSeat = numberOfSeat;
	}

}
