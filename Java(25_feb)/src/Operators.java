// symbols performing specific operations on two operands and resulting in a
// answer
class Operator {
	// + operator
	public int operate(int a, int b) {
		return a + b;
	}

	// % operator
	public int remainder(int a, int b) {
		return a % b;
	}

	// if condition checks for boolean and not >0 numbers
	public void checkCondition() {
		boolean b = false;
		if (b = true)
			System.out.println("flag is true, as assigned inside if condition");
		int i = 1;
		if (i == 0) {
			// ........empty
		}
	}
	
	//expressions are built with value, variables and operators
	public double getMilestoKM(double k) {
		return k * 1.60924;
	}
	
	//white spaces is needed. one or more is treated same
	private int 	whitespaces = 1;
}

public class Operators {

	public static void main(String[] args) {
		Operator o = new Operator();
		System.out.println("the operating on two operands is a+b=" + o.operate(1, 1));
		System.out.println("the remainder on two operands is a%b=" + o.remainder(45, 3));
		System.out.println("*** *** *** *** *** *** *** *** *** ***");
		o.checkCondition();
		System.out.println("miles 12.5 in km is "+o.getMilestoKM(12.5));
	}

}