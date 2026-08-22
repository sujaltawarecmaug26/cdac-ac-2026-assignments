//Q3) Calculate the Factorial of a Number;
import java.util.Scanner;

class Factorial{

	static void calculateFactorial(int num){
		int factorial = 1;
	
		for(int i = 1; i<= num; i++) {
			
			factorial *= i;
		}
		System.out.println("Factorial of " + num + " is " + factorial);
	}



	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter a number: ");
	int num = sc.nextInt();
	
	calculateFactorial(num);
	
	
	}
	

}