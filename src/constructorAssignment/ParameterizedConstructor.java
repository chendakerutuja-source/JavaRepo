package constructorAssignment;

public class ParameterizedConstructor {
	
	public ParameterizedConstructor(String a, double d) 
	{
		System.out.println("My Name Is: "+a+" And My Weight Is: " +d);
	}

	public static void main(String[] args) {
		ParameterizedConstructor p = new ParameterizedConstructor("Rutuja",48);
		

	}

}
