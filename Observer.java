/*
 * @author Douglas Wendel
 * There is not much to say about this class other than its
 * an interface and it declares some methods. 
 */
package observerdesignpattern;

public interface Observer {
	void update(String location, String description);
	String getLog(); 
}
