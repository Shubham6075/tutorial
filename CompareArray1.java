package array1;

import java.util.*;

public class CompareArray1 {
	public static void main(String[] args) {
		int[]a = {10,20,30,40,50};
		int[]a1 = a;
		int[]a2 = {10,20,30,40,50};
		int[]a3 = {20,30,40,50,60};
		
		if(Arrays.equals(a,a1)) {
			System.out.println("Both are same");	
		}
		else {
			System.out.println("Bothe are different");
		}
		System.out.println("*********");
		if(Arrays.equals(a1, a2)) {
			System.out.println("Both are same");
		}
		else {
			System.out.println("Both are different");
		}
		System.out.println("*********");
		if(Arrays.equals(a, a2)) {
			System.out.println("Bothe are same");
		}
		else {
			System.out.println("Bothe are different");
		}
		System.out.println("********");
		if(Arrays.equals(a2, a3)) {
			System.out.println("Both are same");
		}
		else {
			System.out.println("Both are different");
		}
	}

}
