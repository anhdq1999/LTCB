package exercise.lab4_8.bookstote;

/*
 * tạo class Books kế thừa từ class asbtract Record
 * thêm thuộc tính soldOff;
 */
public class Books extends Record {
	private final double SOLD_OFF = 0.5;

	public Books(String title, String authorName, double price, int yearOfPublic) {
		super(title, authorName, price, yearOfPublic);
		// TODO Auto-generated constructor stub
	}

	/*
	 * salePrice, which computes the sale price of each book;
	 */
	@Override
	public double salePrice() {
		return this.price * (1 - SOLD_OFF);
	}

	/*
	 * cheaperThan, which determines whether a book is cheaper than another book;
	 */
	@Override
	public boolean cheaperThan(Record that) {
		return this.salePrice() < that.salePrice();
	}

}
