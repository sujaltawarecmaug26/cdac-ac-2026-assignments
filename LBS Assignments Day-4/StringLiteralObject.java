//Q27)String Literal and Object Creation

class LiteralObject{

	public static void main(String args[]){
		String str1 = "hello";
		String str2 = "hello";
		
		if(str1 == str2 ){
			System.out.print("Both Variables point to the same object: true");
		}else{
			System.out.print("Both Variables point to the same object: false");
		}
	}

}