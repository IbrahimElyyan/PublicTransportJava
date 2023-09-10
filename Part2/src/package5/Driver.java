// -----------------------------------------------------
// Course: COMP249
// Assignment (1)
// Part: (2)
// Written by: (Name: Ibrahim Elyyan)
// -----------------------------------------------------

package package5;

/*
 Using restricted access means that the subclasses will not have all the information 
 of the parent class. This in turn will make the description of the child class object 
 less descriptive and decrease the accuracy of equality between objects of the same class,
 because there are less variables to compare with.
 */

import package1.PublicTransportation;
import package2.CityBus;
import package2.Metro;
import package2.Tram;
import package3.Ferry;
import package4.AirCraft;
import package4.AirCraft.ClassType;
import package4.AirCraft.MaintenanceType;
/**
 * Driver class which executes the program utilizing all of the classes
 * @author ibrahim_elyyan
 *
 */
public class Driver {
	/**
	 * This method copies an array into a new array
	 * @param transportation is a PublicTransoportation array
	 * @return gives a copy of the transportation array
	 */
	static PublicTransportation[] copyCityBuss(PublicTransportation[] transportation) {
		CityBus c = new CityBus();
		PublicTransportation[] theCopy = new PublicTransportation[transportation.length];
		for (int i = 0; i < transportation.length; i++) {
			if(transportation[i].getClass()==c.getClass()) {
				theCopy[i]=transportation[i];
			}
		}
			return theCopy;
	}
	public static void main(String[] args) {
		// Creating a PublicTransportation array
		PublicTransportation[] transportation = new PublicTransportation[12];
		// Using a for loop to fill the array with various objects and using random values for numeric parameters
		for(int i=0; i<transportation.length;i++) {
			if(i<6) {
				PublicTransportation p = new PublicTransportation();
				transportation[i] = new PublicTransportation(p);
			}
			if(i==6) {
				CityBus c = new CityBus();
				transportation[i] = new CityBus(c);
			}
			if(i==7) {
				Metro m = new Metro();
				transportation[i] = new Metro(m);
			}
			if(i==8) {
				Tram t = new Tram();
				transportation[i] = new Tram(t);
			}
			if(i==9) {
				Ferry f = new Ferry();
				transportation[i] = new Ferry(f);
			}
			if(i==10) {
				Ferry q = new Ferry();
				transportation[i] = new Ferry(q);
			}
			if(i==11) {
				AirCraft a = new AirCraft();
				transportation[i] = new AirCraft(a);
			}
		}
		// Calling copyCityBuss method to copy transportation into a new array
		copyCityBuss(transportation);
		// Prompt to tell the user that this is the original array
		System.out.println("Original:");
		// Using for loop to display contents of array
		for(int i=0; i<transportation.length;i++) {
			System.out.println(transportation[i]);
		}
		System.out.println();
		// Prompt to tell the user that this is the copy array
		System.out.println("The copy:");
		// Using for loop to display contents of array
		for(int i=0; i<copyCityBuss(transportation).length;i++) {
			System.out.println(copyCityBuss(transportation)[i]);
		}
		System.out.println();
		// Closing message to let the user know the program has terminated
		System.out.println("Thank you for using the program!");
		/*
		 The copying will be correct because the original array has been iterated through all its indexes 
		 and the CityBus objects at each index they are in has been equated to the equivalent index of the copy array. 
		 The Rest of the entries in the copy array will be null. The copyCityBuss method did what it was supposed to do.
		 */
	}
}
