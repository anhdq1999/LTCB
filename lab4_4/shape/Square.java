package exercise.lab4_4.shape;

public class Square extends AShape {
	private int size;

	public Square(Cartpt loc, int size) {
		super(loc);
		this.size = size;
	}

	@Override
	public double area() {
		return this.size * this.size;
	}

	@Override
	public double distanceToO() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean contain(Cartpt point) {
		int x = this.loc.getX();
		int y = this.loc.getY();
		return this.between(point.getX(), x, x + this.size) && this.between(point.getY(), y, y + this.size);
	}

	private boolean between(int value, int low, int high) {
		return (low <= value) && (value <= high);

	}

	@Override
	public Square boundingBox() {
		return new Square(this.loc, this.size);
	}

}
