
public class Test {

	public static void main(String[] args) {
		int ageInYears = 35;
		int ageScore =0;
		
		if (ageInYears >= 18 && ageInYears <= 35) {
			ageScore = 12;
		} else {
			int ageOfCandidateArray[][] = { { 36, 11 }, { 37, 10 }, { 38, 9 }, { 39, 8 }, { 40, 07 }, { 41, 06 },
					{ 42, 05 }, { 43, 04 }, { 44, 03 }, { 45, 02 }, { 46, 01 }, { 47, 00 } };
			for (int i = 0; i < ((ageOfCandidateArray.length) - 1); i++) {
				if ((ageOfCandidateArray[i][0]) == (ageInYears)) {
					ageScore = ageOfCandidateArray[i][1];
					break;
				}
			}
		
		System.out.println(ageScore);			
		}

}

}
