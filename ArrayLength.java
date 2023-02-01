package array1;

public class ArrayLength {
	public static void main(String[] args) {
		int [] arr = {5,10,15,20,25};	
		System.out.println("The length of array is :" +arr.length);
		int sum =0;
		double avg =0d;
		for(int i=0;i<arr.length;i++) {
			sum = sum+arr[i];
		}
		System.out.println("Sum is "+sum);
		avg = sum/arr.length;
		System.out.println("Average is " +avg);
		
		
	}
    
}
