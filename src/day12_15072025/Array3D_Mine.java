package day12_15072025;

public class Array3D_Mine {

	public static void main(String[] args) {
        int[][] a= {{10,20,30},{40,50,60},{70,80}}; // easy way to declare
		
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
