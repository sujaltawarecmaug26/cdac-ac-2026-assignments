//Q30) String Pool with intern() Method

class StringPool{


	public static void main(String args[]){
		
		String str1 = new String("hello");
		String str2 = str1.intern();
		String str3 = "hello";
		
		if(str2 == str3){
			System.out.print("Is str3 pointing to the same object as str1 ? true");
		}else{
			System.out.print("Is str3 pointing to the same object as str1 ? false");
		}
	}

}