package array;

public class duplicate {
public static void main(String[] args) {
	int []my_array=new int[] {1,2,3,3,4,5,6,7,7,8,9};
	
	for(int i=0;i<my_array.length;i++) {
		
		for(int j=i+1;j<my_array.length;j++) {
			
			if(my_array[i]==my_array[j]) {
				
				System.out.println(my_array[j]);
			}
		}
	}
}
}
