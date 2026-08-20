//Q5)Print Multiplication Table (Using for Loop);



class Multiplication{
		
	static void printMultiplicationTable(int Num){
	
		
	
		for(int i = 1; i <= 10; i++){

			int mul = Num * i;
		
			System.out.println(Num + " X " + i + " = " + mul );
		}
	}

	public static void main(String args[]){
	
		int Num = 5;
		
		printMultiplicationTable(Num);

	}




}