package array1;

public class ReturnArray {
	public static void main(String[] args) {
		int[]a = readArray();
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	public static int[] readArray() {
		int[] arr = {10,20,30,40,50};
		return arr;
	}

}
