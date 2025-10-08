package saturday_16082025_Practice;

public class ConcateArrayUsingArrayCopy {

	public static void main(String[] args) {
		int[] a= {1,2,3};
		int[] b= {4,5,6,7,8,9};
		
		int[] result=new int[a.length+b.length];
		
		System.arraycopy(a, 0, result, 0, a.length);
		System.arraycopy(b, 0, result, a.length, b.length);
		
		System.out.println("Concated Array: ");
		
		for(int i:result)
		{
			System.out.print(i+" ");
		}

	}

}
