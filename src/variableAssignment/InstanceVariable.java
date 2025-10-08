package variableAssignment;

public class InstanceVariable {
	
	int a=50; //Global Variable Declaration
	
	public void show()
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		InstanceVariable i=new InstanceVariable();
		i.show();
		

	}

}
