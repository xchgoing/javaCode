package hud;

import java.util.Scanner;

public class hdu2092
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			int m=s.nextInt();
			if(n==0&&m==0)break;
			int count=0;
			for(int a=1;a<Math.abs(m);a++)
			{
				if(m%a==0)
				{
					if(a+m/a==n||a+m/a==-n)
					{
						System.out.println("Yes");
						count++;
						break;
					}
				}
			}
			if(count==0)
			{
				System.out.println("No");
			}
		}
	}

}
