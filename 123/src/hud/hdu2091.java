package hud;

import java.util.Scanner;

public class hdu2091
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		int flag=0;
		while(s.hasNext())
		{
			String x=s.next();
			if(x.equals("@"))break;
			int n=s.nextInt();
			if(flag==1)System.out.println();
			flag=1;
			for(int a=0;a<n;a++)
			{
				for(int k=0;k<n-a-1;k++)
				{
					System.out.print(" ");
				}
				if(a!=0&&a!=n-1)
				{
					System.out.print(x);
					System.out.print(" ");
					for(int k=0;k<a-1;k++)
					{
						System.out.print("  ");
					}
					System.out.println(x);
				}else if(a==n-1)
				{
					System.out.print(x);
					for(int k=0;k<n-1;k++)
					{
						System.out.print(x+x);
					}
					System.out.println();
				}else
				{
					System.out.println(x);
				}
			}
		}
	}
}
