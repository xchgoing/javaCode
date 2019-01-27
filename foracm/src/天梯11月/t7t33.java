package ÌìÌİ11ÔÂ;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class t7t33
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNext())
		{
			String in=s.next();
			String[] index=new String[in.length()];
			HashSet<String> set=new HashSet<String>();
			for(int a=0;a<in.length();a++)
			{
				index[a]=in.substring(a, a+1);
				set.add(index[a]);
			}
			String[] arr=new String[set.size()];
			set.toArray(arr);
			Arrays.sort(arr,(q,w)->-q.compareTo(w));
			System.out.print("int[] arr = new int[]{"+arr[0]);
			for(int a=1;a<arr.length;a++)
			{
				System.out.print(","+arr[a]);
			}
			System.out.println("};");
			
			for(int a=0;a<index.length;a++)
			{
				for(int b=0;b<arr.length;b++)
				{
					if(arr[b].equals(index[a]))
					{
						index[a]=String.valueOf(b);
						break;
					}
				}
			}
			System.out.println("int[] index = new int[]"+Arrays.toString(index).replace(" ", "").replace("[", "{").replace("]", "}")+";");
		}
	}

}
