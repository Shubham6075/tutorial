package array;

public class MinandMax {
public static void main (String[] args) {
	int[]my_array= {25,14,15,56,144,99,55,1};
	int min=my_array[0];
	for(int i=1;i<my_array.length;i++) {
		if(my_array[i]<min) {
			min=my_array[i];
		}
	}
	System.out.println("min no in array :"+min);
	
	int max=my_array[0];
	for(int i=1;i<my_array.length;i++) {
		if(my_array[i]>max) {
			max=my_array[i];
		}
	}
	System.out.println("max no in array :" +max);
}
}
