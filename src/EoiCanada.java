import java.util.Scanner;

public class EoiCanada {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter your education level");
		String educationLevel = scn.next();
		System.out.println("Enter your experience in years");
		int experienceInYears = scn.nextInt();
		System.out.println("Enter your age in years");
		int ageInYears = scn.nextInt();
		System.out.println("Enter your IELTS Score for Listening:");
		float ieltsListeningScore = scn.nextFloat();
		System.out.println("Enter your IELTS Score for Speaking:");
		float ieltsSpeakingScore = scn.nextFloat();
		System.out.println("Enter your IELTS Score for Reading:");
		float ieltsReadingScore = scn.nextFloat();
		System.out.println("Enter your IELTS Score for Writing:");
		float ieltsWritingScore = scn.nextFloat();
		System.out.println("If you have a relative  in Canada(Parents, Grand Parents, Brother, Sister, Aunt, Uncle, Nephew or Niece) who is a Canadian Citizen or PR holder (Y/N)");
		String hasRelatives = scn.next();
		System.out.println("Have you studied in Canada for atleast 2 years (Y/N)");
		String studiedInCanada = scn.next();
		System.out.println("Have you studied in Canada for atleast 2 years at NOC 0, A, B (Y/N)");
		String workNocLevel = scn.next();
		
		EoiCanadaMethods ecm = new EoiCanadaMethods();
		int finalIeltsScore = ecm.ieltsLisScore(ieltsListeningScore)+ecm.otherIeltsScore(ieltsSpeakingScore)+ecm.otherIeltsScore(ieltsReadingScore)+ecm.otherIeltsScore(ieltsWritingScore);
		int finalRelativeStudentScore = ecm.relativesStudent(hasRelatives,studiedInCanada,workNocLevel);
		int finalAgeScore = ecm.ageScoreCalulcation(ageInYears);
		int finalExperienceScore = ecm.experienceScore(experienceInYears);
		int finalWorkScore = ecm.educationScore(educationLevel);
		
		int totalPoints = finalIeltsScore+finalRelativeStudentScore+finalAgeScore+finalExperienceScore+finalWorkScore;
		
		System.out.println("Total Points you have scored: "+totalPoints+" Points");
		int cuttOffPoint = 80;
		if(totalPoints>= cuttOffPoint)
		{
		System.out.println("You qualify to submit an Expression of Interest (EOI) to Immigration Canada");
		}
		else
		{System.out.println("Sorry You donot qualify to submit an Expression of Interest (EOI) to Immigration Canada");}
		

	}

}
