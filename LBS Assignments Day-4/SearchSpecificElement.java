//Q13)Check if  an Array Contains a Specific Element
import java.util.Scanner;
import java.util.Arrays;

class SearchSpecificElement{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 5 integers : ");
		
		Integer[] arr = new Integer[5];
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}
		for(int num : arr){
		System.out.print(num+" ");
		}
		System.out.println();
		
		System.out.print("Enter the number to search : ");
		int target = sc.nextInt();
		
		if(Arrays.asList(arr).contains(target)){
			System.out.print("Found");
		}else{
			System.out.print("Not Found");
		}
		
	}

}