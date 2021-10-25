package exercise.lab4_5.records;

/*
 * tạo class Texts kế thừa abstract Records
 * thêm thuộc tính numberOfLines(số dòng của text)
 */
public class Texts extends Records {
	private int numberOfLines;

//tạo contructor cho class Texts
	public Texts(String name, double sizes, int numberOfLines) {
		super(name, sizes);
		this.numberOfLines = numberOfLines;
	}

}
