package Task7;
import java.util.*;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number to check if it is an Amstrong number or not. :");
		int value= scan.nextInt();
		ArrayList<Integer> l1= new ArrayList();
		int temp=value;
		int temp2;
		int checkvalue=0;
		
		while(temp>0)
		{
			temp2=temp%10;
			l1.add(temp2);
			System.out.println(temp2);
			temp=temp/10;
			System.out.println(temp);
		}
		System.out.println("*****************");
			for(int i:l1)
				System.out.println(i);
			
			for(int i:l1)
			{
				checkvalue = checkvalue + (i*i*i);
			}
			
			System.out.println(checkvalue);
			
			if(checkvalue==value)
				System.out.println("The given number is an amstrong number :");
	}

}
