package exercise.lab4_8.bookstote;

/*
 * tạo class Hardcoverbooks kế thừa từ class asbtract Record
 * thêm thuộc tính soldOff;
 */
public class Hardcoverbooks extends Record {
	private final double SOLD_OFF = 0.2;

	public Hardcoverbooks(String title, String authorName, double price, int yearOfPublic) {
		super(title, authorName, price, yearOfPublic);
	}

	/*
	 * salePrice, which computes the sale price of each book;
	 */
	@Override
	public double salePrice() {
		return this.price * (1-SOLD_OFF);
	}

	/*
	 * cheaperThan, which determines whether a book is cheaper than another book;
	 */
	@Override
	public boolean cheaperThan(Record that) {
		return this.salePrice() < that.salePrice();
	}

}
