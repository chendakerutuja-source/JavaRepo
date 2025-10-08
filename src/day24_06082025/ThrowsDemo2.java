package day24_06082025;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDemo2 {

		public static void main(String[] args) throws FileNotFoundException {
			FileInputStream fis=new FileInputStream("D:\\a.xlsx");
			
			System.out.println("Last Line Of Execution");
		}


	}

// we got exception here so it wont execute next line too so we can resolve this Exception by try catch block check in demo3
