// Q9) Find Largest Element in an Array
import java.util.Scanner;

class LargestElement{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		System.out.print("Enter 5 Integers: ");
		
		for(int i =0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		System.out.print("The largest element is: "+ max);
		
	}


}