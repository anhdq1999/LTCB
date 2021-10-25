package exercise.lab4_4.shape;

public abstract class AShape implements IShape{
	protected Cartpt loc;

	public AShape(Cartpt loc) {
		super();
		this.loc = loc;
	}
}
