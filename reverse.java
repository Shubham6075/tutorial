package array;

public class reverse {
public static void main (String[] args) {
	int[] my_array= {1,2,3,4,5,6,7,8,9};
	for(int i=0;i<my_array.length/2;i++) {
		
		my_array[i]=my_array[my_array.length-i-1];
		;
	}
	
	for (int i = 0;i<my_array.length;i++) {
	System.out.println(""+my_array[i]);
	}
}}