import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;

public class iotjava{
	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog("Enter a path");
		String bright = JOptionPane.showInputDialog("Enter a Bright level");
		
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		DimmingLights moodLamp = new DimmingLights(id+" moodlamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();
	}
}