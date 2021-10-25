package exercise.lab4_7.grocery_store;

public abstract class Product {
	protected String brandName;
	protected int weight;
	protected int price;

	
	public Product(String brandName, int weight, int price) {
		super();
		this.brandName = brandName;
		this.weight = weight;
		this.price = price;
	}

	/*
	 * unitPrice, which computes the unit price (cents per gram) of some grocery
	 * item;
	 */
	public int unitPrice() {
		return this.price / this.weight;
	}

	/*
	 * lowerPrice, which determines whether the unit price of some grocery item is
	 * lower than some given amount;
	 */
	public boolean lowerPrice(int unitPriceThat) {
		return this.unitPrice() < unitPriceThat;
	}

	/*
	 * 
	 * cheaperThan, which determines whether a grocery item is cheaper than some
	 * other, given one in terms of the unit cost.
	 */
	public boolean cheaperThan(Product that) {
		return this.price < that.price;
	}

}