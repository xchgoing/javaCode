package acm2018;

import java.util.Scanner;

public class zoj1489
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			if(n%2==0)
			{
				System.out.println("2^? mod "+n+" = 1");
				continue;
			}
			int end=2%n;
			int two=4;
			int x=2;
			while(true)
			{
				two%=n;
				if(two==1)
				{
					System.out.println("2^"+x+" mod "+n+" = 1");
					break;
				}
				if(two==end)
				{
					System.out.println("2^? mod "+n+" = 1");
					break;
				}
				two*=2;
				x++;
			}
		}
	}

}
