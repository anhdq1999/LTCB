package exercise.lab4_7.grocery_store;

import junit.framework.TestCase;

public class ProductTest extends TestCase {
	/*
	 * Ice(String brandName, int weight, int price, String flavor, String packgeIce)
	 * Coffe(String brandName, int weight, int price, String label)
	 * 
	 * Juic(String brandName, int weight, int price, String flave, String
	 * packageJuic)
	 */
	public void testContructor() {
		Ice ice = new Ice(getName(), 0, 0, getName(), getName());
		Coffe coffe = new Coffe(getName(), 0, 0, getName());
		Juic juic = new Juic(getName(), 0, 0, getName(), getName());
	}

	/*
	 * kiểm tra phương thức unitPrice()
	 *
	 * int unitPrice() { return this.price / this.weight; }
	 */

	public void testUnitPrice() {
		Coffe coffe = new Coffe("Cofee", 10, 100, "G7");
		assertEquals(coffe.unitPrice(), 10);
	}

	/*
	 * kiểm tra phương thức lowerPrice
	 * 
	 * boolean lowerPrice(int unitPriceThat) { return this.unitPrice() < *
	 * unitPriceThat; }
	 */
	public void testLowerPrice() {
		Juic juic = new Juic("Juic", 10, 100, "A", "N");
		assertTrue(juic.lowerPrice(30));

	}
}
