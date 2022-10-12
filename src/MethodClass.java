
public class MethodClass {

	int planPrice;
	int arrayResult = 0;
	int agePoints=0;

	int phonePrice(String concat) {

		String phoneArray[][] = { { "SamsungS22", "25" }, { "SamsungS22+", "35" }, { "SamsungS22 Ultra", "55" },
				{ "SamsungS22 FE", "20" }, { "AppleiPhone14", "30" }, { "AppleiPhone14pro", "40" },
				{ "AppleiPhone14proMax", "65" }, { "AppleiPhone14min", "25" } };

		for (int i = 0; i < phoneArray.length - 1; i++) {
			if ((phoneArray[i][0]).equals(concat)) {
				arrayResult = Integer.valueOf(phoneArray[i][1]);
				break;
			}
		}
		return arrayResult;
	}

	int phonePlanCalculation(String phonePlan) {
		if (phonePlan.equals("Rogers")) {
			planPrice = 70;

		}

		else if (phonePlan.equals("Bell")) {
			planPrice = 80;

		}

		else {
			planPrice = 75;

		}
		return planPrice;
	}

	
	
}
