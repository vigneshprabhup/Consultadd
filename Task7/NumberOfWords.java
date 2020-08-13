package Task7;
import java.util.*;

public class NumberOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the string :");
		String str= scan.nextLine();
		
		String[] s= str.split(" ");
         System.out.println("The number of words in the given string is :" + s.length);
	}

}
