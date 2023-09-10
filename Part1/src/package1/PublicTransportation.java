// -----------------------------------------------------
// Part: (1)
// -----------------------------------------------------

package package1;
/**
 * PublicTransportation is the parent class that is extended by the class CityBus, Ferry and AirCraft.
 * @author ibrahim_elyyan
 *
 */
public class PublicTransportation{
	// Declaring variables
	public double ticketPrice;
	public int numStops;

	/**
	 * Constructor that initializes variables ticketPrice and numStops
	 */
	public PublicTransportation(){
		ticketPrice = 0;
		numStops = 0;
	}
	/**
	 * Parameterized constructor that initialize all the attributes of the created object from PublicTranportation
	 * @param ticketPrice is the price of the ticket
	 * @param numStops is the number of stops
	 */
	public PublicTransportation(double ticketPrice, int numStops){
		this.ticketPrice = ticketPrice;
		this.numStops = numStops;
	}
	/**
	 * Copy constructor creates a copy of the variables 
	 * @param transfer is an object of PublicTransportation
	 */
	public PublicTransportation(PublicTransportation transfer){
		this.ticketPrice = transfer.ticketPrice;
		this.numStops = transfer.numStops;
	}
	/**
	 * This method gets the value of ticketPrice
	 * @return gives the value of ticketPrice
	 */
	public double getTicketPrice() {
		return ticketPrice;
	}
	/**
	 * This method allows to set ticketPrice, it can be changed
	 * @param ticketPrice
	 */
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	/**
	 * This method gets the value of numStops
	 * @return gives the value of numStops
	 */
	public int getNumStops() {
		return numStops;
	}
	/**
	 * This method allows to set numStops, it can be changed
	 * @param numStops
	 */
	public void setNumStops(int numStops) {
		this.numStops = numStops;
	}
	/**
	 * toString method represents information about PublicTransportation object
	 */
	public String toString() {
		return "Public transportation has "+ numStops +" stops, and costs $" + ticketPrice + ".";
	}
	/**
	 * equals method is used to see if two objects are equal 
	 * @param p1 is the object that is being compared with this object
	 * @return gives true or false depending on equality
	 */
	public boolean equals(PublicTransportation p1) {
		if(p1.getClass()==this.getClass() && p1.ticketPrice==this.ticketPrice && p1.numStops==this.numStops) {
			return true;
		} else return false;
	}
}
