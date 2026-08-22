//Q15) Write a program to print pattern

class DiamondPattern{
	
		public static void main(String args[]){
			
			int num = 5;
			
			for(int i = 1;i <= num; i++){
				
				for(int j = 1; j <=i; j++){
					System.out.print(i);
					
					if(j < i){
						System.out.print("*");
					}
				
				}
				
				System.out.println();
			}
			
			for(int i = num;i >= 1; i--){
				
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

