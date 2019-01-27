package ×ÏÊé;

import java.util.Arrays;
import java.util.Scanner;

public class UVA1584
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			while(n-->0)
			{
				String q=s.next();
				q=q+q;
				int index=0;
				for(int a=1;a<q.length()/2;a++)
				{
					if(!compare(q,index,a,q.length()/2,1))
					{
						index=a;
					}
				}
				System.out.println(q.substring(index,index+q.length()/2));
			}
		}
		
	}
	
	public static boolean compare(String q,int a,int b,int le,int len)
	{
		if(len==le)return false;
		if(q.charAt(a)<q.charAt(b))
		{
			return true;
		}else if(q.charAt(a)==q.charAt(b))
		{
			return compare(q,++a,++b,le,++len);
		}else
		{
			return false;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void way1(String q)
	{
		String[] arr=new String[q.length()];
		q=q+q;
		for(int a=0;a<q.length()/2;a++)
		{
			arr[a]=q.substring(a,a+q.length()/2);
		}
		Arrays.sort(arr);
		System.out.println(arr[0]);
	}

}
