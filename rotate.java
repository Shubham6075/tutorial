package array;

public class rotate {
public static void main(String[] args) {
	int[]my_array=new int[] {10,20,30,40,50};
	
	int temp=my_array[my_array.length-1];
	for(int i=my_array.length-1;i>0;i--) {
		my_array[i]=my_array[i-1];
	}
	my_array[0]=temp;
	for(int i=0;i<my_array.length;i++) {
		System.out.println(""+my_array[i]);
	}
}
}
