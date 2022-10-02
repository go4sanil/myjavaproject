
public class Licence_Example {

	public static void main(String[] args) {

		int age = 19; // [input age of person]
		String licenseLevel = "G2";

		if (age >= 16 && licenseLevel == "G" ) {
			System.out.println("License is reissued");
		} else if (age >= 16 && licenseLevel == "G1") {
			System.out.println("G2 license is issued");
		} else if (age >= 16 && licenseLevel == "G2") {
			System.out.println("G license is issued");
		} else if (age >= 16 && licenseLevel == "No License") {
			System.out.println("New license is issued");
		} else {
			System.out.println("License in not issued");
		}

		/*
		 * int num1 = 30; int num2 = 30; if(num1%3==0 && num2%3==0)
		 * {System.out.println("Both the numbers are visible by 3");} else if (num1%3==0
		 * && num2%3!=0) {System.out.println(num1 +"is divisible by 3 but"+" "+ num2
		 * +"is not divisible by 3");} else if ((num1%3!=0 && num2%3==0))
		 * {System.out.println(num2 +"is divisible by 3 but"+" "+ num1
		 * +"is not divisible by 3");} else
		 * {System.out.println("Both the numbers are not visible by 3");}
		 */

		/*int len_rec = 10;
		int brdh_rec = 20;

		int var_rec = 2 * (len_rec + brdh_rec);
		System.out.println("The perimeter of the rectangle is  :" + var_rec);

		var_rec = len_rec * brdh_rec;
		System.out.println("The area of the rectangle is   :" + var_rec);*/

	}

}
