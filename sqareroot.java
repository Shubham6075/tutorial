package array;

import java.util.Scanner;
public class sqareroot {
	public static void main(String[] args) {
		double number,squareRoot;
		System.out.println("the no to find the square root");
		Scanner scanner=new Scanner(System.in);
		number=scanner.nextDouble();
		squareRoot= Math.sqrt(number);
		System.out.println("square root of a no:"+number +" * "+squareRoot);
	}

}
