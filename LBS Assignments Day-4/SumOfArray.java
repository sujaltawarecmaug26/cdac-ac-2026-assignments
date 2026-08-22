//Q7) Find the Sum of  All  Elements in an Array

import java.util.Scanner;


class SumOfArray{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		int sum = 0;
		
		System.out.print("Enter  5 integers: ");
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		for(int nums : arr) {
			sum += nums;
		}
		System.out.print("The Sum of all numbers is: " + sum);
		
	}

}