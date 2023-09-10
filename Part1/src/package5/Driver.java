// -----------------------------------------------------
// Part: (1)
// -----------------------------------------------------

package package5;

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
	public static void main(String[] args) {
		// Declaring variables
		// indexMax and indexMin are the array index for the most expensive and the cheapest transportation
		int indexMax = 0, indexMin = 0;
		// Strings used for AirCraft constructor
		String x = ClassType.HELICOPTER.getTypeOfClass();
		String y = ClassType.AIRLINE.getTypeOfClass();
		String z = MaintenanceType.MONTHLY.getTypeOfMaintenance();
		String k = MaintenanceType.WEEKLY.getTypeOfMaintenance();
		// Prompt
		System.out.println("Creating various objects and comparing them:");
		System.out.println();
		// Creating objects
		PublicTransportation p = new PublicTransportation(34.56,37);
		PublicTransportation q = new PublicTransportation(34.56,37);
		PublicTransportation g = new PublicTransportation(34.53,37);
		System.out.println();
		// Displaying information using toString method
		System.out.println("#1 " + p);
		System.out.println("#2 " + q);
		System.out.println("#3 " + g);
		System.out.println();
		// Comparing objects using equals method
		System.out.println("#1 equals to #2: " + p.equals(q));
		System.out.println("#2 equals to #3: " +q.equals(g));
		System.out.println();
		// Creating objects and displaying their information
		AirCraft a = new AirCraft(32,(int)(Math.random()*100)+1,x,k);
		System.out.println(a);
		CityBus c = new CityBus(23,(int)(Math.random()*100)+1,15,(int)(Math.random()*120)+1900,"Marlon Line", "Allan");
		System.out.println(c);
		Metro m = new Metro(10,(int)(Math.random()*100)+1,9,(int)(Math.random()*120)+1900,"Stanford","Sue", 8, "New York");
		System.out.println(m);
		Tram t = new Tram(3,(int)(Math.random()*100)+1,4,(int)(Math.random()*120)+1900,"Butcher","Brandon",75);
		System.out.println(t);
		Ferry f = new Ferry(12,(int)(Math.random()*100)+1,(int)(Math.random()*120)+1900,"Titanic");
		System.out.println(f);
		// Comparing two objects using equals method
		System.out.println("The ferry is the same as the tram: " + f.equals(t));
		System.out.println();
		// Prompt, then creating a PublicTransportation array
		System.out.println("The prices for the 15 public transportations are as follows: ");
		PublicTransportation[] transportation = new PublicTransportation[15];
		// Using a for loop to fill the array with various objects and using random values for numeric parameters
		// Displaying the ticketPrice for each object to later see if we can find the cheapest and most expensive correctly
		for(int i=0; i<transportation.length;i++) {
			if(i<9) {
				transportation[i] = new PublicTransportation((double)(Math.random()*100)+1,(int)(Math.random()*100)+1);
				System.out.println(transportation[i].getTicketPrice());
			}
			if(i==9) {
				transportation[i] = new CityBus((double)(Math.random()*100)+1,(int)(Math.random()*100)+1,(long)(Math.random()*100)+1, (int)(Math.random()*120)+1900,"Washington Line", "Micheal");
				System.out.println(transportation[i].getTicketPrice());
			}
			if(i==10) {
				transportation[i] = new Metro((double)(Math.random()*100)+1,(int)(Math.random()*100)+1,(long)(Math.random()*100)+1, (int)(Math.random()*120)+1900,"McFarlane Line", "Jordan", (int)(Math.random()*100)+1, "Montreal");
				System.out.println(transportation[i].getTicketPrice());
			}
			if(i==11) {
				transportation[i] = new Tram((double)(Math.random()*100)+1,(int)(Math.random()*100)+1,(long)(Math.random()*100)+1, (int)(Math.random()*120)+1900,"Hollywood Line", "Alice", (int)(Math.random()*100)+1);
				System.out.println(transportation[i].getTicketPrice());
			}
			if(i==12) {
				transportation[i] = new Ferry((double)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*120)+1900,"Sterling");
				System.out.println(transportation[i].getTicketPrice());
			}
			if(i==13) {
				transportation[i] = new Ferry((double)(Math.random()*100)+1,(int)(Math.random()*100)+1,(int)(Math.random()*120)+1900,"Mayflower");
				System.out.println(transportation[i].getTicketPrice());
			}
			if(i==14) {
				transportation[i] = new AirCraft((double)(Math.random()*100)+1,(int)(Math.random()*100)+1,y,z);
				System.out.println(transportation[i].getTicketPrice());
			}
		}
		System.out.println();
		// Declaring variables that will represent the most expensive and the cheapest price
		double max = transportation[0].getTicketPrice();
		double min = max;
		// Using a for loop to find the maximum price and index of it
		for(int i=0; i<transportation.length;i++) {
			if(transportation[i].getTicketPrice()>max) {
				max = transportation[i].getTicketPrice();
				indexMax=i;
			}
		}
		// Prompt and showing info of the object with the most expensive ticketPrice
		System.out.println("The most expensive transportation has an index of " + indexMax + " and is:");
		System.out.println(transportation[indexMax]);
		System.out.println();
		// Using a for loop to find the minimum price and index of it
		for(int i=0; i<transportation.length;i++) {
			if(transportation[i].getTicketPrice()<min) {
				min = transportation[i].getTicketPrice();
				indexMin=i;
			}
		}
		// Prompt and showing info of the object with the cheapest ticketPrice
		System.out.println("The cheapest transportation has an index of " + indexMin + " and is:");
		System.out.println(transportation[indexMin]);
		System.out.println();
		// Closing message to let the user know the program has terminated
		System.out.println("Thank you for using the program!");
	}
}