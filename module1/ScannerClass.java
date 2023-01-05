package module1;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		String name;
		int population;
		double GDP;
		float density;
		char currency;
		System.out.println("Enter your country");
		Scanner scanner = new Scanner(System.in);
		name = scanner.nextLine();
		System.out.println("Your country name is : " + name);

		System.out.println("Enter the population");
		population = scanner.nextInt();
		System.out.println(" The population of " + name + " is equal to " + population + " crore ");


	}
}
//  What is the difference between Scanner.next() and Scanner.nextLine() ?

// Let us assume user enters "Hello World" in the output console. So,
// if you use Scanner.next(), you will get just "Hello" as input. The next word " World" will be ignored.
//if you use Scanner.nextLine(), you will get the whole line of "Hello World".
//So, it is preferred to use Scanner.nextLine() when reading String inputs from the console.

