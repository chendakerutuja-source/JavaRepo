package day24_06082025;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDemo5 {
	static void readFile() throws FileNotFoundException
	{
		FileInputStream fis=new FileInputStream("D:\\a.xlsx");
	}

	public static void main(String[] args) throws FileNotFoundException {
		try
		{
			readFile();
		}
		catch(Exception e)
		{
			System.out.println("Hey It's me Catch");
		}
		
		
		System.out.println("Last Line Of Code");
		

	}
	}

// whenever there is exception error in try then only catch will execute. so here we handled exception so catch and last line is getting executed.
