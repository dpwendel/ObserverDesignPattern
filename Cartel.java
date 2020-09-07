/*
 * @author Douglas Wendel
 * 
 * This class is the Cartel class that implements the observer class.
 * This class allows the tester to update and return
 * the sighting details and location. 
 */
package observerdesignpattern;
import java.util.ArrayList;

public class Cartel implements Observer {
	
	Subject cook;
	String notes; 
	ArrayList<Sighting> sightings;
	String temp = "";
	
	public Cartel(Subject cook) {
		this.cook = cook;
		this.sightings = new ArrayList<Sighting>();
		cook.registerObserver(this);
	}

	@Override
	public void update(String location, String description) {
		// TODO Auto-generated method stub
		//sightings.add(new Sighting(location,description));
		//sightings.add(location,description);
		sightings.add(new Sighting(location,description));
		
		
	}

	@Override
	public String getLog() {
		// TODO Auto-generated method stub
		for(Sighting sighting:sightings) {
			temp+=sighting.getLocation();
			temp += "("+sighting.getDetails()+")\n";
		}
		return temp; 
	}

}
