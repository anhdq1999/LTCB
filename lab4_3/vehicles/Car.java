package exercise.lab4_3.vehicles;

public class Car extends Vehicles {
	private int maximunsSpeed;
	private String fuelConsumption;

	public Car(String name, String brand, double price, int maximunsSpeed, String fuelConsumption) {
		super(name, brand, price);
		this.maximunsSpeed = maximunsSpeed;
		this.fuelConsumption = fuelConsumption;
	}

}
