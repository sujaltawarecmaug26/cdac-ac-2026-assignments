//Q2) Print Multiples of 3 between 1 and N;
import java.util.Scanner;

class MultiplesOf3{
	
	static void multiplesOf3(int num){
	
		for(int i = 1; i <= num; i++){
			if(i % 3 == 0){
				System.out.println(i);
			}
		}
	}

	public static void main(String args[]){	
	
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		
		multiplesOf3(num);
	}




}