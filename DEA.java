/*
 * @author Douglas Wendel
 * This class is the DEA class that implements the observer class.
 * this class creates an arraylist of the locations as to whcih
 * people have been sighted. It allows a user to update the array
 * and get the information that is stored in the array. 
 */
package observerdesignpattern;
import java.util.ArrayList;
public class DEA implements Observer {
	Subject cook; 
	String temp = "Locations:\n";
	ArrayList<String> locations;
	String notes = " ";
	public DEA(Subject cook) {
		this.cook = cook;
		this.locations = new ArrayList<String>();
		cook.registerObserver(this);
	}
	@Override
	public void update(String location, String description) {
		// TODO Auto-generated method stub
		locations.add(location);
		this.notes += "\n"+description;
	}
	@Override
	public String getLog() {
		// TODO Auto-generated method stub
		for(String location:locations) {
			temp += location + "\n";
		}
		temp += "\nNotes: ";
		temp += notes;
		return temp;
	}
		//String temp; 
}


