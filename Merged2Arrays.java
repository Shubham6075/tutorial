package array1;
import java.util.*;
public class Merged2Arrays {
	  public static void main(String[] args) {
	      int s1[] = {10, 20, 30, 40, 50};
	      int s2[] = {9, 18, 27, 36, 45};
	      int newArray[] = new int[s1.length + s2.length];
	      for(int i=0; i<s1.length; i++) {
	         newArray[i] = s1[i];
	      }
	      for(int i=0, j=s1.length; j<(s1.length + s2.length); 
	                                                      j++, i++) {
	         newArray[j] = s2[i];
	      }
	      System.out.println("Array1 = " + Arrays.toString(s1));
	      System.out.println("Array2 = " + Arrays.toString(s2));
	      System.out.println("Merged Array = " 
	                             + Arrays.toString(newArray));
	   }
}


