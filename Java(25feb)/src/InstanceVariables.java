import java.util.ArrayList;
import java.util.List;

public class InstanceVariables {
		//Strings: a piece of text. sequence of characters.
		int age = 30;
		private String fields = "name:[" + "keerthi" + "]" + "age:[" + age + "]";
		/*****************************************************/
		//Inheritance
		/* public class subClass extends superClass{ 
		 * //variables 
		 * //inside methods both have visibility 
		 */
		
		// subClass.java
		// subClass.class
		// package: set of classes grouped together
		
		/* public: export outside class 
		 * private: contain within class
		 */
		/*****************************************************/
		//Constructor: create new instance/object. 
		//initialize everything that goes way with this object
		public InstanceVariables(int startMinute){ //class name
			this.counter = startMinute;	
		}
		public InstanceVariables(){
			this(0);
		}
		//instance variables
		private int counter;
		//return the present counter value and increments the counter value
		//local variable
		public int nextCounter() {
			int temp = counter;
			counter++;
			return temp;
		}
		
		//shadow: when any variable is used. first look for any variable is there 
		//in local variable then check for instance variable.
		
		//passing object as parameters in method call is pass by reference.
		//meaning in other words: object itself is passed
		/*************************************************/
		
		//class variables: one variable shared by all the class/objects
		private static List classVariable = new ArrayList<>();
		
		//can be called inside class, as constructor is private
		private static InstanceVariables instance = new InstanceVariables();
		/*private Course106A9() {
		}*/
		
		public static InstanceVariables getInstance() {
			return instance;
		}
		//Variables.getInstance();
		/***********************************************************/
		
		//java doc system - generate html pages explaining what does the class/code does
		//special tag- @param specifies the parameters description, 
		//@results does it for returns type
		// <tag> @param <name> parameterOne <description> this is parameter one
		
}
