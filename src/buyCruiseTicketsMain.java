import java.util.Scanner;
import java.util.Arrays;

public class BuyCruiseTicketsMain {

	public static void main(String[] args) {

		CruiseTicketsBooking scenicCruise = new CruiseTicketsBooking("Scenic_Cruise", 43.99, 12.99, 3);
		CruiseTicketsBooking sunsetCruise = new CruiseTicketsBooking("Sunset_Cruise", 52.99, 15.99, 1);
		CruiseTicketsBooking discoveryCruise = new CruiseTicketsBooking("Discovery_Cruise", 39.99, 9.99, 4);
		CruiseTicketsBooking mysteryCruise = new CruiseTicketsBooking("Mystery_Cruise", 45.99, 12.99, 2);

		CruiseTicketsBooking[] buyCruiseTicket = { scenicCruise, sunsetCruise, discoveryCruise, mysteryCruise };

		CruiseTicketsBooking methodsBuyCruiseTicket = new CruiseTicketsBooking();

		Scanner scn = new Scanner(System.in);
		String cruiseYesOrNoInput = null;
		double finalcruisePriceForAdults = 0;
		double finalcruisePriceForchildren = 0;
		int buffetMarker = 0;
		int noOfDaysOnCruise = 0;
		do {
			System.out.println(
					"We offer 4 different packages as displayed below. Please enter the cruise that you want to select:\r\n"
							+ "Scenic_Cruise\r\n" + "Sunset_Cruise\r\n" + "Discovery_Cruise\r\n"
							+ "Mystery_Cruise\r\n");
			String cruiseNameUserInput = scn.next();
			if (cruiseNameUserInput.equals("Scenic_Cruise") || cruiseNameUserInput.equals("Sunset_Cruise")
					|| cruiseNameUserInput.equals("Discovery_Cruise") || cruiseNameUserInput.equals("Mystery_Cruise")) {
				for (int i = 0; i < buyCruiseTicket.length; i++) {
					if (cruiseNameUserInput.equals(buyCruiseTicket[i].cruiseName)) {
						System.out.println("The cruise that you have selected is " + buyCruiseTicket[i].cruiseName
								+ " which is a " + buyCruiseTicket[i].cruiseDaysOfStay + " day cruise\r\n"
								+ "Price for Adults(greater than 12): " + buyCruiseTicket[i].cruisePriceForAdults
								+ " per day\r\n" + "Price for kids above 5: "
								+ buyCruiseTicket[i].cruisePriceForchildren + " per day\r\n"
								+ "Please press 'Y' if you want to continue with the selection or press any other key to select another.");
						cruiseYesOrNoInput = scn.next();

						finalcruisePriceForAdults = buyCruiseTicket[i].cruisePriceForAdults;
						finalcruisePriceForchildren = buyCruiseTicket[i].cruisePriceForchildren;
						noOfDaysOnCruise = buyCruiseTicket[i].cruiseDaysOfStay;

					}
				}
			}
		} while (!cruiseYesOrNoInput.equals("Y"));

		System.out.println("Enter the number of adults: ");
		int userInputNumOfAdults = scn.nextInt();
		double finalAdultPrice = methodsBuyCruiseTicket.adultPriceCalculation(finalcruisePriceForAdults,noOfDaysOnCruise, userInputNumOfAdults);
		System.out.println("Enter the number of children: ");
		int userInputNumOfChildren = scn.nextInt();

		int childArrayCounter = methodsBuyCruiseTicket.childArrayCounterInput(userInputNumOfChildren);

		double finalChildrenPrice = methodsBuyCruiseTicket.adultPriceCalculation(finalcruisePriceForchildren,noOfDaysOnCruise, childArrayCounter);

		System.out.println(
				"All our cruises have food service on board. Do you want to pre-book for dinner buffet meals at 20.99 per day for adults and 4.99 per day for kids? Please press 'Y' to order buffet meals or press any other key to proceed with out buffet order");
		String userInputPreBookBuffet = scn.next();

		if (userInputPreBookBuffet.equals("Y")) {
			buffetMarker = 1;
		} else {
			buffetMarker = 0;
		}

		double finalBuffetAdultPrice = methodsBuyCruiseTicket.adultBuffetPriceCalculation(noOfDaysOnCruise,userInputNumOfAdults, buffetMarker);

		double finalBuffetChildrenPrice = methodsBuyCruiseTicket.childrenBuffetPriceCalculation(noOfDaysOnCruise,childArrayCounter, buffetMarker);

		methodsBuyCruiseTicket.adultAndChildPriceCalculation(finalAdultPrice, finalChildrenPrice, finalBuffetAdultPrice,
				finalBuffetChildrenPrice, userInputNumOfAdults, childArrayCounter, buffetMarker);
	}

}
