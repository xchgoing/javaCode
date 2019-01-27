package hud;

import java.util.Scanner;

public class hdu2076
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			for(int a=0;a<n;a++)
			{
				int shi=s.nextInt();
				int fen=s.nextInt();
				int miao=s.nextInt();
				if(shi>12)shi=shi-12;
				double shid=shi*30+30*(fen/60.0)+30*(miao/3600.0);
				double fend=fen*6+(miao/60.0)*6;
				double c=Math.abs(shid-fend);
				int cs;
				if(c>180)
				{
					cs=(int)(360-c);
				}else
				{
					cs=(int)c;
				}
				System.out.println(cs);
			}
		}
	}

}
