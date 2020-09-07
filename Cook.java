/*
 * @author Douglas Wendel
 * 
 * The cook class implements subject and generates an 
 * array list to store the information given through. 
 * this class also allows the registration, removal
 * notification of the observers and allows to enter
 * a sighting returning the name at the end.
 */
package observerdesignpattern;
import java.util.ArrayList; 

public class Cook implements Subject {
	String name = "";
	ArrayList<Observer> observers; 	
	public Cook(String name) {
		this.name = name;
		this.observers = new ArrayList<Observer>();
	}
	@Override
	public void registerObserver(Observer observer) {
		if(!observers.contains(observer)) 
			observers.add(observer);
	}
	@Override
	public void removeObserver(Observer observer) {
		if(observers.contains(observer))
			observers.remove(observer);
	}
	@Override
	public void notifyObservers(String location, String description) {
		for(Observer observer : observers) 
			observer.update(location,description);
	}
	public void enterSighting(String location, String description) { 
		notifyObservers(location,description);
	}
	public String getName() {
		return this.name; 
		
	}

}
