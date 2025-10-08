package friday_Practice_29082025;

public class MultiDaimentionalArray {

	public static void main(String[] args) {
		int[][] a= {{1,2,3},{2,3,4}};
		
		System.out.println("Number of rows:"+a.length);
		System.out.println("Number of columns:"+a[0].length);
		
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
