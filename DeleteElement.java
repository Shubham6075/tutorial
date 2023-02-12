package array1;

public class DeleteElement {

	public static void main (String[] args) {
		int[]v= {25,14,556,99,55,63};

		int Removingindex = 1;
		for(int i=Removingindex;i<v.length-1;i++) {
			v[i]=v[i+1];
		}
		for(int i=0;i<v.length-1;i++) {
			System.out.println(v[i]);
		}
		System.out.println("array length :"+v.length);
	}
}
