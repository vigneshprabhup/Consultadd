package Task7;
import java.util.*;


public class OccurrencesOfEachCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//occurrences of each character 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the string :");
		String str= scan.nextLine();
		
		char[] arr= str.toCharArray();
		
		Set<Character> hm = new HashSet();
		
		
		for(char i:arr)
		{
			System.out.println(i);
			hm.add(i);
		}
		

			
		
		for(char i:hm)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(i==arr[j])
					count++;
			}
			System.out.println("The character   " + i + "  is reperater " + count + "   times in the given string");
		}

	}

}
