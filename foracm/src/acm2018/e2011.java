package acm2018;

import java.util.Arrays;
import java.util.Scanner;

public class e2011
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
				double[] arr=new double[m];
				for(int i=0;i<m;i++)
				{
					arr[i]=s.nextDouble();
				}
				Arrays.sort(arr);
				if(m%2==0)
				{
					System.out.println(String.format("%.3f",(arr[m/2-1]+arr[m/2])/2));
				}else
				{
					System.out.println(String.format("%.3f",(arr[(m+1)/2-1])));
				}
			}
		}
	}
}
