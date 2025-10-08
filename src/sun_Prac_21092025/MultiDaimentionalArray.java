package sun_Prac_21092025;

public class MultiDaimentionalArray {

	public static void main(String[] args) {
		int[][] a= {{1,2,3,4},{5,6,7,8}};
		
		System.out.println("Number of rows: "+a.length);
		System.out.println("Number of Columns: "+a[0].length);
		
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
