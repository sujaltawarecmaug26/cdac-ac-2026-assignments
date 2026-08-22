//Q31) Multiple String Literals with Same Content

class StringLiterals{


	public static void main(String args[]){
		
		String str1 = "hello";
		String str2 = "hello";
		String str3 = "hello";
		
		if(str1 == str2 && str2 == str3 && str1 == str3){
			System.out.print("All strings point to the same object: true");
		}else{
			System.out.print("All strings point to the same object: false");
		}
	}

}