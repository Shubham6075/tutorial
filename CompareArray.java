package array1;

public class CompareArray {
	public static void main(String[] args) {
		int[]a1 = {10,20,30,40,50};
		int[]a2 = a1;
		int[]a3 = {10,20,30,40,50};
		 
		if(a1==a2) {
			System.out.println("Both are same");
		}
		else {
			System.out.println("Both are different");
		}
		System.out.println("*********");
		if(a1==a3) {
			System.out.println("Bothe are same");
		}
		else {
			System.out.println("Both are different");
		}
	}
// == operator limitation is that it only compare reference and not compare the value
	// to compare values we have to use Array.equals() function
}
