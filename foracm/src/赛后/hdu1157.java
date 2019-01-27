package Èüºó;

import java.util.Arrays;
import java.util.Scanner;

public class hdu1157
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			int[] arr=new int[n];
			for(int a=0;a<n;a++)
			{
				arr[a]=s.nextInt();
			}
			Arrays.sort(arr);
			System.out.println(arr[n/2]);
		}
	}

}
