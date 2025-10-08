package rutu_29092025;

public class StringToIntegerArray {

	public static void main(String[] args) {
		String[] s= {"11","22","33","44"};
		int size=s.length;
		int[] num=new int[size];
		
		for(int i=0;i<size;i++)
		{
			num[i]=Integer.parseInt(s[i]);
			System.out.print(num[i]+" ");
		}

	}

}
