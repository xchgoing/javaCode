package acm2018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
public class poj1083
{
	
	public static void main(String[] args)
	{
			Scanner s=new Scanner(System.in);
			while(s.hasNextInt())
			{
				Set<Integer> x=new TreeSet();
				ArrayList<Integer> q=new ArrayList();
				Map<Integer,Integer> qwe=new HashMap();
				int n=s.nextInt();
				for(int a=0;a<n;a++)
				{
					qwe.put(s.nextInt(),s.nextInt());
				}
				Collections.sort(q);
				System.out.println(qwe.keySet());
				System.out.println(qwe.get(1));
			}
	}
}
