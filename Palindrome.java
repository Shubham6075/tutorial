package array1;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println(palindromeString(new char[]{'r','a','c','e','c','a','r'}));
	}
	public static boolean palindromeString(char[] a) {
		for(int b=0;b<a.length/2;b++) {
			int temp = a.length-1-b;
			if(a[b]!=a[temp]) {
				return false;
			}
		}
		return true;
	}

}
