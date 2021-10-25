package exercise.onclass.shape;

public class Circle implements IShape {
	private CartPt loc;
	private int radius;

	public Circle(CartPt loc, int radius) {
		super();
		this.loc = loc;
		this.radius = radius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.radius * this.radius * Math.PI;
	}

	@Override
	public double distanceToO() {
		return this.loc.distance();
	}



	@Override
	public double boundingBox() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isInside(CartPt point) {
		// TODO Auto-generated method stub
		return false;
	}

}
