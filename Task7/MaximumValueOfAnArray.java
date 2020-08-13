package Task7;

import java.util.Scanner;

public class MaximumValueOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int[] arr= {90,30,20,50,60,80,100};
		int min=arr[0];
		int max=arr[1];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
				min=arr[i];
			if(arr[i]>max)
				max=arr[i];
				
		}
		System.out.println("The maximul value is :" + max);
		System.out.println("The minimum value is :" +min);
		
		
	}

}
