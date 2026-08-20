//Q2) Simple Age Checker (Using a Method);

import java.util.Scanner;


class AgeChecker{

	static void ageCategory(int age){
		if(age < 18){

		System.out.print("You are a minor.");

		}else if(age >= 60){
		
		System.out.print("You are a senior citizen.");

		}else if(age >=18){

		System.out.print("You are an adult.");

		}else {

		System.out.print("Invalid");

		}
	
			
	}

	public static void main(String[] args){
		
	Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter your age: ");
		int age= sc.nextInt();

		ageCategory(age);

	}

}