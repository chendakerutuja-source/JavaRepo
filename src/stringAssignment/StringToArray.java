package stringAssignment;

public class StringToArray {

	public static void main(String[] args) {
		String[] s= {"11","22","33","44","55","66"};
		int size=s.length;
		int[] num=new int[size];
		
		for(int i=0;i<size;i++)
		{
			num[i]=Integer.parseInt(s[i]); // it takes the string representation of a number like("123") and converts it to an integer(123).
			System.out.print(num[i]+" ");
		}
	}

}
