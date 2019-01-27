package acm2018;

import java.util.Scanner;

public class b2011
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			for(int i=0;i<n;i++)
			{
				double a=s.nextDouble();
				double b=s.nextDouble();
				double c=s.nextDouble();
				double d=s.nextDouble();
				double e=s.nextDouble();
				double f=s.nextDouble();
//				System.err.println(i);
				if(a==c)
				{
					System.out.println("circle");
				}else if(a*c>0)
				{
					System.out.println("ellipse");
				}else if(a*c==0)
				{
					System.out.println("parabola");
				}else
				{
					System.out.println("hyperbola");
				}
			}
		}
	}

}
