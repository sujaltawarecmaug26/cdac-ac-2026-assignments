//Q16)Write a program to print Right-angle Star pattern

class RightAngle {
	
	public static void main(String args[]){
	
		int N = 5;
		
		for(int i = 1; i <= N; i++){
			
			for(int j = 1; j<= i; j++){
				System.out.print(j);
				if(j < i){
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}