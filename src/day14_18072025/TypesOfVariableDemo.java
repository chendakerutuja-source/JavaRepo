package day14_18072025;

public class TypesOfVariableDemo {
	
	public int glob=15; //Global Variable Declaration
	static int st=10;  // Static Variable Declaration
	
	public void add()
	{
		int a=10;
		int b=20;
		glob=30; 	
		st=20;
		System.out.println(a+b+glob); //here for glob it will be taking latest value that is 30		
	}
	
	public void sub()
	{
		int a=10;
		int b=20;
		glob=45;
		st=200;
		System.out.println(a-b+glob); //here for glob it will be taking latest value that is 45
	}

	public static void multi()
	{
		TypesOfVariableDemo td=new TypesOfVariableDemo(); //Constructor
		System.out.println(td.glob); //here it will take initial value that is 15 because its static method and to call that we created object.
		td.glob=100;
		System.out.println(td.glob);//it will take latest value of glob that is 100.
		System.out.println("Static var Value: "+st); //It will take 200 because it will take latest value of st that is 200.
		st=400; //static variable we can inside method constructor and in blockes within class including inside static method, constructor or blocks.no need to creat object like how we will creat for global variables to call inside static method
	}
	public static void main(String[] args) throws InterruptedException {
		TypesOfVariableDemo td=new TypesOfVariableDemo(); //Constructor 
		td.add();
		Thread.sleep(5000); //Used to pause the execution as u know already in ur project ur using this..5000 means 5 sec.
		td.sub();
		td.multi();
		System.out.println(td.glob); //it will take latest value that is 45 from Non Static method.
		System.out.println(TypesOfVariableDemo.st); //Another way to call static variable , it will take latest value that is 400.
	}

}
