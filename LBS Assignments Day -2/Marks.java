public class Marks{
	public static void main(String[] args){
		
	int math = 80;
	int sci = 85;
	int his = 90;

	int avg = (math + sci + his) / 3;

	if(avg >= 90){

		System.out.println("Grade A");

		}
	else if(avg > 70 && avg < 89){

		System.out.println("Grade B");

		}
	else if(avg > 50 && avg < 69){

		System.out.println("Grade C");

		}else {

		System.out.println("Grade D");

		}
	}
}