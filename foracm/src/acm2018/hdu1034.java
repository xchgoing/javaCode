package acm2018;

import java.util.Arrays;
import java.util.Scanner;
public class hdu1034
{
	public static void main(String[] args)
	{
		int[] arr;
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			if(n==0)
			{
				break;
			}
			arr=new int[n];
			for(int a=0;a<n;a++)
			{
				arr[a]=s.nextInt();
			}
			int count=0;
			while(!ist(arr))
			{
				count++;
				qwe(arr);
			}
			System.out.println(count+" "+arr[0]);
		}
	}
	public static void qwe(int[] arr)
	{
		int temp=arr[0];
		for(int a=0;a<arr.length;a++)
		{
			if(a!=0)
			{
				int temp1=arr[a];
				arr[a]=temp/2+arr[a]/2;
				if(arr[a]%2==1)arr[a]++;
				temp=temp1;
				
			}else
			{
				arr[0]=arr[0]/2+arr[arr.length-1]/2;
				if(arr[a]%2==1)arr[a]++;
			}
		}
	}
	public static boolean ist(int[] arr)
	{
		boolean out=true;
		for(int a=0;a<arr.length-1;a++)
		{
			if(arr[a]!=arr[a+1])
			{
				out=false;
			}
		}
		return out;
	}
}
