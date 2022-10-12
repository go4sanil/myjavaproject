import java.util.Scanner;

public class PhonePlanSelection {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Please enter the Brand that you want to choose from:");
		String phoneBrand = scn.next();
		if (phoneBrand.equals("Samsung")) {
			System.out.println("Please enter the model that you want to buy from below\r\n" + "S22\r\n" + "S22+\r\n"
					+ "S22 Ultra\r\n" + "S22FE\r\n" + "");
		} else {
			System.out.println("Please enter the model that you want to buy from below\r\n" + "iPhone14\r\n"
					+ "iPhone14pro\r\n" + "iPhone14proMax\r\n" + "iPhone14min\r\n" + "");
		}

		String phoneModel = scn.next();

		System.out.println("Please select the plan that you want to opt for: Rogers/ Telus/ Bell");
		String phonePlan = scn.next();

		String concat = phoneBrand + phoneModel;

		MethodClass mwd = new MethodClass();
		int finalPrice = mwd.phonePrice(concat);
		int planPrice = mwd.phonePlanCalculation(phonePlan);

		System.out.println("You have selected" + " " + phoneModel + " with " + phonePlan + " Plan");
		System.out.println("Your Phone Tab will be : $" + finalPrice);
		System.out.println("Your monthly plan will be : $" + planPrice);
		System.out.println("Total Monthly Amount : $" + (finalPrice + planPrice));
	}
}