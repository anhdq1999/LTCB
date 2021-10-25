package exercise.lab4_3.vehicles;

public class Limos extends Vehicles {
	private int numberOfSeats;
	private String color;

	public Limos(String name, String brand, double price, int numberOfSeats, String color) {
		super(name, brand, price);
		this.numberOfSeats = numberOfSeats;
		this.color = color;
	}

}
