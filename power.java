package array;

import java.util.Scanner;

public class power {
	public static void main(String[] args) {
		int number,i,exponent;
		long power =1;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number :");
		number=scanner.nextInt();
		System.out.println("enter the exponenet value :");
		exponent=scanner.nextInt();
		
		for(i=1;i<=exponent;i++) {
			power=power*number;
		}
	System.out.println(+power);
	}
}
