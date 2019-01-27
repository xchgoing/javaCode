package Èüºó;

import java.util.Scanner;

public class niukezft
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			double a=s.nextInt();
			double b=s.nextInt();
			double c=s.nextInt();
			double sum=a*b*c;
			a=(Math.sqrt(sum)/a);
			b=(Math.sqrt(sum)/b);
			c=(Math.sqrt(sum)/c);
			System.out.println((int)(a*4+b*4+c*4));
		}
	}
}
