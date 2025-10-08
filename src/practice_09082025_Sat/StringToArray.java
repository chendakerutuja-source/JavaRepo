package practice_09082025_Sat;

public class StringToArray {

	public static void main(String[] args) {
		String[] str= {"11","22","33","44","55","66"};
		int size=str.length;
		int[] a=new int[size];
		
		for(int i=0;i<size;i++)
		{
			a[i]=Integer.parseInt(str[i]);
			System.out.print(a[i]+" ");
		}

	}

}
