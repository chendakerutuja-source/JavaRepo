package friday_Practice_29082025;

public class ConcateArrayUsingArrayCopy {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int[] b= {7,8,9,0,5};
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
