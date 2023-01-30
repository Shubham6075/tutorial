package array;

import java.util.Scanner;
public class avg {
	public static void main (String[] args) {
		int[] array=new int[10];
		System.out.println("please enter 10 values to find their avg");
		
		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<array.length;i++) {
			array[i]=scanner.nextInt();
			
		}
		int sum =0;
		double avg=0d;
		for(int e:array) {
			sum =sum+e;
		}
		avg=sum/array.length;
		System.out.println("the avg is :"+avg);
	}

}
