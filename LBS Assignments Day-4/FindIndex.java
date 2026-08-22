//Q14)Find the index of an Element in an Array

import java.util.Scanner;
import java.util.Arrays;

class FindIndex{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter 5 integers :");
			
		int[] arr = new int[5];
		
		for(int i =0; i < arr.length; i++){
			arr[i] = sc.nextInt();
			
		}
		
		Arrays.sort(arr);
		
		System.out.print("Enter the number to search: ");
		
		int num = sc.nextInt();
		
		
		
		int index = Arrays.binarySearch(arr, num);
		
		System.out.print("The number " + num +" is found at index "+index);
		
	
	}

}