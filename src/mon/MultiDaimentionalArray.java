package mon;

public class MultiDaimentionalArray {

	public static void main(String[] args) {
		int[][]a= {{1,3,4,5},{4,5,6,7}};
		
		System.out.println("Number of Rows: "+a.length);
		System.out.println("Number of columns: "+a[0].length);
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
