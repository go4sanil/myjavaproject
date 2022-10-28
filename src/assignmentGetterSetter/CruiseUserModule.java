package assignmentGetterSetter;

import java.util.Scanner;

public class CruiseUserModule {
	private String userEmailAddress;
	private String userPassword;
	String userName;
	private String userPhoneNumber;
	int passwordCounter = 0;
	int userInfoCounter = 0;
	int userSelection;
	String returnParameter = null;

	Scanner scn = new Scanner(System.in);

	void setUserRegistrationInfo(String userEmailAddress, String userPassword, String userName,
			String userPhoneNumber) {
		this.userEmailAddress = userEmailAddress;
		this.userPassword = userPassword;
		this.userName = userName;
		this.userPhoneNumber = userPhoneNumber;

	}

	CruiseUserModule() {
	}

	public Boolean validateUserPassword(String userPassword) {
		if (this.userPassword.equals(userPassword)) {
			return true;
		}
		return false;
	}

	void setUserPhonenumber(String userInputChangeInfo) {
		this.userPhoneNumber = userInputChangeInfo;
	}

	void setUserEmailAddress(String userInputChangeInfo) {
		this.userEmailAddress = userInputChangeInfo;
	}

	void setUserPassword(String userInputChangeInfo) {
		this.userPassword = userInputChangeInfo;
	}

	String userInputSetUserInfo() {
		System.out
				.println("Please enter the new " + returnParameter + " that you want to be updated in our database: ");
		String userInputChangeInfo = scn.next();
		return userInputChangeInfo;

	}

	void thankYouMessage() {
		System.out.println("Your " + returnParameter + " has been updated in our records \n"
				+ "Thank you for using our services!");

	}

	void passwordNotCorrect() {
		passwordCounter++;
		if (passwordCounter >= 3) {
			System.out.println("You have reached the maximum number of attempts:Program Terminated\n"
					+ "Please talk to customer desk!");
			System.exit(0);
		}

		System.out.println("Your password you have entered is not correct, please try again \n" + "You are left with "
				+ (3 - passwordCounter) + " more attempts");

	}

	public String userInputSelection() {

		do {
			System.out.println("Please enter the information you want to change.\n" + "    1. Password\n"
					+ "    2. Phone number\n" + "    3. Email");

			userSelection = scn.nextInt();
			if (userSelection == 1) {
				returnParameter = "Password";

			} else if (userSelection == 2) {
				returnParameter = "Phone_number";

			} else if (userSelection == 3) {
				returnParameter = "Email";

			} else {
				userInfoCounter++;
				if (userInfoCounter >= 3) {
					System.out.println("You have reached the maximum attempts, program terminated\n"
							+ "Please talk to our customer desk");
					System.exit(0);
				}
				System.out.println("Your input is not correct, please try again \n" + "You are left with"
						+ (3 - userInfoCounter) + " more attempts");
				returnParameter = "invalid input";

			}
		}

		while (!(userSelection == 1) && !(userSelection == 2) && !(userSelection == 3) && userInfoCounter < 3);
		return returnParameter;
	}

}