package exercise.lab4_6.vehicle;

public class Cab extends ATaxiVehicle {

	public Cab(int idNumber, int passengers, int pricePerMile) {
		super(idNumber, passengers, pricePerMile);
	}

	/*
	 * passengers in a cab just pay flat fee per mile
	 */

	@Override
	public double fare(double numberOfMiles) {
		return numberOfMiles * pricePerMile;
	}

	

}
