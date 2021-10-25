package exercise.onclass.animal;

public class Snake extends Animal implements IZooAnimal{
	private double lenght;

	public Snake(String name, double weight, double lenght) {
		super(name, weight);
		this.lenght = lenght;
	}

}
