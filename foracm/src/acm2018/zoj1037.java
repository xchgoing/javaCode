package acm2018;

import java.util.Scanner;

public class zoj1037
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			for(int a=1;a<=n;a++)
			{
				int q=s.nextInt();
				int w=s.nextInt();
				double out=0;
				if(q%2==1&&w%2==1)
				{
					out=Math.sqrt(2)+q*w-1;
				}else
				{
					out=q*w;
				}
				System.out.println(String.format("Scenario #%d:",a));
				System.out.println(String.format("%.2f",out));
				System.out.println();
			}
		}
	}

}
