package exercise.lab4_6.vehicle;

public abstract class ATaxiVehicle {
	protected int idNumber;
	protected int passengers;
	protected int pricePerMile;

	public ATaxiVehicle(int idNumber, int passengers, int pricePerMile) {
		super();
		this.idNumber = idNumber;
		this.passengers = passengers;
		this.pricePerMile = pricePerMile;
	}

	public abstract double fare(double numberOfMiles);

	public boolean lowerPrice(double numberOfMiles, double amount) {
		return this.fare(numberOfMiles) < amount;
	}

	public boolean cheaperThan(double numberOfMiles, ATaxiVehicle that) {
		return this.fare(numberOfMiles) < that.fare(numberOfMiles);

	}
}