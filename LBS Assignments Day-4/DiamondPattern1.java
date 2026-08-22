//Q23) Write a program to print Diamond pattern

class DiamondPattern1 {

	public static void main(String args[]){
		
		int N = 6;
		
		for(int i = 1; i <= N; i++){
			for(int j =1; j <= N-i; j++){
				System.out.print(" ");
			}
			for(int j = 1; j<= 2*i-1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = N-1; i >= 1; i--){
			for(int j =1; j <= N-i; j++){
				System.out.print(" ");
			}
			for(int j = 1; j<= 2*i-1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		

		
	
		
	/*	for(int i = 1; i <= 5; i++){
			for(int j =1; j <= i; j++){
				System.out.print(" ");
			}
			for(int j = 1; j<= 2*N-i; j++){
				System.out.print("*");
			}
			
			System.out.println();
		} */
		
	}
}