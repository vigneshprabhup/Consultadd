package Task7;

import java.util.Scanner;

public class Permutation {
	
	
	static void combination(String str, String ans)
	{
		if(str.length()==0)
		{
			System.out.println(ans + " ");
			return;
	    }
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			String ros= str.subSequence(0, i) + str.substring(i+1);
			combination(ros,ans+ch);
		}
			
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         String s ="abc";
         
         combination(s,"");
		

	}

}
