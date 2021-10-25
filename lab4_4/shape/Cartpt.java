package exercise.lab4_4.shape;

public class Cartpt {
	private int x;
	private int y;

	public Cartpt(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double distanceToO() {
		return Math.sqrt(this.x * this.x + this.y * this.y);
	}

	public double distance(Cartpt that) {
		double diffX = this.x - that.x;
		double diffY = this.y - that.y;
		return Math.sqrt(diffX * diffX + diffY * diffY);
	}

	public Cartpt translate(int dX, int dY) {
		return new Cartpt(this.x + dX, this.y + dY);
	}

}
