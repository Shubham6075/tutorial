package module1;

public class HelloInternshala {
	public static void main(String[] args) {
		System.out.println("Hello Internshala");
		System.out.println("Hello Internshala Again !");
		System.out.println("Hey, Naveen it's my birthday this weekend and you are" +
				" invited to party at my place. Bring gifts !");
		int a = 24;
		int b = 43;

		int x = a; // a value given to x so x = 24
		a = b;      // now value of a is empty and now value of b is assigned to a   so a = 43
		b = x;     // and now value of b become empty and now value of x given to b so b = 24
		System.out.println(a);
		System.out.println(b);        // so we swapped value and played prank
	}
}
