//Q21) Write a program to print pattern

class RightAngleNumberPattern3{


	public static void main(String args[]){
		int N = 5;
		
		for(int i = 1; i <= N; i++){
			for(int j = i; j < 2 * i; j++){
				System.out.print(j);

			}
			System.out.println();
		}
	}
}
