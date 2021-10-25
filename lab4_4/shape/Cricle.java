package exercise.lab4_4.shape;

public class Cricle extends AShape {
	private int radius;

	public Cricle(Cartpt loc, int radius) {
		super(loc);
		this.radius = radius;
	}

	@Override
	public double area() {
		return this.radius * this.radius * Math.PI;
	}

	@Override
	public double distanceToO() {
		return this.loc.distanceToO();
	}

	@Override
	public boolean contain(Cartpt point) {
		return this.loc.distance(point) <= this.radius;
	}

	@Override
	public Square boundingBox() {
		return new Square(this.loc.translate(-this.radius, -this.radius), this.radius * 2);
	}

}
