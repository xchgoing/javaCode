package acm2018;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class hdu1800
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			HashMap<BigInteger,Integer> map=new HashMap();
			int n=s.nextInt();
			int end=1;
			for(int i=0;i<n;i++)
			{
				BigInteger q=s.nextBigInteger();
				if(map.get(q)!=null)
				{
					int w=map.get(q);
					w++;
					map.put(q,w);
					if(w>end)
					{
						end=w;
					}
				}else
				{
					map.put(q,1);
				}
			}
			System.out.println(end);
		}
	}

}
