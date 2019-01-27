package hud;

import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class hdu2071
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(new BufferedInputStream(System.in));
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			for(int a=0;a<n;a++)
			{
				int m=s.nextInt();
				s.nextDouble();
				double max[]=new double[(int) m];
				for(double b=0;b<m;b++)
				{
					max[(int)b]=s.nextDouble();
				}
				Arrays.sort(max);
				System.out.println(String.format("%.2f",max[(int)m-1]));
			}
		}
	}
}
