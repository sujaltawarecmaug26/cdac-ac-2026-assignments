// Q11) Count Positive and Negative Numbers in an Array
import java.util.Scanner;


class CountNumbers{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[6];
		int positiveCount =0;
		int negativeCount = 0;
		
		System.out.print("Enter 6 integers: ");
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		for(int nums: arr){
			if (nums < 0) {
				negativeCount++;
			}else{
				positiveCount++;
			}
		}
		
		System.out.println("Positive Numbers: " + positiveCount);
		System.out.println("Negative Numbers: " + negativeCount);
		
		
		
	}



}