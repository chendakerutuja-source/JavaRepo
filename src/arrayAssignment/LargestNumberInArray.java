package arrayAssignment;

public class LargestNumberInArray {

	public static void main(String[] args) {
		int[] n= {22, 44, 55, 78, 98};
		int c;
		
		for(int i=0;i<n.length;i++)
		{
			for(int j=i+1;j<n.length;j++)
			{
				if(n[i]>n[j])
				{
					c=n[i];
					n[i]=n[j];
					n[j]=c;
				}
			}
		}
		System.out.println("Sorted Array");
		for(int i=0;i<n.length;i++)
		{
			System.out.print(n[i]+" ");
		}
		System.out.println();
		System.out.println("Largest 2 elements: "+n[n.length-1]+" "+n[n.length-2]);

	}

}
