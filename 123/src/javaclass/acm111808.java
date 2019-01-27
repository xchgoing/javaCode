package javaclass;

import java.util.Arrays;
import java.util.Scanner;

public class acm111808
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNext())
		{
			String a=s.next();
			String b=s.next();
			if(a.length()<b.length())
			{
				String q=a;
				a=b;
				b=a;
			}
			int ar1[]=new int[a.length()+1];
			int ar2[]=new int[a.length()+1];
			Arrays.fill(ar1, 0);
			Arrays.fill(ar2, 0);
			for(int q=0;q<a.length();q++)
			{
				ar1[q]=(int)a.charAt(a.length()-1-q)-48;
			}
			for(int q=0;q<b.length();q++)
			{
				ar2[q]=(int)b.charAt(b.length()-1-q)-48;
			}
			for(int q=0;q<a.length();q++)
			{
				int t=ar1[q];
				ar1[q]=(ar1[q]+ar2[q])%10;
				ar1[q+1]+=(t+ar2[q])/10;
			}
			int c=0;
			for(int x=a.length();x>=0;x--)
			{
				if(c==0&&ar1[x]==0)
				{
					c=1;
				}
				else
				{
					System.out.print(ar1[x]);
				}
			}
			System.out.println();
		}
	}

}
