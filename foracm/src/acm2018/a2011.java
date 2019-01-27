package acm2018;

import java.util.Scanner;

public class a2011
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			for(int i=0;i<n;i++)
			{
				int a=s.nextInt();
				if(a/10%10==1)
				{
					System.out.println(a+"th");
				}else if(a%10==1)
				{
					System.out.println(a+"st");
				}else if(a%10==2)
				{
					System.out.println(a+"nd");
				}else if(a%10==3)
				{
					System.out.println(a+"rd");
				}else
				{
					System.out.println(a+"th");
				}
			}
		}
	}

}
