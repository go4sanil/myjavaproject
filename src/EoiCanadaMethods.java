
public class EoiCanadaMethods {
	int totalScore = 0;

	int ieltsLisScore(float ieltsListeningScore) {
		if (ieltsListeningScore >= 8) {
			totalScore = 6;
		} else if (ieltsListeningScore < 8 && ieltsListeningScore >= 7.5) {
			totalScore = 5;
		} else {
			totalScore = 0;
		}

		return totalScore;
	}

	int otherIeltsScore(float otherScore) {
		if (otherScore >= 7) {
			totalScore = 6;
		} else if (otherScore < 7.5 && otherScore >= 5) {
			totalScore = 5;
		} else {
			totalScore = 0;
		}
		return totalScore;
	}

	int relativesStudent(String hasRelatives, String studiedInCanada, String workNocLevel) {
		totalScore = 0;
		if (hasRelatives.equals("Y")) {
			totalScore += 5;
		}
		if (studiedInCanada.equals("Y")) {
			totalScore += 5;
		}
		if (workNocLevel.equals("Y")) {
			totalScore += 10;
		}
		return totalScore;
	}

	int ageScoreCalulcation(int ageInYears)

	{
		if (ageInYears >= 18 && ageInYears <= 35) {
			totalScore = 12;
		} else {
			int ageOfCandidateArray[][] = { { 36, 11 }, { 37, 10 }, { 38, 9 }, { 39, 8 }, { 40, 07 }, { 41, 06 },
					{ 42, 05 }, { 43, 04 }, { 44, 03 }, { 45, 02 }, { 46, 01 }, { 47, 00 } };
			for (int i = 0; i < ((ageOfCandidateArray.length) - 1); i++) {
				if ((ageOfCandidateArray[i][0]) == (ageInYears)) {
					totalScore = ageOfCandidateArray[i][1];
					break;
				}
			}
		}

		return totalScore;

	}

	int experienceScore(int experienceInYears) {
		if (experienceInYears >= 6) {
			totalScore = 15;
		} else if (totalScore == 4 || totalScore == 5) {
			totalScore = 13;
		} else {
			totalScore = 0;
		}
		return totalScore;
	}

	int educationScore(String educationLevel) {
		if (educationLevel.equals("PhD")) {
			totalScore = 25;
		} else if (educationLevel.equals("Masters")) {
			totalScore = 23;
		} else if (educationLevel.equals("University degree")) {
			totalScore = 22;
		} else {
			totalScore = 21;
		}
		return totalScore;
	}
}
