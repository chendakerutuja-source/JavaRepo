package day24_06082025;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDemo3 {

	public static void main(String[] args) throws FileNotFoundException {
		try
		{
		FileInputStream fis=new FileInputStream("D:\\a.xlsx");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		// by using try catch blocking we can handle this exception 
		System.out.println("Last Line Of Execution");
	}
		

	}


