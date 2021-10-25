package exercise.lab4_5.records;

/*tạo class images kế thừa từ abstract class Records
 * thêm các thuộc tính : height, width, quality
  */
public class Images extends Records {
	private int height;
	private int width;
	private String quality;

	public Images(String name, double sizes, int height, int width, String quality) {
		super(name, sizes);
		this.height = height;
		this.width = width;
		this.quality = quality;
	}

}
