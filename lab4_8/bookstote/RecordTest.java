package exercise.lab4_8.bookstote;

import junit.framework.TestCase;

public class RecordTest extends TestCase {

//	test contructor
//	(String title, String authorName, double price, int yearOfPublic)
	public void testContructor() {
		Hardcoverbooks hardcoverbooks = new Hardcoverbooks(getName(), getName(), 0, 0);
		Books books = new Books(getName(), getName(), 0, 0);
		Paperbacks paperbacks = new Paperbacks(getName(), getName(), 0, 0);
	}

//test phuong thuc salePrice, which computes the sale price of each book;
	public void testSalePrice() {
		Hardcoverbooks hardcoverbooks = new Hardcoverbooks("hardcoverbooks", "author Name", 100, 1999);
		Books books = new Books(getName(), getName(), 200, 1234);
		Paperbacks paperbacks = new Paperbacks(getName(), getName(), 300, 0206);

		assertEquals(hardcoverbooks.salePrice(), 80.0);
		assertEquals(books.salePrice(), 100.0);
		assertEquals(paperbacks.salePrice(), 300.0);
	}
}
