/*
 * @author Douglas Wendel
 * 
 * There is not much to say about this class but it declares
 * two main variables and sets the location and details
 * to which it should be set to and returns them. 
 */
package observerdesignpattern;
public class Sighting {
	String location;
	String details;
	public Sighting(String location, String details) {
		this.location = location;
		this.details = details;
	}
	public String getLocation() {
		return this.location;
	}
	public String getDetails() {
		return this.details;
	}

}
