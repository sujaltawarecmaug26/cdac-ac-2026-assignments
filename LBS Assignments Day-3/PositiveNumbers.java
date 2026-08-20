//Q4)User Input for Positive Numbers (Using do-while Loop);

import java.util.Scanner;

class PositiveNumbers{
	

	static void askForPositiveNumber(Scanner sc){
		int num;

		do{
		System.out.print("Enter a Positive Number: ");
		num= sc.nextInt();

		}while(num <= 0);

		System.out.print("You entered a positive number: "+ num);

	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		askForPositiveNumber(sc);
	}






}