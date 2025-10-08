package mon;

public class StringToIntergerArray {

	public static void main(String[] args) {
		String[] str= {"11","22","33","44"};
		int size=str.length;
		int[] num=new int[size];
		
		for(int i=0;i<size;i++)
		{
			num[i]=Integer.parseInt(str[i]);
			System.out.print(num[i]+" ");
		}

	}

}
