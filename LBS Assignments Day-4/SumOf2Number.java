// Q5) Sum of Odd Numbers Between 1 and N;

import java.util.Scanner;

class SumOf2Number{
	
	static void calculateSum(int num){
		int sum =0;
		
		for(int i = 0; i <= num; i++){
			if(i % 2 != 0){
				sum+=i;
			}
		}
		System.out.print("The sum of odd numbers from 1 to "+num + " is " + sum);
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		calculateSum(num);
	}

}