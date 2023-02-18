package array1;

public class LargestAndSmallest {
	public static void main (String[] args) {
		int[]my_array= {25,14,15,56,144,99,55,1};
		int min=Integer.MAX_VALUE;
		for(int i=1;i<my_array.length;i++) {
			if(my_array[i]<min) {
				min=my_array[i];
			}
		}
		System.out.println("min no in array :"+min);
		
		int max=Integer.MIN_VALUE;
		for(int i=1;i<my_array.length;i++) {
			if(my_array[i]>max) {
				max=my_array[i];
			}
		}
		System.out.println("max no in array :" +max);
	}

}
