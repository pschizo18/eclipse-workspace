//Characteristics are state and behavior
//states are stored in fields and behavior are exposed in methods
//classes are blue print for objects
//a class can be thought has powerful user defined data type
//public - access modifier. unrestricted access
//private - no other class access
//protected -classes within same page can access
class Class {
	private int fields = 0; // member or class variables
	// private provides encapsulation. internal representation of class is hidden
	// from outside view. no outside access of objects internals

	// local variables are created within methods
	public void methodCall() {
		int localvariables = 1;
	}
}

// Template of object - is class
public class Classes {

	public static void main(String[] args) {
		Class c = new Class(); // object creation of type "Class"

		// Car class has inherited lot of f'x from object class
		Car nano = new Car();
		nano.model = "TATA NANO X"; // public accessibility
		Car baleno = new Car();
		baleno.model = "SUZIKI BALENO";
		// state internal should be contained within class Car

		// object with encapsulation
		nano.setModel("TATA NANO XXX");
		nano.setSeats(2); // back seats count
		nano.setSuv(false);
		nano.setWheels(4);
		// to string gives details about the instance of object
		System.out.println(nano.toString());
		System.out.println("*** *** *** *** *** *** *** *** ");

		// constructor creation
		Account a = new Account("keerthi");
		System.out.println("keerthi account before " + a.toString());
		a.deposit(10);
		a.withdraw(100);
		System.out.println("keerthi account after " + a.toString());
		a.withdraw(5);

	}

}

//////////////// Classes /////////////////////
class Car {
	private int wheels;
	private int seats;
	private boolean suv;
	public String model;

	// methods to handle internals within class Car
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	// this variable is always the object instance calling the method
	public void setSeats(int seats) {
		this.seats = seats;
	}

	public void setSuv(boolean suv) {
		this.suv = suv;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [wheels=" + wheels + ", seats=" + seats + ", suv=" + suv + ", model=" + model + "]";
	}

}

///////////////////// Constructors /////////////////
class Account {
	private long accountNumber;
	private double balance;
	private String customerName;

	// donot call other methods or setters because object creation phase
	public Account(String customerName) {
		this.customerName = customerName;
		this.balance = 0d;
		this.accountNumber = (long) Math.floor(Math.random() * 100000);
	}

	// increase balance only if positive amount
	public boolean deposit(int amount) {
		if (amount >= 0) {
			this.balance += amount;
			return true;
		}
		return false;
	}

	// decrease only if balance is sufficient
	public boolean withdraw(int amount) {
		if (balance - amount < 0)
			return false;
		this.balance = amount;
		return true;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", balance=" + balance + ", customerName=" + customerName
				+ "]";
	}
}