//Q1)Print Numbers from 1 to N;
import java.util.Scanner;

class PrintNumbers{
	
	static void printNumbers(Scanner sc){
		int i = 1;
		int num = sc.nextInt();
		while(i<= num){
			System.out.print(i + " ");
			i++;
		}
	}

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter a number: ");
	
		printNumbers(sc);
	
	}
	



}