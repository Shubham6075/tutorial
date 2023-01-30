package array;
import java.util.Scanner;
public class count {
public static void main(String[] args) {
	
	System.out.println("a string to check");
	
	Scanner scanner = new Scanner(System.in);
	
	String enteredText = scanner.nextLine();
	
    char[] chars = enteredText.toCharArray();
    
    for(int i=0;i<chars.length;i++) {
    	System.out.println(chars[i]);
    }
    int spaces = 0;
    int letters = 0;
    int numbers = 0;
    int others = 0;
	for(int i=0;i<enteredText.length();i++) {
		if(Character.isDigit(chars[i])) {
			numbers++;
		}else if(Character.isAlphabetic(chars[i])) {
			letters++;
		}else if(Character.isSpaceChar(chars[i])) {
			spaces++;
		}else {
			others++;
		}
	}
	System.out.println("spaces :"+spaces);
	System.out.println("numbers :"+numbers);
	System.out.println("letters :"+letters);
	System.out.println("others :"+others);
	
	}

}
