// -----------------------------------------------------
// Part: (1)
// -----------------------------------------------------

package package2;
/**
 * Tram is a subclass of CityBus
 * @author ibrahim_elyyan
 *
 */
public class Tram extends CityBus{
	int maxSpeed;
	/**
	 * Constructor that initializes variables from parent class using super keyword
	 * It also initializes variables maxSpeed
	 */
	public Tram(){
		super();
		maxSpeed = 0;
	}
	/**
	 * 
	 * Parameterized constructor that initialize all the attributes of the created object from Tram
	 * @param ticketPrice is the price of the ticket
	 * @param numStops is the number of stops
	 * @param routeNum is the number of routes
	 * @param beginOperationYear is the year the operation began
	 * @param lineName is the name of the line
	 * @param driversName is the name of the driver
	 * @param maxSpeed the maximum speed
	 */
	public Tram(double ticketPrice, int numStops, long routeNum, int beginOperationYear, String lineName, String driversName, int maxSpeed){
		super(ticketPrice, numStops, routeNum, beginOperationYear, lineName, driversName);
		this.routeNum = routeNum;
		this.beginOperationYear = beginOperationYear;
		this.lineName = lineName;
		this.driversName = driversName;
		this.maxSpeed = maxSpeed;
	}
	/**
	 * Copy constructor creates a copy of the variables
	 * @param tram is an object of Tram
	 */
	public Tram(Tram tram){
		this.ticketPrice = tram.ticketPrice;
		this.numStops = tram.numStops;
		this.routeNum = tram.routeNum;
		this.beginOperationYear = tram.beginOperationYear;
		this.lineName = tram.lineName;
		this.driversName = tram.driversName;
		this.maxSpeed = tram.maxSpeed;
	}
	/**
	 * This method gets the value of maxSpeed
	 * @return gives the value of maxSpeed
	 */
	public int getMaxSpeed() {
		return maxSpeed;
	}
	/**
	 * This method allows to set maxSpeed, it can be changed
	 * @param maxSpeed
	 */
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	/**
	 * toString method represents information about Tram object
	 */
	public String toString() {
		return "This tram has "+ numStops +" stops, and costs $" + ticketPrice + ". The route number is " + routeNum + ", and the operation year began on " + beginOperationYear + 
				". The name of the line is " + lineName + ", and the drivers name is " + driversName + ". The maximum speed is " + 
				maxSpeed + "km/h.";
	}
	/**
	 * equals method is used to see if two objects are equal
	 * @param t1 is the object that is being compared with this object
	 * @return gives true or false depending on equality
	 */
	public boolean equals(Tram t1) {
		if(t1.getClass()==this.getClass() && t1.ticketPrice==this.ticketPrice && t1.numStops==this.numStops && t1.routeNum==this.routeNum && t1.beginOperationYear==this.beginOperationYear && 
				t1.lineName.equalsIgnoreCase(this.lineName) && t1.driversName.equalsIgnoreCase(this.driversName) && t1.maxSpeed==this.maxSpeed) {
			return true;
		} else return false;
	}
}