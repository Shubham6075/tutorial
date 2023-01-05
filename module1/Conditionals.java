package module1;

import java.util.Scanner;

public class Conditionals {

	public static void main(String[] args) {
		int score;

		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();

		// If-else Ladder Statement

		if (score > 90) {
			System.out.println("Excellent");
		} else if (score > 80) {
			System.out.println("Very Good");
		} else if (score > 70) {
			System.out.println("Good");
		} else if (score > 60) {
			System.out.println("Chance of improvement");
		} else if (score > 50) {
			System.out.println("Near to failure");
		} else {
			System.out.println("Fail");
		}

		// if else statement   ---- comment      /* ------- */ --- box comment
		boolean isSecular = true;
		String message;
		if (isSecular) {
			message = " India is a Secular Country";
		} else {
			message = " India is not a Secular Country";
		}
		System.out.println(message);

		// Ternary Operator
		String msg = isSecular ? "India is Secular" : "India is not Secular";
	}


}
