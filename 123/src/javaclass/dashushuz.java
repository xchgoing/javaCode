package javaclass;

import java.util.Arrays;
import java.util.Scanner;
public class dashushuz
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextLine())
		{
			String q=s.nextLine();
			String w=s.nextLine();
			int e;
			if(q.length()<w.length())
			{
				String d=w;
				w=q;
				q=d;
			}
			e=q.length();
			int[] arr=new int[e+1];
			for(int a=0;a<e;a++)
			{
				arr[a]+=(int)q.charAt(e-1-a)-48;
				if(a<w.length())
				{
					arr[a]=arr[a]+(int)w.charAt(w.length()-1-a)-48;
				}
				if(arr[a]>=10)
				{
					arr[a]=arr[a]%10;
					arr[a+1]++;
				}
			}
			if(arr[e]==0)
			{
				for(int a=0;a<e;a++)
				{
					System.out.print(arr[e-1-a]);
				}
				System.out.println();
			}else
			{
				System.out.print(1);
				for(int a=0;a<e+1;a++)
				{
					System.out.print(arr[e-a]);
				}
				System.out.println();
			}
		}
	}

}
