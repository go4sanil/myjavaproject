import javax.swing.DefaultBoundedRangeModel;

public class Licence_Example {

	public static void main(String[] args) {

		int priceSmallPizza = 15;
		int priceMediumPizza = 20;
		int priceLargePizza = 25;
		int pepperoniSmallPizza = 2;
		int pepperoniMediumAndLargePizza = 3;
		int extraCheese = 1;

		String pizzaOrder = "mediumPizza";
		boolean pepperoniOrder = true;
		boolean cheeseOrder = true;

		switch (pizzaOrder) {
		case "smallPizza": {
			if (cheeseOrder && pepperoniOrder) {
				System.out.println("Your final bill is:" + (priceSmallPizza + pepperoniSmallPizza + extraCheese));
				break;
			}

			else if (cheeseOrder && !pepperoniOrder) {
				System.out.println("Your final bill is:" + (priceSmallPizza + extraCheese));
				break;
			}

			else if (!cheeseOrder && pepperoniOrder) {
				System.out.println("Your final bill is:" + (priceSmallPizza + pepperoniSmallPizza));
				break;
			}

			else {
				System.out.println("Your final bill is:" + (priceSmallPizza));
				break;
			}
		}

		case "mediumPizza": {

			if (cheeseOrder && pepperoniOrder) {
				System.out.println(
						"Your final bill is:" + (priceMediumPizza + pepperoniMediumAndLargePizza + extraCheese));
				break;
			}

			else if (cheeseOrder && !pepperoniOrder) {
				System.out.println("Your final bill is:" + (priceMediumPizza + extraCheese));
				break;
			}

			else if (!cheeseOrder && pepperoniOrder) {
				System.out.println("Your final bill is:" + (priceMediumPizza + pepperoniMediumAndLargePizza));
				break;
			}

			else {
				System.out.println("Your final bill is:" + (priceMediumPizza));
				break;
			}
		}

		case "largePizza": {
			if (cheeseOrder && pepperoniOrder) {
				System.out.println(
						"Your final bill is:" + (priceLargePizza + pepperoniMediumAndLargePizza + extraCheese));
				break;
			}

			else if (cheeseOrder && !pepperoniOrder) {
				System.out.println("Your final bill is:" + (priceLargePizza + extraCheese));
				break;
			}

			else if (!cheeseOrder && pepperoniOrder) {
				System.out.println("Your final bill is:" + (priceLargePizza + pepperoniMediumAndLargePizza));
				break;
			}

			else {
				System.out.println("Your final bill is:" + (priceMediumPizza));
				break;
			}

		}
		default:
			System.out.println("Please check the details of order and try again");
		}
	}
}
