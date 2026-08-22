// Q10) Find the Average of Elements in an Array

import java.util.Scanner;

class AverageOfArray{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		System.out.print("Enter 5 integers: ");
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		
		for(int nums : arr){
			sum += nums;
		}
		float avg = sum / 5f;
		
		System.out.print("The average of the numbers is : " + avg);
		
		
	}

}