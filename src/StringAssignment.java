
public class StringAssignment {

	public static void main(String[] args) {
		String myName = "Sachin Tendulkar";

		System.out.println("My name is :"+myName);
		System.out.println("My name with second name masked :"+myName.substring(0,7)+ myName.substring(7, 16).replaceAll("\\w","*"));
		System.out.println("My first name is :"+myName.substring(0,6));
		System.out.println("The length of my name excluding spaces are:"+myName.replace(" ", "").length());
		System.out.println("Replaced e with s :"+myName.replace("e","s"));

	}

}
