package day4_02072025;

public class DrivingLicenseAssignment {

	public static void main(String[] args) {
		int age=60;
		if(age>=18 && age<=59)
		{
			System.out.println("Will be getting driving licence");
		}
		else if(age>=60 && age<=100)
		{
			System.out.println("No driving licence for this age group");
		}
		else
		{
			System.out.println("Invalid age for driving licence");
		}

	}

}
