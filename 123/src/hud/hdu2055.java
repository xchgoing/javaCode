package hud;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class hdu2055
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(new BufferedInputStream(System.in));
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			for(int a=0;a<n;a++)
			{
				s.hasNext();
				String x=s.next();
				s.hasNextInt();
				int y=s.nextInt();
				int q=(int)x.charAt(0);
				if(q<=122&&q>=97)
				{
					q=96-q;
				}else
				{
					q=q-64;
				}
				System.out.println(q+y);
			}
		}

	}

}
