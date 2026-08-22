//Q17)Write a program to print  the pattern

class RightAnglePattern {

	public static void main(String args[]){
		int N = 5;
		
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j<= i; j++){
				System.out.print(j*2 -1);
				if(j < i){
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
