//Q18)Write a program to print square pattern

class SquarePattern{


	public static void main(String args[]){
		int N = 5;
		
		for(int i = 1; i <= N; i++){
			for(int j = 1; j <= N; j++){
				System.out.print(i);
			}
			System.out.println();
		}
	}
}