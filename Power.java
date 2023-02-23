package array1;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		int i, number , exponent;
		int power = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		number = scanner.nextInt();
		System.out.println("Enter the exponent");
		exponent = scanner.nextInt();
		for(i=1;i<=exponent;i++) {
			power = power*number;
		}
		System.out.println(power);
	}

}
