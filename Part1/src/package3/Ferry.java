// -----------------------------------------------------
// Part: (1)
// -----------------------------------------------------

package package3;

import package1.PublicTransportation;
/**
 * Ferry is a subclass of PublicTransportation
 * @author ibrahim_elyyan
 *
 */
public class Ferry extends PublicTransportation{
	int buildYear;
	String shipName;
	/**
	 * Constructor that initializes variables from parent class using super keyword
	 * It also initializes variables buildYear and shipName
	 */
	public Ferry(){
		super();
		buildYear = 0;
		shipName = null;
	}
	/**
	 * Parameterized constructor that initialize all the attributes of the created object from Ferry
	 * @param ticketPrice is the price of the ticket
	 * @param numStops is the number of stops
	 * @param buildYear is the build year
	 * @param shipName is the name of the ship
	 */
	public Ferry(double ticketPrice, int numStops, int buildYear, String shipName){
		super(ticketPrice, numStops);
		this.buildYear = buildYear;
		this.shipName = shipName;
	}
	/**
	 * Copy constructor creates a copy of the variables
	 * @param ferry is an object of Ferry
	 */
	public Ferry(Ferry ferry){
		this.ticketPrice = ferry.ticketPrice;
		this.numStops = ferry.numStops;
		this.buildYear = ferry.buildYear;
		this.shipName = ferry.shipName;
	}
	/**
	 * This method gets the value of BuildYear
	 * @return gives the value of BuildYear
	 */
	public int getBuildYear() {
		return buildYear;
	}
	/**
	 * This method allows to set buildYear, it can be changed
	 * @param buildYear
	 */
	public void setBuildYear(int buildYear) {
		this.buildYear = buildYear;
	}
	/**
	 * This method gets the value of shipName
	 * @return gives the value of shipName
	 */
	public String getShipName() {
		return shipName;
	}
	/**
	 * This method allows to set shipName, it can be changed
	 * @param shipName
	 */
	public void setShipName(String shipName) {
		this.shipName = shipName;
	}
	/**
	 * toString method represents information about Ferry object
	 */
	public String toString() {
		return "This ferry has "+ numStops +" stops, and costs $" + ticketPrice + ". The build year is " + buildYear + 
				", and the name of the ship is " + shipName + ".";
	}
	/**
	 * equals method is used to see if two objects are equal
	 * @param f1 is the object that is being compared with this object
	 * @return gives true or false depending on equality
	 */
	public boolean equals(Ferry f1) {
		if(f1.getClass()==this.getClass() && f1.ticketPrice==this.ticketPrice && f1.numStops==this.numStops && f1.buildYear==this.buildYear && f1.shipName.equalsIgnoreCase(this.shipName)) {
			return true;
		} else return false;
	}
}
