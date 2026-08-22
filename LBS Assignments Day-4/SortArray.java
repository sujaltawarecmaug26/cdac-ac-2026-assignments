//Q12)Sort an Array in Ascending Order
import java.util.Scanner;
import java.util.Arrays;

class SortArray{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		System.out.print("Enter 5 integers: ");
		
		for(int i =0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);

		System.out.print(Arrays.toString(arr));
		
	}
}