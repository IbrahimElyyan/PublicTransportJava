// -----------------------------------------------------
// Part: (2)
// -----------------------------------------------------

package package2;
/**
 * Metro is a subclass of CityBus
 * @author ibrahim_elyyan
 *
 */
public class Metro extends CityBus{
	private int numVehicles;
	private String cityName;
	/**
	 * Constructor that initializes variables from parent class using super keyword
	 * It also initializes variables numVehicles and cityName
	 */
	public Metro(){
		super();
		numVehicles = 0;
		cityName = null;
	}
	/**
	 * Parameterized constructor that initialize all the attributes of the created object from Metro.
	 * @param ticketPrice is the price of the ticket
	 * @param numStops is the number of stops
	 * @param routeNum is the number of routes
	 * @param beginOperationYear is the year the operation began
	 * @param lineName is the name of the line
	 * @param driversName is the name of the driver
	 * @param numVehicles is the number of vehicles
	 * @param cityName is the name of the city
	 */
	public Metro(double ticketPrice, int numStops, long routeNum, int beginOperationYear, String lineName, String driversName, int numVehicles, String cityName){
		super(ticketPrice, numStops, routeNum, beginOperationYear, lineName, driversName);
		this.numVehicles = numVehicles;
		this.cityName = cityName;
	}
	/**
	 * Copy constructor creates a copy of the variables
	 * @param metro is an object of Metro
	 */
	public Metro(Metro metro){
		this.numVehicles = metro.numVehicles;
		this.cityName = metro.cityName;
	}
	/**
	 * This method gets the value of numVehicles
	 * @return gives the value of numVehicles
	 */
	public int getNumVehicles() {
		return numVehicles;
	}
	/**
	 * This method allows to set numVehicles, it can be changed
	 * @param numVehicles
	 */
	public void setNumVehicles(int numVehicles) {
		this.numVehicles = numVehicles;
	}
	/**
	 * This method gets the value of cityName
	 * @return gives the value of cityName
	 */
	public String getCityName() {
		return cityName;
	}
	/**
	 * This method allows to set cityName, it can be changed
	 * @param cityName
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	/**
	 * toString method represents information about Metro object
	 */
	public String toString() {
		return "This metro number of vehicles is " + numVehicles + ", and the name of the city is " + cityName + ".";
	}
	/**
	 * equals method is used to see if two objects are equal
	 * @param m1 is the object that is being compared with this object
	 * @return gives true or false depending on equality
	 */
	public boolean equals(Metro m1) {
		if(m1.getClass()==this.getClass() && m1.numVehicles==this.numVehicles && m1.cityName.equalsIgnoreCase(this.cityName)) {
			return true;
		} else return false;
	}
}
