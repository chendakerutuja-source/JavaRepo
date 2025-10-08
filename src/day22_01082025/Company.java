package day22_01082025;

class Employee //This is Not the Parent Class
{
	private int empID=1002; //This is Hiding the data by Making Variable private, private access modifier can be only accessible within that class only
	
	public void setEmpId(int eid) //Creating method to modify the data
	{
		empID=eid;
	}
	
	public int getEmpID() //creating another method to view the data
	{
		return empID; // code from private to return is called one/single unit
	}
}

public class Company {

	public static void main(String[] args) {
		Employee e=new Employee(); //creating object for employee class
		System.out.println(e.getEmpID()); //whatever value we have in empID will be displayed 
		e.setEmpId(3020);// assignining the value to eid which will be assigned to empID
		System.out.println(e.getEmpID()); //reassigned value to empID will be printed in console that is 3020
	}

}

// even though we can't access private in package with the help of encapsulation we can do that...real time example is if i dont want to access my data to anyone will make as private but what changes happened or who did will get to know that this is possible with the help of encapsulation