package hud;

import java.util.Scanner;

public class hdu2098
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			if(n==0)break;
			int count=0;
			for(int a=2;a<=n/2;a++)
			{
				if(sushu(a)&&sushu(n-a)&&a!=(n-a))
				{
					count++;
					//System.out.println(a);
				}
			}
			System.out.println(count);
			//System.out.println(sushu(25));
		}
	}
	public static boolean sushu(int a)
	{
		int b;
		for(b=2;b<=Math.sqrt(a);b++)
		{
			if(a%b==0)break;
		}
		if(b<=Math.sqrt(a))return false;
		else return true;
	}

}
