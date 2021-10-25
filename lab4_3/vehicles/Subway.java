package exercise.lab4_3.vehicles;

public class Subway extends Vehicles {
	private double priceTicket;
	private int avgSpeed;

	public Subway(String name, String brand, double price, double priceTicket, int avgSpeed) {
		super(name, brand, price);
		this.priceTicket = priceTicket;
		this.avgSpeed = avgSpeed;
	}

}
