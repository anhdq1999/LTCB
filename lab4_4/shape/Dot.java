package exercise.lab4_4.shape;

public class Dot extends AShape {

	public Dot(Cartpt loc) {
		super(loc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		return 0.0;
	}

	@Override
	public double distanceToO() {
		return this.loc.distanceToO();
	}

	@Override
	public boolean contain(Cartpt point) {

		return this.loc.distance(point) == 0.0;
	}

	@Override
	public Square boundingBox() {
		return new Square(this.loc, 0);
	}

}
