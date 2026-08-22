//Q19) Write a program to print pattern

class RightAngleNumberPattern{


	public static void main(String args[]){
		int N = 5;
		
		for(int i = 1; i <= N; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(i);
			}
			System.out.println();
		}
	}
}