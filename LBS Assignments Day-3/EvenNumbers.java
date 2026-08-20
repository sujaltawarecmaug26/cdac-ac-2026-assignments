//Q3) Print Even Numbers (Using while Loop);


class EvenNumbers{
		
	static void printEvenNumbers(int Num){
			
		while(Num <= 50){
				
			if(Num %2 == 0){	

				System.out.print(Num +" ");

			}
			
			Num++;
	
		}
		
	}

	public static void main(String[] args){
			
		int Num = 1;
		
		printEvenNumbers(Num);
					
	}		


}