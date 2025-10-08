package day20_30072025;

abstract class Vehicle  //parent class
{
	abstract void start(); //Abstract class can have methods without abstract method
}

class Car extends Vehicle //Child Class
{ 
	void start()
	{
	System.out.println("Car Starts with keys");
}
}

public class Scooty extends Vehicle{  // Child class
	
	void start()
	{
		System.out.println("Scooty Starts with keys+ Self/Kick");
	}

	public static void main(String[] args) {
		Vehicle v=new Car(); //Created object parent with Child
		v.start();
		
		Car c=new Car(); //creating object for Child Class
		c.start();
		
		Vehicle v1=new Scooty(); // Object name should be unique ex: v, v1,v2
		v1.start();
		
		Scooty s=new Scooty(); //Object created for child class
		s.start();
	}

}
