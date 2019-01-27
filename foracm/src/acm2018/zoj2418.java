package acm2018;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;



public class zoj2418
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		Map<String,Double> map=new TreeMap();
		int count=0;
		while(s.hasNextLine())
		{
			count++;
			String q=s.nextLine();
			if(map.containsKey(q))
			{
				double temp=(Double) map.get(q);
				map.put(q,temp+1);
			}else
			{
				map.put(q,(double) 1);
			}
		}
		Iterator<String> iter=map.keySet().iterator();
		while(iter.hasNext())
		{
			String temp=(String) iter.next();
			Double q=map.get(temp);
			System.out.print(temp+" ");
			System.out.println(String.format("%.4f",q*1.0/count*100));
		}
		
	}

}
