package module1;

public class Operators1 {
	public static void main(String[] args) {

		// Assignment Operators : { = , += , -= , *= , /= , %= } (Associativity : Right to Left)
		int income = 30000;
		int bonus = 5000;

		income += bonus; // income = income + bonus
		System.out.println(income);

		int number = 45;
		int x = 2;
		number *= x;
		System.out.println(number);

		// Logical Operators : { ! , && , || }
		// ! : logical not
		// && : in this to get true both value should be true otherwise false
		// || : in this to get false both value should be false otherwise true

	}
}
