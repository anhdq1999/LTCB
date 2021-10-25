package exercise.lab4_4.shape;

public class Rectangles extends AShape {
	private int width;
	private int height;

	public Rectangles(Cartpt loc, int width, int height) {
		super(loc);
		this.width = width;
		this.height = height;
	}

	@Override
	public double area() {
		return this.width * this.height;
	}

	@Override
	public double distanceToO() {
		return this.loc.distanceToO();
	}

	@Override
	public boolean contain(Cartpt point) {
		return false;
	}

	@Override
	public Square boundingBox() {
		// TODO Auto-generated method stub
		return null;
	}
}
