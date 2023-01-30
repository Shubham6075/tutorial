package array;
import java.util.Scanner;
public class sum {
public static void main(String[] args) {
	System.out.println("please enter 5 values :");
	Scanner scanner =new Scanner(System.in);
	
	int[] my_array=new int[5];
	for(int i=0;i<my_array.length;i++) {
		my_array[i]=scanner.nextInt();
		}
	int sum =0;
	for(int i : my_array) {
		sum =sum+i;
	}
	System.out.println(sum);
}
}
