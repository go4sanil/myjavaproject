package letterGame;


import java.io.IOException;
import java.util.Scanner;

public class LetterGameMain {
	public static void main(String args[]) throws IOException {

		boolean isInputCorrect = false;
		String userInput;
		int wrongInputCounter = 0;
		int maxNumOfAttempts = 5;
		String wrongInputString = "";
		boolean hasPlayerWon;

		LetterGameMethods methodclass = new LetterGameMethods();
		Scanner scn = new Scanner(System.in);

		methodclass.importStudentList();
		String randomNameChoosen = methodclass.randomStudentSelection().toLowerCase();
		String[][] updatedStudentArrray = methodclass.setStudentNameArray(randomNameChoosen);

		do {
			System.out.print("You are guessing : ");
			methodclass.getStudentNameArray(updatedStudentArrray);

			System.out
					.println("\n" + "You have guessed (" + wrongInputCounter + ") wrong Letter/s  " + wrongInputString);

			do {
				userInput = methodclass.checkUserInputIsValid(updatedStudentArrray);
			} while (methodclass.checkDuplicateEntry(updatedStudentArrray, userInput)
					|| methodclass.checkDuplicateEntry(wrongInputString, userInput)

			);

			isInputCorrect = methodclass.updateStudentNameArray(userInput, updatedStudentArrray);

			if (isInputCorrect) {
				isInputCorrect = false;
			} else {
				wrongInputCounter = methodclass.wrongcounterCheck(wrongInputCounter);
				wrongInputString = methodclass.concatWrongInputStrings(userInput);
				if (wrongInputCounter >= maxNumOfAttempts) {
					System.out.println(
							"\n" + "You have guessed (" + wrongInputCounter + ") wrong Letter/s  " + wrongInputString);
					System.out.println("You Loose, Better Luck next time!");
				}
			}

			hasPlayerWon = methodclass.hasPlayerWon(updatedStudentArrray, randomNameChoosen);

		} while (wrongInputCounter < maxNumOfAttempts && !randomNameChoosen.equals(userInput) && !hasPlayerWon);

	}
}