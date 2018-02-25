import javax.swing.*;

public class GUI {
	//graphical user interface
	//these are things, you will interact with them. (interactors)
	//buttons, sliders, check boxes, radio buttons, select box

	//import javax.swing.*;
	//java.awt.event.*;   interacting events
	
	public static void main(String[] args) {
		
		//public void init(){
		//addActionlisteners();
		//every time an action happens, method ActionPerformed will be called.
		
		JButton b = new JButton("button");
		//add(b,SOUTH);
		//put this button on southern region, and since an interactors
		//is in south , the southern region will show up
		
		//public void actionPerformed(ActionEvent e){
		//the action performed so that above was called
		//String cmd = e.getActionCommand();
		//returns label on the element caused action
		//if(cmd.equals("button")) {
			//System.out.println("button clicked");
		//}
		/****************************************************/
		
		JCheckBox c = new JCheckBox("front");
		c.setSelected(true);
		//add(c,SOUTH);
		c.isSelected(); //is the check box checked or not
		/****************************************************/
		
		JRadioButton s = new JRadioButton("small");
		JRadioButton m = new JRadioButton("medium");
		JRadioButton l = new JRadioButton("large");
		ButtonGroup size = new ButtonGroup();
		size.add(s);
		size.add(m);
		size.add(l);
		s.setSelected(true); //after added to group
		//add(s,SOUTH); .........
		/****************************************************/
		JComboBox o = new JComboBox();
		o.addItem("black");
		o.setEditable(false);//allow typing
		o.setSelectedItem("black");
		//add(o,SOUTH);
		/****************************************************/
		//addActionlisteners();
		//public void actionPerformed(ActionEvent e){
		//e.getSource() //gives reference to the object started the event
		
		/****************************************************/
		JTextField t = new JTextField(10); //holds atleast 10 chars
		//t.addActionListener(this); //Generate action and let know yourself
		
		//public void actionPerformed(ActionEvent e){
		//e.getSource() == t
		//t.getText()
		/********************************************************/
		// Grid Layout: object. specify how many rows and columns
		//starts at top left grid and moves row wise towards right for the next
		
		//table layout like grid , except integrator will be given 
		//only space as much as needed not complete
		
		
	}
}
