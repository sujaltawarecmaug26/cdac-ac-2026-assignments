//Q26) Check if a String  is a Palindrome

import java.util.Scanner;

class CheckPalindrome{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String: ");
		
		String str = sc.nextLine();
		
		String reverse = new StringBuilder(str).reverse().toString();
		
		if(str.equals(reverse)){
			System.out.print("The String '"+str+"' is a Palindrome");
		}else{
			System.out.print("The String '"+str+"' is not a Palindrome");
		}
	}

}