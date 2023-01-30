package array;

import java.util.Scanner;
public class evenodd {
public static void main(String[] args) {
	System.out.println("enter the no to check if it is odd or even");
	Scanner scanner=new Scanner(System.in);
	int x =scanner.nextInt();
	if(x%2==0) {
		System.out.println("the no is even");
	}else {
		System.out.println("the no is odd");
	}
}
}
