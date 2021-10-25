package exercise.onclass.animal;

public class Monkey extends Animal implements IZooAnimal {
	private String food;

	public Monkey(String name, double weight, String food) {
		super(name, weight);
		this.food = food;
		// TODO Auto-generated constructor stub
	}

}
