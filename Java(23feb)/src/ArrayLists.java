import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

	public static void main(String[] args) {
		// wouldn't it be helpful if array grows upon need
		List arrayLVariable = new ArrayList<Integer>();
		arrayLVariable.add(1);
		// adds to end of array, grows the element by one
		System.out.println("Size:" + arrayLVariable.size());
		int element = (int) arrayLVariable.get(0);

		// dynamically changes it size. its effective size and actually size go together

		// Template: is a class, allows specialized based on type
		// parameterized type: <T> element

		// method
		// .arrayLVariable.add(<T> element)
		// .arrayLVariable.add(position, <T> element)
		// .arrayLVariable.remove(<T> element)
		// .arrayLVariable.remove(position)
		// .arrayLVariable.get(position)
		// .arrayLVariable.get(<T> element)
		// .arrayLVariable.indexOf(<T> element) //position in the array

		// arrayList holds only object. the parameterized type is object
		/*************************************************************/
		
	}

}
