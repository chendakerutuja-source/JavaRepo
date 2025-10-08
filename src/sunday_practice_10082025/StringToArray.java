package sunday_practice_10082025;

public class StringToArray {

	public static void main(String[] args) {
		String[] s= {"11","22","33","44", "55","66"};
		int size=s.length;
		int[] num=new int[size];
		
		for(int i=0;i<size;i++)
		{
			num[i]=Integer.parseInt(s[i]);
			System.out.print(num[i]+ " ");
		}

	}

}
