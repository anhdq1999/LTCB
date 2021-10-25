package exercise.lab4_8.bookstote;

/*
 * tạo abstract class gồm các thuộc tính :
 * titile, authorName, price, yearOfPublic
 */
public abstract class Record {
	protected String title;
	protected String authorName;
	protected double price;
	protected int yearOfPublic;

	/*
	 * tạo contructor
	 */
	public Record(String title, String authorName, double price, int yearOfPublic) {
		super();
		this.title = title;
		this.authorName = authorName;
		this.price = price;
		this.yearOfPublic = yearOfPublic;
	}

	/*
	 * salePrice, which computes the sale price of each book;
	 */
	public abstract double salePrice();

	/*
	 * cheaperThan, which determines whether a book is cheaper than another book;
	 */
	public abstract boolean cheaperThan(Record that);

	/*
	 * sameAuthor, which determines whether a book was written by some given author
	 * which wrote another book.
	 */
	public boolean sameAuthor(String authorThat) {
		return this.authorName.equalsIgnoreCase(authorThat);
	}
}
