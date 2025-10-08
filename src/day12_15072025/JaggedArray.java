package day12_15072025;

public class JaggedArray {

	public static void main(String[] args) {
		int[][] a=new int[2][]; //Jagged Array Creation
		a[0]=new int[3]; // in the first row we are giving 3 values
		a[1]=new int[2]; // the second row we are giving 2 values
		a[0][0]=10;
		a[0][1]=20;
		a[0][2]=30;
		a[1][0]=40;
		a[1][1]=50;
		
//		int[][] a= {{10,20,30},{40,50}}; // more easier than above
		
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

// we can declare array like this as well int[][] a={10,20,30,40,50,60} - 1D Array
// we can declare array like this as well int[][] a={{10,20,30},{40,50,60}} - 2D Array  
// we can declare array like this as well int[][] a={{10,20,30},{40,50,60},{70,80,90}} - 3D Array