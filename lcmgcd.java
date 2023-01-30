package array;
import java.util.Scanner;
public class lcmgcd {
	public static void main(String[] args) {
		int Numb1,Numb2,GCD=0,LCM=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the value of first integer :");
		Numb1=scanner.nextInt();
		System.out.println("enter the value of second integer :");
		Numb2=scanner.nextInt();
		int a=Numb1;
		int b=Numb2;
		while(Numb2!=0) {
			if(Numb1>Numb2) {
				Numb1=Numb1-Numb2;
			}
			else {
				Numb2=Numb2-Numb1;
			}
		}
		GCD=Numb1;
		System.out.println(+GCD);
		
		LCM=(a*b)/GCD;
		System.out.println(+LCM);
	}

}
