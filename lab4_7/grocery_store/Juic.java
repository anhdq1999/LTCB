package exercise.lab4_7.grocery_store;

public class Juic extends Product {
	private String flave;
	private String packageJuic;

	public Juic(String brandName, int weight, int price, String flave, String packageJuic) {
		super(brandName, weight, price);
		this.flave = flave;
		this.packageJuic = packageJuic;
	}

}
