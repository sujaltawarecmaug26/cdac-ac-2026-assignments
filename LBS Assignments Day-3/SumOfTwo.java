//Q1) Sum Of Two Numbers(Using a Method);

import java.util.Scanner;


class SumOfTwo{


	static void sumOfTwoNumbers(int Num1, int Num2){
		
		int sum = Num1 + Num2;
	
		System.out.println("The Sum of " + Num1 +" and " + Num2 + " is " + sum);
	
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter First Number: ");
		int Num1= sc.nextInt();

		System.out.println("Enter Second Number: ");
		int Num2= sc.nextInt();
		
		sumOfTwoNumbers(Num1,Num2);

	}
}