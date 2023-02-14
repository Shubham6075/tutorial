package array1;

public class InsertElement {
	public static void main(String[] args) {
		int[] b= {25,14,56,15,36};
		int Index_toinsert=2;
		for(int i=b.length-1;i>Index_toinsert;i--) {
			b[i]=b[i-1];

		}
		b[Index_toinsert]=99;
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		System.out.println("array length :" +b.length);
	}

}
