
package day12_15072025;

public class Array2D_Demo {

	public static void main(String[] args) {
		int[][] a=new int[2][3];
		a[0][0]=10;
		a[0][1]=20;
		a[0][2]=30;
		a[1][0]=40;
		a[1][1]=50;
		a[1][2]=60;
		
		System.out.println("Number of Rows: " +a.length); //length will give the size of array
		System.out.println("Number of Columns: "+a[0].length);//here we can use a[1] as well here we are taking rows number but basically start from 0 only
		
		for(int i=0;i<2;i++) //here we can use a.length
		{
			for(int j=0;j<3;j++) //here we can use a[0].length as well
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
