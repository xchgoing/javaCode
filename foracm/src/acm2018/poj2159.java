package acm2018;

import java.util.Arrays;
import java.util.Scanner;

public class poj2159
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNext())
		{
			String q=s.nextLine();
			int[] arrq=new int[26];
			String w=s.nextLine();
			int[] arrw=new int[26];
			for(int a=0;a<q.length();a++)
			{
				arrq[(int)q.charAt(a)-65]++;
			}
			for(int a=0;a<w.length();a++)
			{
				arrw[(int)w.charAt(a)-65]++;
			}
			Arrays.sort(arrq);
			Arrays.sort(arrw);
			boolean judge=true;
			for(int a=0;a<26;a++)
			{
				if(arrq[a]!=arrw[a])
				{
					judge=false;
					break;
				}
			}
			if(judge)
			{
				System.out.println("YES");
			}else
			{
				System.out.println("NO");
			}
		}
	}

}
