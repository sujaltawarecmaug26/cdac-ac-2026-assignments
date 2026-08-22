//Q27)String Literal and Object Creation

class ObjectLiteral {

	public static void main(String[] args){
	
		String str1 = "hello";
		String Str2 = "hello";
		
		//boolean isTrue = true;
		
		if(str1 == Str2){
			System.out.print("Both Variables point to the same object: True" );
		}else{
			System.out.print("Both Variables point to the same object: False");
		}
	}
}