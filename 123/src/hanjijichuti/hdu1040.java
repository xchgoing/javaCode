package hanjijichuti;

import java.util.Arrays;
import java.util.Scanner;

public class hdu1040
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
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
				for(int x=0;x<m;x++)
				{
					if(x+1!=m)System.out.print(arr[x]+" ");
					else System.out.print(arr[x]);
				}
				System.out.println();
			}
		}
	}
}
