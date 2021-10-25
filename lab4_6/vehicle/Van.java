package exercise.lab4_6.vehicle;

public class Van extends ATaxiVehicle {
	private boolean access;

	public Van(int idNumber, int passengers, int pricePerMile, boolean access) {
		super(idNumber, passengers, pricePerMile);
		this.access = access;
	}

	@Override
	public double fare(double numberOfMiles) {
		return numberOfMiles * pricePerMile * passengers * 1;
	}

}
