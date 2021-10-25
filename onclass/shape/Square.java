package exercise.onclass.shape;

public class Square implements IShape {
	private CartPt loc;
	private int size;
	
	public Square(CartPt loc, int size) {
		super();
		this.loc = loc;
		this.size = size;
	}

	@Override
	public double area() {
		return this.size * this.size;
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
