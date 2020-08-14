package Task7;

import java.util.*;

public class SortHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,Integer> hm=new HashMap();
		
		hm.put(1, 20);
		hm.put(2, 30);
		hm.put(3, 10);
		hm.put(4, 100);
		hm.put(5, 60);
		hm.put(6, 0);
		
		System.out.println(hm.get(3));
		
		int temp=0;
		System.out.println(hm.values());
		
		for(int i=1;i<hm.size();i++)
			for(int j=1;j<hm.size();j++)
		{
			if(hm.get(j)>hm.get(j+1))
			{
				temp=hm.get(j);
				hm.put(j, hm.get(j+1));
				hm.put(j+1, temp);
			}
		}
		
		System.out.println(hm.values());

	}

}
