// Q4)Print Even Numbers from 1 to N;
import java.util.Scanner;

class EvenNumbers{

	static void calculateEvenNumber(int num){

		for(int i = 1; i <= num; i++){
			if(i % 2 == 0){
				System.out.println(i);
			}
		}
		
	}


	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		calculateEvenNumber(num);
	
	}

}