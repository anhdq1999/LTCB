package exercise.onclass.animal;

public class Lion extends Animal implements IZooAnimal {
	private int meat;

	public Lion(String name, double weight, int meat) {
		super(name, weight);
		this.meat = meat;
	}

	

}
