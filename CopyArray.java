package array1;
import java.util.Arrays;
public class CopyArray {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		int[] arr2 = arr;
		
		System.out.println("Original array :" +Arrays.toString(arr));
		System.out.println("Copied array  :" +Arrays.toString(arr2));
	}

}
