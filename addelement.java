package array;

public class addelement {
public static void main(String[] args) {
	int[] my_array= {25,14,56,15,36};
	int Index_toinsert=2;
	for(int i=my_array.length-1;i>Index_toinsert;i--) {
		my_array[i]=my_array[i-1];
		
	}
	my_array[Index_toinsert]=99;
	for(int i=0;i<my_array.length;i++) {
		System.out.println(my_array[i]);
	}
	System.out.println("array length :" +my_array.length);
}
}
