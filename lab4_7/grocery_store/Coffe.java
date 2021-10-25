package exercise.lab4_7.grocery_store;

public class Coffe extends Product {
	private String label;

	public Coffe(String brandName, int weight, int price, String label) {
		super(brandName, weight, price);
		this.label = label;
	}
}