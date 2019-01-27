package acm2018;

import java.util.Scanner;

public class niukejme
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int a=s.nextInt();
			System.out.println((int)Math.pow(2,a));
		}
	}

}
