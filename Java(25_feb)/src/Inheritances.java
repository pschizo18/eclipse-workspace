//classes inherit state and behavior from other classes
public class Inheritances {
	public static void main(String[] args) {
		Animal a = new Animal(4, 10, true, "Animal");
		// dog class inherits method from animal class
		Dog pinky = new Dog(4, 10, true, "POMORIAN", true, 15);
		pinky.eat();
		pinky.move(true);
		System.out.println("currently:" + pinky.toString());
		
		Fish redtail = new Fish("red");
		redtail.eat();
		redtail.move();
		System.out.println("currently:" + redtail.toString());
	}

}

/////////////////// Super Class ////////////////////
class Animal {
	// field for states
	private int legs;
	private int size;
	private boolean brainAdvanced;
	private String name;

	// methods for behavior
	public void eat() {
		System.out.println("eating");
	}

	public void move() {
		System.out.println("moving");
	}

	// constructor
	public Animal(int legs, int size, boolean brainAdvanced, String name) {
		super();
		this.legs = legs;
		this.size = size;
		this.brainAdvanced = brainAdvanced;
		this.name = name;
	}

	public Animal(String name) {
		this(4, 25, false, name);
	}

	@Override
	public String toString() {
		return "Animal [legs=" + legs + ", size=" + size + ", brainAdvanced=" + brainAdvanced + ", name=" + name + "]";
	}
}

////////////////////// Sub Class ///////////////////
class Dog extends Animal {
	// In addition to base fields, below specific fields
	private boolean tails;
	private int teeth;

	// as a empty constructor is not available
	public Dog(int legs, int size, boolean brainAdvanced, String name, boolean tail, int teeth) {
		super(legs, size, brainAdvanced, name);
		this.tails = tail;
		this.teeth = teeth;
	}

	public Dog(String name) {
		super(4, 25, false, name);
		this.tails = true;
		this.teeth = 10;
	}

	@Override
	public String toString() {
		return "Dog [tails=" + tails + ", teeth=" + teeth + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	@Override
	public void eat() {
		super.eat();
		System.out.println("by chewing using teeths");
	}

	public void move(boolean speed) {
		super.move();
		System.out.println("speed is " + speed);
	}
}

/////////////////// Fish ////////////////////
class Fish extends Animal {

	public Fish(String name) {
		super(0, 1, false, name);
		this.fins = 4;
		this.gills = 2;
	}

	private int gills;
	private int fins;

	@Override
	public void eat() {
		System.out.println("swallowing");
		super.eat();
	}

	@Override
	public void move() {
		System.out.println("swiming");
		super.move();
	}

	@Override
	public String toString() {
		return "Fish [gills=" + gills + ", fins=" + fins + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

}