package ������;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class L1L027
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNext())
		{
			String in=s.next();
			HashSet<Integer> set=new HashSet<Integer>();
			for(int a=0;a<in.length();a++)
			{
				set.add(in.charAt(a)-'0');
			}
			Integer[] arr = set.toArray(new Integer[set.size()]);
			System.out.println(Arrays.toString(arr));
		}
	}

}
