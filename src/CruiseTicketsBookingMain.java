

import java.util.Scanner;

public class CruiseTicketsBookingMain {

	public static void main(String[] args) {

		CruiseTicketsBooking scenicCruise = new CruiseTicketsBooking("Scenic_Cruise", 43.99, 12.99, 3);
		CruiseTicketsBooking sunsetCruise = new CruiseTicketsBooking("Sunset_Cruise", 52.99, 15.99, 1);
		CruiseTicketsBooking discoveryCruise = new CruiseTicketsBooking("Discovery_Cruise", 39.99, 9.99, 4);
		CruiseTicketsBooking mysteryCruise = new CruiseTicketsBooking("Mystery_Cruise", 45.99, 12.99, 2);

		CruiseTicketsBooking[] cruiseticketsbookingarray = { scenicCruise, sunsetCruise, discoveryCruise, mysteryCruise };

		CruiseTicketsBooking cruiseticketsbooking = new CruiseTicketsBooking();
		CruiseUserModule cruiseusermodule = new CruiseUserModule();

		Scanner scn = new Scanner(System.in);
		System.out.println(
				"Welcome to Cruise Booking.\n" + "Please sign up to book a cruise.\n" + "Enter your email address:");
		String emailForUserRegistration = scn.next();
		System.out.println("Enter the password that you want to use:");
		String passwordForUserRegistration = scn.next();
		System.out.println("Enter your Full Name:");
		String nameForUserRegistration = scn.next();
		System.out.println("Enter your phone number:");
		String phoneNumberForUserRegistration = scn.next();
		System.out.println("Thank you for registering!");
		cruiseusermodule.setUserRegistrationInfo(emailForUserRegistration, passwordForUserRegistration,
				nameForUserRegistration, phoneNumberForUserRegistration);

		Object cruiseYesOrNoInput = "";
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
			if (cruiseNameUserInput.equalsIgnoreCase("Scenic_Cruise")
					|| cruiseNameUserInput.equalsIgnoreCase("Sunset_Cruise")
					|| cruiseNameUserInput.equalsIgnoreCase("Discovery_Cruise")
					|| cruiseNameUserInput.equalsIgnoreCase("Mystery_Cruise")) {
				for (int i = 0; i < cruiseticketsbookingarray.length; i++) {
					if (cruiseNameUserInput.equalsIgnoreCase(cruiseticketsbookingarray[i].cruiseName)) {
						System.out.println("The cruise that you have selected is " + cruiseticketsbookingarray[i].cruiseName
								+ " which is a " + cruiseticketsbookingarray[i].cruiseDaysOfStay + " day cruise\r\n"
								+ "Price for Adults(greater than 12): " + cruiseticketsbookingarray[i].cruisePriceForAdults
								+ " per day\r\n" + "Price for kids above 5: "
								+ cruiseticketsbookingarray[i].cruisePriceForchildren + " per day\r\n"
								+ "Please press 'Y' if you want to continue with the selection or press any other key to select another.");
						cruiseYesOrNoInput = scn.next();

						finalcruisePriceForAdults = cruiseticketsbookingarray[i].cruisePriceForAdults;
						finalcruisePriceForchildren = cruiseticketsbookingarray[i].cruisePriceForchildren;
						noOfDaysOnCruise = cruiseticketsbookingarray[i].cruiseDaysOfStay;

					}
				}
			}
		} while (!cruiseYesOrNoInput.equals("Y"));

		System.out.println("Enter the number of adults: ");
		int userInputNumOfAdults = scn.nextInt();
		double finalAdultPrice = cruiseticketsbooking.adultPriceCalculation(finalcruisePriceForAdults, noOfDaysOnCruise,
				userInputNumOfAdults);
		System.out.println("Enter the number of children: ");
		int userInputNumOfChildren = scn.nextInt();

		int childArrayCounter = cruiseticketsbooking.childArrayCounterInput(userInputNumOfChildren);

		double finalChildrenPrice = cruiseticketsbooking.adultPriceCalculation(finalcruisePriceForchildren, noOfDaysOnCruise,
				childArrayCounter);

		System.out.println(
				"All our cruises have food service on board. Do you want to pre-book for dinner buffet meals at 20.99 per day for adults and 4.99 per day for kids? Please press 'Y' to order buffet meals or press any other key to proceed with out buffet order");
		String userInputPreBookBuffet = scn.next();

		if (userInputPreBookBuffet.equalsIgnoreCase("Y")) {
			buffetMarker = 1;
		} else {
			buffetMarker = 0;
		}

		double finalBuffetAdultPrice = cruiseticketsbooking.adultBuffetPriceCalculation(noOfDaysOnCruise,
				userInputNumOfAdults, buffetMarker);

		double finalBuffetChildrenPrice = cruiseticketsbooking.childrenBuffetPriceCalculation(noOfDaysOnCruise,
				childArrayCounter, buffetMarker);

		cruiseticketsbooking.adultAndChildPriceCalculation(finalAdultPrice, finalChildrenPrice, finalBuffetAdultPrice,
				finalBuffetChildrenPrice, userInputNumOfAdults, childArrayCounter, buffetMarker);

		System.out.println("\n" + "Do you want to change your personal information. Press Y to change.\n"
				+ "Press any other key to exit.");
		String userInputChangeUserInfo = scn.next();

		if (userInputChangeUserInfo.equalsIgnoreCase("Y")) {
			String userInput = "";
			do {
				System.out.println("Please enter your current password: ");
				String userPassword = scn.next();

				if (cruiseusermodule.validateUserPassword(userPassword)) {
					userInput = cruiseusermodule.userInputSelection();
					String userInfoUpdate = cruiseusermodule.userInputChange();
					switch (userInput) {
					case "Password":
						cruiseusermodule.setUserPassword(userInfoUpdate);
						break;
					case "Phone_number":
						cruiseusermodule.setUserPhonenumber(userInfoUpdate);
						break;
					case "Email":
						cruiseusermodule.setUserEmailAddress(userInfoUpdate);
						break;
					default:
						System.out.println("You have enetered invalid input");
						break;
					}
					cruiseusermodule.thankYouMessage();
				} else {

					cruiseusermodule.passwordNotCorrect();

				}
			} while (!(userInput.equals("Password") || userInput.equals("Email") || userInput.equals("Phone_number")));

		}

		else {
			System.out.println("Thank you for using our service");
		}

	}

}
