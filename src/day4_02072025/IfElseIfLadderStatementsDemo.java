package day4_02072025;

public class IfElseIfLadderStatementsDemo {

	public static void main(String[] args) {
		int marks=75;
		if(marks>=35 && marks<=45)
		{
			System.out.println("Lunch Outside");
		}
		else if(marks>=46 && marks<=59)
		{
			System.out.println("Family Picknic");
		}
		else if(marks>=60 && marks<=74)
		{
			System.out.println("iPhone");
		}
		else if(marks>=75 && marks<=100)
		{
			System.out.println("Paris Tour");
		}
		else 
		{
			System.out.println("Maar");
		}

	}

}
