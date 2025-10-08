package sunday_practice_10082025;

public class ConcatinateUsingArrayCopy {

	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		int[] b= {5,6,7,8};
		
		int[] result=new int[a.length+b.length];
		
		System.arraycopy(a, 0, result, 0, a.length);
		System.arraycopy(b, 0, result, a.length, b.length);
		
		System.out.println("Concatinted Array");
		
		for(int i:result)
		{
			System.out.print(i+" ");
		}

	}

}
