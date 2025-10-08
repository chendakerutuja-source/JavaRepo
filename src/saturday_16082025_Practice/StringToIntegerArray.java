package saturday_16082025_Practice;

public class StringToIntegerArray {
	
	//Write a java program to convert string to array

	public static void main(String[] args) {
		String[] s= {"1","2","3","4","5","6","7"};
		int size=s.length;
		int[] num=new int[size];
		
		for(int i=0;i<size;i++)
		{
			num[i]=Integer.parseInt(s[i]);
			System.out.print(num[i]+ " ");
			
		}

	}

}
