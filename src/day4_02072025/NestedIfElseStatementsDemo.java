package day4_02072025;

public class NestedIfElseStatementsDemo {

	public static void main(String[] args) {
		int marks=70;
		if(marks>=35 && marks<=100)
		{
			System.out.println("Lunch Outside");
			if(marks>=46)
			{
				System.out.println("Family Picknic");
				if(marks>=60)
				{
					System.out.println("iPhone");
					if(marks>=75 && marks<=100)
					{
						System.out.println("Paris Tour");
					}
				}
			}
		}
		else 
		{
			System.out.println("Maar");
		}
	}

}
