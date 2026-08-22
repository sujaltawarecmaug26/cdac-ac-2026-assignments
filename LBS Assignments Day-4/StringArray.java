// Q8) Print All Names in a String Array;

import java.util.Scanner;


class StringArray{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 4 names: ");
		String[] names = new String[4];
		
		
		for(int i = 0; i < names.length; i++){
		
			names[i] = sc.next();
		
		}
		
		for(String name: names){
			System.out.println(name);
		}
		
		

	}


}