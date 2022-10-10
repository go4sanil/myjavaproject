
public class AddChocolates {

	public static void main(String[] args) {
		int chocolateMaxLimit = 63;
		int initialChocalateCount = 27;

		while (initialChocalateCount <= chocolateMaxLimit) {
		if ((initialChocalateCount + 5) >= 63)
		break;
		else {
		initialChocalateCount += 5;
		System.out.println("Current Chocolate count is :" + initialChocalateCount);
		}}
		System.out.println("Chocolate Capacity reached");
		}


	
}
