package hanjijichuti;

import java.util.Arrays;
import java.util.Scanner;

public class hdu1019
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			for(int a=0;a<n;a++)
			{
				int m=s.nextInt();
				int[] arr=new int[m];
				for(int b=0;b<m;b++)
				{
					arr[b]=s.nextInt();
				}
				Arrays.sort(arr);
				long temp=arr[m-1];
				for(int b=m-2;b>=0;b--)
				{
					temp=(temp*arr[b])/gcd(temp,arr[b]);
				}
				System.out.println(temp);
			}
		}
	}
	public static int gcd(long a,int b)
	{
		if(a%b==0)return b;
		else return gcd(b,(int)a%b);
	}
}
