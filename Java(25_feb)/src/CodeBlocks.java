class CodeBlock {
	// single line code block untill semicolon
	public void singleCodeBlock() {
		if (i > 0)

			System.out.println("i is greater then 0");

		else
			System.out.println("i is not more then zero");
	}

	private int i;

	private String scope = "class";

	// variables inside method have method scope
	public String methodScoper(String scopeOther) {
		if (scope != null)
			return scope;
		else if (scopeOther != null)
			return scopeOther;
		else
			return null;
	}
}

public class CodeBlocks {

	public static void main(String[] args) {
		CodeBlock c = new CodeBlock();
		c.singleCodeBlock();
		System.out.println("passing method scope variable return class or method:" + c.methodScoper("method"));
		System.out.println("passing null scope variable return class or method:" + c.methodScoper(null));
		System.out.println("**** *** **** *** **** *** **** *** ");
		
	}

}
