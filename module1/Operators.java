package module1;

public class Operators {
	public static void main(String[] args) {
		// Arithmetic operators : {+,-,*,/,%}  (Associativity : Left to Right)
		// Operator precedence : {*,%,/} > {+,-}
		// Relational Operators : { >,>=,<,<=,==,!=}
		int a = 10;
		int b = 45;
		int c = a + b;
		int d = b - a;
		int e = b * a;
		int f = b / a;
		int g = b % a;
		System.out.println(c + " " + d + " " + e + " " + f + " " + g);
		boolean h = a < b;
		boolean i = a <= b;
		boolean j = b > a;
		boolean k = b >= a;
		boolean l = a == b;
		boolean m = a != b;
		System.out.println(h + " " + i + " " + j + " " + k + " " + l + " " + m);


	}
}
