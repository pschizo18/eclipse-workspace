//avoid code duplication for reusability
class Method {
	// convert code blocks into method calls
	// all the code in between block gets executed when a method call happens
	// passing parameters to method call which has arguments
	public void sleep(int miliseconds) {
		System.out.println("method execution starts...");
		try {
			Thread.sleep(miliseconds);
		} catch (InterruptedException e) {
			System.out.println("method execution failed, but..");
		}
		System.out.println("method execution ends");
	}
	
	
}

public class Methods {

	public static void main(String[] args) {
		Method m = new Method();
		m.sleep(5000);
	}

}
