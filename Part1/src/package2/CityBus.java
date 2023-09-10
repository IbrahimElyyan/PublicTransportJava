// -----------------------------------------------------
// Part: (1)
// -----------------------------------------------------

package package2;

import package1.PublicTransportation;
/**
 * CityBus is a subclass of PublicTransportation, and a parent class of Metro and Tram.
 * @author ibrahim_elyyan
 *
 */
public class CityBus extends PublicTransportation{
	protected long routeNum;
	protected int beginOperationYear;
	protected String lineName;
	protected String driversName;
	/**
	 * Constructor that initializes variables from parent class using super keyword
	 * It also initializes variables routNum, beginOperationYear, lineName, driversName
	 */
	public CityBus(){
		super();
		routeNum = 0;
		beginOperationYear = 0;
		lineName = null;
		driversName = null;
	}
	/**
	 * Parameterized constructor that initialize all the attributes of the created object from CityBus
	 * @param ticketPrice is the price of the ticket
	 * @param numStops is the number of stops
	 * @param routeNum is the number of routes
	 * @param beginOperationYear is the year the operation began
	 * @param lineName is the name of the line
	 * @param driversName is the name of the driver
	 */
	public CityBus(double ticketPrice, int numStops, long routeNum, int beginOperationYear, String lineName, String driversName){
		super(ticketPrice, numStops);
		this.routeNum = routeNum;
		this.beginOperationYear = beginOperationYear;
		this.lineName = lineName;
		this.driversName = driversName;
	}
	/**
	 * Copy constructor creates a copy of the variables 
	 * @param cBus is an object of CityBus
	 */
	public CityBus(CityBus cBus){
		this.ticketPrice = cBus.ticketPrice;
		this.numStops = cBus.numStops;
		this.routeNum = cBus.routeNum;
		this.beginOperationYear = cBus.beginOperationYear;
		this.lineName = cBus.lineName;
		this.driversName = cBus.driversName;
	}
	/**
	 * This method gets the value of routeNum
	 * @return gives the value of routeNum
	 */
	public long getRouteNum() {
		return routeNum;
	}
	/**
	 * This method allows to set routeNum, it can be changed
	 * @param routeNum
	 */
	public void setRouteNum(long routeNum) {
		this.routeNum = routeNum;
	}
	/**
	 * This method gets the value of beginOperationYear
	 * @return gives the value of beginOperationYear
	 */
	public int getBeginOperationYear() {
		return beginOperationYear;
	}
	/**
	 * This method allows to set beginOperationYear, it can be changed
	 * @param beginOperationYear
	 */
	public void setBeginOperationYear(int beginOperationYear) {
		this.beginOperationYear = beginOperationYear;
	}
	/**
	 * This method gets the value of lineName
	 * @return gives the value of lineName
	 */
	public String getLineName() {
		return lineName;
	}
	/**
	 * This method allows to set lineName, it can be lineName
	 * @param lineName
	 */
	public void setLineName(String lineName) {
		this.lineName = lineName;
	}
	/**
	 * This method gets the value of driversName
	 * @return gives the value of driversName
	 */
	public String getDriversName() {
		return driversName;
	}
	/**
	 * This method allows to set driversName, it can be changed
	 * @param driversName
	 */
	public void setDriversName(String driversName) {
		this.driversName = driversName;
	}
	/**
	 * toString method represents information about CityBus object
	 */
	public String toString() {
		return "This city bus has "+ numStops +" stops, and costs $" + ticketPrice + ". The route number is " + routeNum + ", and the operation year began on " + beginOperationYear + 
				". The name of the line is " + lineName + ", and the drivers name is " + driversName + ".";
	}
	/**
	 * equals method is used to see if two objects are equal
	 * @param c1 is the object that is being compared with this object
	 * @return gives true or false depending on equality
	 */
	public boolean equals(CityBus c1) {
		if(c1.getClass()==this.getClass() && c1.ticketPrice==this.ticketPrice && c1.numStops==this.numStops && c1.routeNum==this.routeNum && c1.beginOperationYear==this.beginOperationYear && 
				c1.lineName.equalsIgnoreCase(this.lineName) && c1.driversName.equalsIgnoreCase(this.driversName)) {
			return true;
		} else return false;
	}
}