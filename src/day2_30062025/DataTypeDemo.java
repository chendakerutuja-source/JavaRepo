package day2_30062025;

public class DataTypeDemo {

	public static void main(String[] args) {
		byte b=12; //-128 to 127 and it occupies 1 byte memory
		System.out.println("Value of byte Data Type: "+b);
		
		short s=32767; //-32768 to 32767 and it occupy 2 bytes of memory
		System.out.println("Value of short Data Type: "+s);
		
		int i=10; //-2147483648 to 2147483647 it occupy 4 bytes of memory
		System.out.println("Value of int Data Type: "+i);
		
		long l=-922337206746744784L; //-9223372036854775808 to 922337203854775807 it occupy 8 bytes
		System.out.println("Value of Long Data Type: "+l);
		
		float f=123.567894567456F; //can store 6 to 7 decimal digit and occupy 4 bytes
		System.out.println("Value of Float Data Type: "+f);
		
		double d=123.5678998765467; // can store 15 to 16 decimal digit and occupy 8 bytes
		System.out.println("Value of Double Data Type: "+d);
		
		boolean b1=false; // true/false it occupy 1 bit
		System.out.println("Value of boolean Data Type: "+b1);
		
		char c='A'; //single character only and it occupy 2 bytes
		System.out.println("Value of Char Data Type: "+c);
		
		String st="Rutuja Ajit Chendake"; // No limit, You can store how much you want
		System.out.println("Value of String Data Type: "+st);
		

	}

}
