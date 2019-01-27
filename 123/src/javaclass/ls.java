package javaclass;

import java.util.Arrays;

public class ls
{

	public static void main(String[] args)
	{
		int[] arr={3,5,5,4,4,2,1,0,0,0,0,0,0};
		int n=5;
		int count=0;
		for(int a=0;a<arr.length;a++)
		{
			if(arr[a]!=n||count!=0)
			{
				System.out.print(arr[a]);
			}
			if(arr[a]==n)
			{
				count++;
			}
		}
		System.out.println(n);
	}

}
