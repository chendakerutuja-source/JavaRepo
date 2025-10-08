package day24_06082025;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDemo {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fis=new FileInputStream("D:\\Rutuja.xlsx");
		
		System.out.println("Last Line Of Execution");
	}

}


//It found the file in given folder so no exception