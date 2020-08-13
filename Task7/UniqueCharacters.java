package Task7;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the string :");
		String str= scan.nextLine();
		
		
		str=str.replaceAll(" ", "");
		
		System.out.println(str);
		
		char[] arr= str.toCharArray();
		
		Set<Character> hm = new HashSet();
		
		for(char i:arr)
		{
			hm.add(i);
			System.out.println(i);
		}
	
		
		if(hm.size() == arr.length-1)
		{
			System.out.println("The given string has all unique characters ");
			
		}
		else
			System.out.println("The given string does not have unique characters ");
		
	
	}
	

}
