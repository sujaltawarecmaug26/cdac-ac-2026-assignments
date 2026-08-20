//Q5)Calculate the sum of Numbers from 1 to N (Using for Loop);

import java.util.Scanner;

class SumOfN{
	

	static void calculateSum(Scanner sc){


		System.out.print("Enter a Number: ");

		int N = sc.nextInt();

		int sum = 0;


		for(int i = 1; i <= N; i++){
			sum += i;
		}	

		System.out.print("the sum of numbers from 1 to "+N + " is "+sum);
	
	}

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		calculateSum(sc);
		
	}




}