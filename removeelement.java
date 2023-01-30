package array;

public class removeelement {
public static void main (String[] args) {
	int[]my_array= {25,14,556,99,55,63};
	
	int Removingindex = 1;
	for(int i=Removingindex;i<my_array.length-1;i++) {
		my_array[i]=my_array[i+1];
	}
	for(int i=0;i<my_array.length-1;i++) {
		System.out.println(my_array[i]);
	}
	System.out.println("array length :"+my_array.length);
}
}