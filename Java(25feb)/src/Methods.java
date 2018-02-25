import java.util.HashMap;
import java.util.Map;

public class Methods {
	/*
	 * method is a like CD player. A. <generalized> by input parameter is a CD and
	 * out came is a music.
	 * 
	 * B. <information hiding>: software engineering principle because the person
	 * using should not worry about internals about it.
	 * 
	 * C. write methods like private int informationHiding(double cd) {HIDDEN} the
	 * above method can be <implemented> in any way.
	 */

	// <arguments/parameters> is by pass by copy when method call happens
	private int informationHiding(double cd) {

		// <local variables>. with there life time being method blocks.
		int music = 0;
		return music;
	}

	// informationHiding(2d);
	// -- stack frame is created. with local variables in memory. once executed.
	// frame gets poped out of stack. suppose one more method call happens inside
	// the method -- stack frame gets created one on top of another.

	/*****************************************************************/

	// private RandomGenerator instanceVariable = RandomGenerator.getInstance();
	private Map instanceVariableAnother = new HashMap<>();
	// holds <state> of this class / object

	// specified as <iVars> called instance Variable.
	// declared inside class. hence <shared> by all methods inside class.
	// lifetime is as long as <object>.

	// clear the map, if its not empty
	private void useMap() {
		if (!instanceVariableAnother.isEmpty())
			instanceVariableAnother.clear();
	}

	// manually clear the map by removing one element by element
	private void useMapAgain() {
		for (Object localVariable : instanceVariableAnother.keySet()) {
			instanceVariableAnother.remove(localVariable);
		}
	}

}
