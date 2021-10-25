package exercise.onclass.shape;

public class Dot implements IShape {
	private CartPt loc;

	public Dot(CartPt loc) {
		super();
		this.loc = loc;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
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
