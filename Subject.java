/*
 * @author DOuglas Wendel
 * 
 * this class just declares methods and is an interface.
 */
package observerdesignpattern;

public interface Subject {
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers(String location, String description);
}
