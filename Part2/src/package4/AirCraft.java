// -----------------------------------------------------
// Course: COMP249
// Assignment (1)
// Part: (2)
// Written by: (Name: Ibrahim Elyyan)
// -----------------------------------------------------

package package4;

import package1.PublicTransportation;
/**
 * AirCraft is a subclass of PublicTransportation
 * @author ibrahim_elyyan
 *
 */
public class AirCraft extends PublicTransportation{
	private String result1, result2;
	/**
	 * Constructor that initializes variables from parent class using super keyword
	 */
	public AirCraft(){
		super();
	}
	/**
	 * Parameterized constructor that initialize all the attributes of the created object from AirCraft
	 * @param ticketPrice is the price of the ticket
	 * @param numStops is the number of stops
	 * @param result1 is the string value of the enum ClassType
	 * @param result2 is the string value of the enum MaintenanceType 
	 */
	public AirCraft(double ticketPrice, int numStops, String result1, String result2){
		super(ticketPrice, numStops);
		this.result1 = result1;
		this.result2 = result2;
	}
	/**
	 * Copy constructor creates a copy of the variables
	 * @param a is an object of AirCraft
	 */
	public AirCraft(AirCraft a) {
		this.result1 = a.result1;
		this.result2 = a.result2;
	}
	/**
	 * ClassType is an enum, it lists the types of aircrafts
	 * @author ibrahim_elyyan
	 *
	 */
	public enum ClassType {
		HELICOPTER("Helicopter"), AIRLINE("Airline"), GLIDER("Glider"), BALOON("Baloon");
		private String typeOfClass;
		/**
		 * This method gets type of class
		 * @return gives the type of class
		 */
		public String getTypeOfClass() {
			return this.typeOfClass;
		}
		private ClassType(String typeOfClass){
			this.typeOfClass = typeOfClass;
		}
	}

	/**
	 * MaintenanceType is an enum, it lists the different periods of time for maintenance
	 * @author ibrahim_elyyan
	 *
	 */
	public enum MaintenanceType {
		WEEKLY("Weekly"), MONTHLY("Monthly"), YEARLY("Yearly");
		private String typeOfMaintenance;
		/**
		 * This method gets the typeOfMaintenance
		 * @return gives value of typeOfMaintenance
		 */
		public String getTypeOfMaintenance() {
			return this.typeOfMaintenance;
		}
		private MaintenanceType(String typeOfMaintenance){
			this.typeOfMaintenance = typeOfMaintenance;
		}

	}
	/**
	 * toString method represents information about AirCraft object
	 */
	public String toString() {
		return "This AirCraft has class type of " + result1 + ", and the maintanence type is " + result2 + ".";
	}
	/**
	 * equals method is used to see if two objects are equal
	 * @param a1 is the object that is being compared with this object
	 * @return gives true or false depending on equality
	 */
	public boolean equals(AirCraft a1) {
		if(a1.getClass()==this.getClass() && a1.result1.equalsIgnoreCase(this.result1) && a1.result2.equalsIgnoreCase(this.result2)) {
			return true;
		}  else return false;
	}

}