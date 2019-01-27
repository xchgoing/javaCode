package hud;

import java.util.Scanner;

public class hdu2075
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			for(int a=0;a<n;a++)
			{
				int q=s.nextInt();
				int w=s.nextInt();
				if(q%w==0)
				{
					System.out.println("YES");
				}else
				{
					System.out.println("NO");
				}
			}
		}
	}

}
