package exercise.lab4_7.grocery_store;

public class Ice extends Product {
	private String flavor;
	private String packgeIce;

	public Ice(String brandName, int weight, int price, String flavor, String packgeIce) {
		super(brandName, weight, price);
		this.flavor = flavor;
		this.packgeIce = packgeIce;
	}
}
