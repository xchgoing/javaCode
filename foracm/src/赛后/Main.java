package Èüºó;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
	static int[] arr;
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			String input=s.next();
			int n=input.length();
			arr=new int[n];
			int sum=0;
			for(int a=0;a<n;a++)
			{
				arr[a]=input.charAt(a)-'0';
			}
			Arrays.sort(arr);
			if(arr[n-1]==0)
			{
				System.out.println(0);
				continue;
			}
			for(int a=0;a<=n/2;a++)
			{
				int temp=arr[a];
				arr[a]=arr[n-a-1];
				arr[n-a-1]=temp;
			}
		}
	}
}
