package acm2018;

import java.util.Scanner;

public class zoj1383
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			for(int a=0;a<n;a++)
			{
				int q=s.nextInt();
				String w=Integer.toString(q,2);
				System.out.println(w);
			}
		}
	}

}
