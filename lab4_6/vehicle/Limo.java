package exercise.lab4_6.vehicle;

public class Limo extends ATaxiVehicle {
	private int minRental;

	public Limo(int idNumber, int passengers, int pricePerMile, int minRental) {
		super(idNumber, passengers, pricePerMile);
		this.minRental = minRental;
	}

	@Override
	public double fare(double numberOfMiles) {
		if (numberOfMiles * pricePerMile < minRental) {
			return minRental;
		}
		return numberOfMiles * pricePerMile;
	}


}
