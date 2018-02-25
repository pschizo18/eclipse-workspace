import java.util.Scanner;

public class CharactersStrings {
	// Enumeration
	// set of items that go together

	private static final int FROSH = 1;
	private static final int JR = 2;
	private static final int SR = 3;

	// linking the constants, grouping as enum
	public void enumeration() {
		Scanner s = new Scanner(System.in);
		int year = s.nextInt();
		switch (year) {
		case FROSH:
			System.out.println("you are frosh. confirm?");
			break;
		case JR:
			System.out.println("you are junior. confirm?");
			break;
		case SR:
			System.out.println("you are senior. confirm?");
			break;
		}
	}

	/**********************************************/
	// character:
	// ASCII unicode set --> it's created a charactes enumeration for all the
	// characters.
	// eg: value decimal 65 is ('A')....sequentially created
	// special characters with escpae character: '\'', '\\'. '\"'

	private char charVariable = "ABC".charAt(0);

	// convert uppercase character to lowercase character
	public char toLowerCase(char character) {
		if (character >= 'A' && character <= 'Z')
			return (char) (character + 'a' - 'A');
		return character;

		// inbuilt method
		// Character.toUpperCase(character)
	}

	// print characters sequentially
	public void printChar() {
		for (char c = 'A'; c <= 'Z'; c++) {
			System.out.println(c);
		}
	}

	/**********************************************/

	// string are immutable. not allowed to change the context.
	//to change we have create a new string is possible
	// string is a class not a primitive like char
	private String strVaribale = "string".toUpperCase();

	private String stringVariable = "string";
	// check for string equality
	boolean equals = stringVariable.equals(strVaribale);

	// string.substring(startIndex,endIndex);
	// string.compareTo(stringAnother); returns an integer

	public String convertCharacterByCharacter(String strVariable) {
		String result = "";
		for (int index = 0; index <= strVariable.length(); index++) {
			char character = strVariable.charAt(index);
			result += Character.toUpperCase(character);
		}
		return result;
	}

	// reverse the string
	public String reverse(String strVariable) {
		String result = "";
		for (int index = 0; index <= strVariable.length(); index++) {
			char character = strVariable.charAt(index);
			result = character + result;
		}
		return result;
	}

	// count the number of uppercase character
	private int countUpperCase(String variable) {
		int count = 0;
		for (char character : variable.toCharArray()) {
			if (Character.isUpperCase(character))
				count++;
		}
		return count;
	}

}
