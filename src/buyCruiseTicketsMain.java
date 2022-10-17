import java.util.Scanner;
import java.util.Arrays;

public class buyCruiseTicketsMain {

	public static void main(String[] args) {

		BuyCruiseTicket scenicCruise = new BuyCruiseTicket("Scenic_Cruise", 43.99, 12.99, 3);
		BuyCruiseTicket sunsetCruise = new BuyCruiseTicket("Sunset_Cruise", 52.99, 15.99, 1);
		BuyCruiseTicket discoveryCruise = new BuyCruiseTicket("Discovery_Cruise", 39.99, 9.99, 4);
		BuyCruiseTicket mysteryCruise = new BuyCruiseTicket("Mystery_Cruise", 45.99, 12.99, 2);

		BuyCruiseTicket[] buyCruiseTicket = { scenicCruise, sunsetCruise, discoveryCruise, mysteryCruise };
		 
		  
		boolean yesOrNoLoop = true;
		Scanner scn = new Scanner(System.in);
		String	cruiseYesOrNoInput = null;
		double finalcruisePriceForAdults=0;
		double finalcruisePriceForchildren=0;
		double adultDinnerBuffetMeals =20.99;
		double kidsDinnerBuffetMeals =4.99;
		do 
		{
			System.out.println("We offer 4 different packages as displayed below. Please enter the cruise that you want to select:\r\n"+ "Scenic_Cruise\r\n" + "Sunset_Cruise\r\n" + "Discovery_Cruise\r\n"+ "Mystery_Cruise\r\n");
			String cruiseNameUserInput = scn.next();
			if (cruiseNameUserInput.equals("Scenic_Cruise") || cruiseNameUserInput.equals("Sunset_Cruise")|| cruiseNameUserInput.equals("Discovery_Cruise") || cruiseNameUserInput.equals("Mystery_Cruise"))
		{
				for (int i = 0; i < buyCruiseTicket.length; i++) 
		{
					if (cruiseNameUserInput.equals(buyCruiseTicket[i].cruiseName)) 
		{
						System.out.println("The cruise that you have selected is " + buyCruiseTicket[i].cruiseName+ " which is a " + buyCruiseTicket[i].cruiseDaysOfStay + " day cruise\r\n"
								+ "Price for Adults(greater than 12): " + buyCruiseTicket[i].cruisePriceForAdults+ " per day\r\n" + "Price for kids above 5: "+ buyCruiseTicket[i].cruisePriceForchildren + " per day\r\n"
								+ "Please press Y if you want to continue with the selection or press any other alphabet to select another.");
					cruiseYesOrNoInput = scn.next();
					
					finalcruisePriceForAdults= buyCruiseTicket[i].cruisePriceForAdults;
					finalcruisePriceForchildren=buyCruiseTicket[i].cruisePriceForchildren;
									
		} }}} while (!cruiseYesOrNoInput.equals("Y"));

	
		System.out.println("Enter the number of adults: ");
		int userInputNumOfAdults = scn.nextInt();
				System.out.println("Enter the number of children: ");
		int userInputNumOfChildren = scn.nextInt();
		int childArrayCounter=0;
		int[] ChildArray = new int[userInputNumOfChildren];
			if(userInputNumOfChildren>0)
			{
			for(int j=0; (j < (userInputNumOfChildren));j++) 
			{ System.out.println("Enter the age of child " +(j+1));
			ChildArray [j] = scn.nextInt();	
			if(ChildArray [j]>5)
			{childArrayCounter++;}
				
				}}
			System.out.println(childArrayCounter);
			System.out.println("All our cruises have food service on board. Do you want to pre-book for dinner buffet meals at 20.99 per day for adults and 4.99 per day for kids?");
			String userInputPreBookBuffet = scn.next();
			
			if (userInputPreBookBuffet.equals("Y"))
			{
				double totalPrice = (finalcruisePriceForAdults*userInputNumOfAdults)+(childArrayCounter*finalcruisePriceForchildren)+(adultDinnerBuffetMeals*userInputNumOfAdults)+(childArrayCounter*kidsDinnerBuffetMeals);
		System.out.println("Your Package includes:");
				System.out.println("Scenic Cruise Adults 		@"+userInputNumOfAdults +"   :" +(finalcruisePriceForAdults*userInputNumOfAdults) );
				System.out.println("Scenic Cruise Children above 5 @ " +childArrayCounter +"    :" +(childArrayCounter*finalcruisePriceForchildren) );
				System.out.println("Buffet Special Price Adults	@"+userInputNumOfAdults +"   :" +(userInputNumOfAdults*adultDinnerBuffetMeals) );
				System.out.println("Buffet Special Price Children above 5 @ " +childArrayCounter +"    :" +(childArrayCounter*kidsDinnerBuffetMeals) );
				System.out.println("Total Price      :" +totalPrice);
				System.out.println("HST	@ 15%      :" +(0.15*totalPrice));
				System.out.println("Final Price     :" +((0.15*totalPrice)+totalPrice));
			}
			
					
	}


}