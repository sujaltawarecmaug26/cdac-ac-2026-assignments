public class Digit{

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;

		int max = 0;
		
		if(num1 > num2){
			max = num1;
			
		}else {
			max = num2;
				
			} 
		if(num3 > max){
			max = num3;
			
		}

		System.out.println("Maximum = " + max);
	}
}