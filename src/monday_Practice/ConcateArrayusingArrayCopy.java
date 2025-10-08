package monday_Practice;

public class ConcateArrayusingArrayCopy {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6};
		int[] b= {8,9,0,3,4,6};
		
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
