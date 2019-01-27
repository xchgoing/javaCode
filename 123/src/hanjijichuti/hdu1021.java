package hanjijichuti;

import java.util.Scanner;

public class hdu1021
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			long[] arr=new long[2+n];
			arr[0]=7;
			arr[1]=11;
			for(int a=2;a<=n;a++)
			{
				arr[a]=arr[a-1]+arr[a-2];
			}
			if(arr[n]%3==0)System.out.println("yes");
			else System.out.println("no");
		}
	}
}
