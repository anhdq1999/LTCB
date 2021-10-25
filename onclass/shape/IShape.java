package exercise.onclass.shape;

public interface IShape {

// tính diện tích của hình
	public double area();

//	tính khoảng cách từ hình đến tâm O
	public double distanceToO();

// kiểm tra 1 điểm có nằm trong hình
	public boolean isInside(CartPt point);

	public double boundingBox();
}
