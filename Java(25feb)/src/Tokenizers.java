import java.util.StringTokenizer;

public class Tokenizers {
	// tokens: a string with white spaces on either side
	// eg. hello|there,|keerthi --> tokens

	public static void main(String[] args) {
		StringTokenizer s = new StringTokenizer("hello there, how are you");
		s.hasMoreTokens(); //boolean
		s.nextToken();
		
		/***************************************************/
		//Encryption: cesar cipher
		//takes a alphabet and rotates by some number(keys)
		//to find the new letter (encrypted letter)
	}
	
}
