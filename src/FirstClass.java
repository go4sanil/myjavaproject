
public class FirstClass {

	public static void main(String[] args) {

		int maxNumOfPeg = 3;
		for (int counter = 1; counter <= 5; counter++) {
			System.out.println("The number of Pegs you had: " + counter + "||You are left with: "
					+ (maxNumOfPeg - counter) + " more pegs");
			if (counter == maxNumOfPeg) {
				System.out.println("No more PEGS for you");
				//break;
			}
		}
	}

}
