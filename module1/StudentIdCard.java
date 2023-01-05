package module1;

import java.util.Scanner;

public class StudentIdCard {
	public static void main(String[] args) {
		String Name;
		int Age;
		String BloodGroup;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your Blood Group :");
		BloodGroup = scanner.nextLine();


		System.out.println("Enter your Name :");
		Name = scanner.nextLine();

		System.out.println("Enter your Age :");
		Age = scanner.nextInt();

		System.out.println("Name : " + Name);
		System.out.println("Age : " + Age);
		System.out.println("Blood Group : " + BloodGroup);


		if (Age >= 20) {
			System.out.println("Your group is RED");
		} else if (Age >= 15) {
			System.out.println("Your group is BLUE");
		} else if (Age >= 10) {
			System.out.println("Your group is Yellow");
		}

	}
}
