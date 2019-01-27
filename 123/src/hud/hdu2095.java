package hud;

import java.util.Arrays;
import java.util.Scanner;

public class hdu2095
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			if(n==0)break;
			int[] arr=new int[n];
			for(int a=0;a<n;a++)
			{
				arr[a]=s.nextInt();
			}
			Arrays.sort(arr);
			int sum=0;
			int q=1;
			for(int a=0;a<n;a++)
			{
				sum+=q*arr[a];
				q=-q;
			}
			System.out.println(Math.abs(sum));
		}
	}

}
