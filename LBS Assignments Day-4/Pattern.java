//Q15) Write a program to print pattern

class Pattern{
	
		public static void main(String args[]){
			
			int N = 9;
			
			for(int i = 1;i <= N; i++){
				
				for(int j = 1; j <=i; j++){
					System.out.print(i);
					
					if(j < i){
						System.out.print("*");
					}
				
				}

				
				System.out.println();
			}
		}
}

