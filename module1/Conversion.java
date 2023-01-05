package module1;

public class Conversion {
	public static void main(String[] args) {

		// Implicit conversion : value will remain same
		int radius = 400;
		double newRadius = radius;
		System.out.println(newRadius);

		// Explicit conversion : value will get smaller(we loose some value from that we assign)
		double diameter = 3.78;
		int newDiameter = (int) diameter; // Casting
		System.out.println(newDiameter);

	}
}
