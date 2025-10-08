package day24_06082025;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDemo4 {
	
	static void readFile() throws FileNotFoundException
	{
		FileInputStream fis=new FileInputStream("D:\\a.xlsx");
	}

	public static void main(String[] args) throws FileNotFoundException {
		readFile();
		
		System.out.println("Last Line Of Code");
		

	}

}
// handling exception check in demo5 code
