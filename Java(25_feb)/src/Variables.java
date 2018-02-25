/**
 * variables= is a place in memory is a box inside which a piece of information
 * can be stored. we can assign a name and give a type it will store.
 */
class Variable {

	// return a "int" variable type and value
	public int getVariable() {
		int i = 0; // data type name = value;
		return i = 10;
	}

	private int a = 1000; // 32 bit signed value
	private Integer A = Integer.MAX_VALUE, ASIZE = Integer.SIZE;
	private long b = 10_000_000l; // underscore makes readable number

	// return string containing all data types and their sizes
	public String getSizeOfAllVariables() {
		return "char:" + Character.SIZE + " byte:" + Byte.SIZE + " short:" + Short.SIZE + " int:" + Integer.SIZE
				+ " long:" + Long.SIZE + " float:" + Float.SIZE + " double:" + Double.SIZE;
	}

	// ,-126 ,-127 ,-128 ,127 ,126 it the output. (-128)min (-1) = (127)max
	private byte p = 127;

	public void loopByte() {
		while (-128 < p && p < 128)
			System.out.print(" ," + p--);
		System.out.println("");
	}

	// casting by explicit with truncation will happen for max value the casted
	// datatype can hold, else junk value
	// MEANS- right side value if within max value of left side datatype then
	// working. else junk
	public byte castShortToByte(short s) {
		return (byte) s;
	}

	// auto casting
	public short castByteToShort(Byte b) {
		return b;
	}
	
	//literals and expression.
	private int literal = 389464;
	private int expression = literal + 67859;
	
	//floating point number: float single precision and double is double precision
	private float f = 1.0f;
	private double d = 10.0d;
	
	public void printFloatingPorintNumbers() {
		System.out.println("floating point numbers "+f+" ,"+d);
	}

	//returns decimal points to which they hold precision/accuracy
	public void printPrecision() {
		float z =5/3.0f;
		System.out.println("precision:"+z+" , in double:"+5/3.0);
	}
	
	//single quote characters (can contain unicode chars)
	public final char x = 'X', unicode = '\u00A9';	//copy right symbol
	
	//string is a sequence character
	private String str = "look 0.00 ";
	public final String s = str+"\u00AE";	//concatenation
}

/////////////////////////////////////////////////////////////////////////////////////////////////////

public class Variables {

	public static void main(String[] args) {
		Variable v = new Variable();
		System.out.println("variable value is " + v.getVariable());
		Integer i = (Integer) v.getVariable();
		if (i instanceof Integer)
			System.out.println("and data type is int");
		System.out.println("\n*** *** *** *** *** *** *** *** ");
		System.out.println("byte max and min value:");
		v.loopByte();
		System.out.println("\n*** *** *** *** *** *** *** *** ");
		System.out.println("casting : short s=max" + Short.MAX_VALUE + ", byte will be after casted "
				+ v.castShortToByte(Short.MAX_VALUE));
		System.out.println("casting : short s=" + Byte.MAX_VALUE + ", byte will be after casted "
				+ v.castShortToByte(Byte.MAX_VALUE));
		System.out.println("\n*** *** *** *** *** *** *** *** ");
		System.out.println("SIZE is: " + v.getSizeOfAllVariables());
		System.out.println("\n*** *** *** *** *** *** *** *** ");
		v.printFloatingPorintNumbers();
		v.printPrecision();
		System.out.println("\n*** *** *** *** *** *** *** *** ");
		System.out.println("unicode chars:"+v.unicode);
		System.out.println("\n*** *** *** *** *** *** *** *** ");
		System.out.println("String:"+v.s);
	}

}
