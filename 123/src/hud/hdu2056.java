package hud;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class hdu2056
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (new BufferedInputStream(System.in));
		while(s.hasNextDouble())
		{
			double x1=s.nextDouble();
			double y1=s.nextDouble();
			double x2=s.nextDouble();
			double y2=s.nextDouble();
			double x3=s.nextDouble();
			double y3=s.nextDouble();
			double x4=s.nextDouble();
			double y4=s.nextDouble();
			if(x1>x2)
			{
				double a=x1;
				double b=y1;
				x1=x2;
				x2=a;
				y1=y2;
				y2=b;
			}
			if(y2>y1)
			{
				if(x4>x1&&y4>y1&&x3<x2&&y3<y2)
				{
					
				}else
				{
					System.out.println(String.format("%.2f",0));
				}
			}
		}

	}

}
