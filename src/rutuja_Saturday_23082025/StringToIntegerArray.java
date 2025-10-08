package rutuja_Saturday_23082025;

public class StringToIntegerArray {

	public static void main(String[] args) {
		String[] a= {"11","22","33","44","55","66"};
		int size=a.length;
		int[] num=new int[size];
		
		for(int i=0;i<size;i++)
		{
			num[i]=Integer.parseInt(a[i]);
			System.out.print(num[i]+" ");
		}
		

	}

}
