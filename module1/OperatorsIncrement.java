package module1;

public class OperatorsIncrement {
	public static void main(String[] args) {

		// Increment operators {++}

		// Postfix : First use the value and then increment { x++}
		// int year = 10;
		// int newYear = year++;
		// newYear = year;         year = year+1;
		// newYear is 10         year is 11

		// Prefix : First increment and then use the value { ++x}
		// int year = 10;
		// int newYear = ++year;
		// year = year+1;             newYear = year;
		// year is 11               newYear is 11


		// Decrement operators {--}

		// Postfix : First use the value and then decrement { x--}
		// int year = 10;
		// int newYear = year--;
		// newYear = year;         year = year-1;
		// newYear is 10         year is 9

		// Prefix : First decrement and then use the value { --x}
		// int year = 10;
		// int newYear = --year;
		// year = year-1;             newYear = year;
		// year is 9              newYear is 9

		int age = 10;
		int newAge = age++;             // postfix Increment
		System.out.println(newAge);
		System.out.println(age);

		System.out.println("**********");

		int year = 10;
		int newYear = ++year;
		System.out.println(newYear);   // prefix Increment
		System.out.println(year);

		System.out.println("********");

		int x = 34;
		int newX = x--;
		System.out.println(newX);         // postfix Decrement
		System.out.println(x);

		System.out.println("*******");

		int y = 34;
		int newY = --y;
		System.out.println(newY);         // prefix Decrement
		System.out.println(y);
	}
}
