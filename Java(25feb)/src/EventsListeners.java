
public class EventsListeners {

	// when you do something, that is event. 
	// the event will change the course of the program.
	
	// event such as pressing key. mouse click.
	// when user interacts with the computer, events are happening
	// the program should detect and respond to such an event.

	/* java library: java.awt.event.*; 
	 * put off the listeners to monitor for events. ex mouseListeners / keyListeners
	 * certain method are called (asynchronously call) when event happens
	 */

	/*
	 * class clickForFace extends GraphicsProgram{ 
		 * event driven program. 
		 * until the mouse click happens program doesnot do anything 
		 * 
		 * public void init() {
		 * addMouseListeners(); 
		 * listening for the mouse 
		 * } 
		 * 
		 * //asynchronous event. 
		 * donot know when it will be called. but will be when mouse is clicked 
		 * public void mouseClicked(MouseEvent e) { 
		 * show a face on the screen. 
		 * GOval 
		 * e.getX(), e.getY() from the clicked event
		 * } 
	 * }
	 */

	// mousePressed(e), mouseDragged(e), mouseReleased(e)..
	// addKeyListeners() event listener for keyboard event
	// keyTyped(e), keyPressed(e) here e is KeyEvent

}
