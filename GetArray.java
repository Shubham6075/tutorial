package array1;

import java.util.Scanner;

public class GetArray {
	public static void main(String[] args) {    
	    Scanner scanner = new Scanner(System.in); 
	    int[] arr = new int[5];

	    System.out.println("Enter "+ arr.length
	                     + " integer values:");

	    for(int i=0; i < arr.length; i++) {
	     
	      arr[i] = scanner.nextInt();
	    }
	   
	    System.out.println("Array elements are:");
	    for (int i=0; i < arr.length; i++) {
	      System.out.print(arr[i]+"\t");
	    }

	  }

}
