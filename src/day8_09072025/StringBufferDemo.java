package day8_09072025;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer(); //Index will start from 1
		s.append("Jyoti"); //Index will start from 0
		System.out.println(s.capacity()); //Initial capacity will be 16
		s.replace(1,3, "ANVI"); //It will replace the value from start index and before end index it will stop.so here from 1 to 2 it will replace
		System.out.println(s);
		s.insert(2,"Hey");  //Text is JANVIti on 2 index they are inserting Hey so output will be JAHeyNVIti
		System.out.println(s);
		System.out.println(s.reverse()); // Reversing JAHeyNVIti so output will be itIVNyeHAJ
		System.out.println(s.delete(0, 3)); //itIVNyeHAJ from this it will delete itI will be deleted, so output will be VNyeHAJ - basically it will delete the index from 0 to 2.

	}

}

// ALl the time its taking latest value of S hence its proved that StringBuffer and String Builder are Mutable means can be changed.