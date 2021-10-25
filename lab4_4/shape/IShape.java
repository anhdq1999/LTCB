package exercise.lab4_4.shape;

public interface IShape {

	public double area();

	public double distanceToO();

	public boolean contain(Cartpt point);

	public Square boundingBox();
}
