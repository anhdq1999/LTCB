package exercise.onclass.shape;

public class CartPt {
	protected int x;
	protected int y;

	public CartPt(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double distance() {
		return Math.sqrt(this.x * this.x + this.y * this.y);
	}
}
