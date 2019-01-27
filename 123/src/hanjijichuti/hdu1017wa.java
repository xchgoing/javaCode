package hanjijichuti;

import java.util.Scanner;

public class hdu1017wa
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		loop:for(int a=0;a<n;a++)
		{
			while(s.hasNextInt())
			{
				int count=0;
				int flag=1;
				int q=s.nextInt();
				int w=s.nextInt();
				if(q==0&&w==0)
				{
					System.out.println();
					continue loop;
				}
				for(int e=1;e<q-1;e++) 
				{
					for(int r=e+1;r<q;r++)
					{
						double temp=(e*e+r*r+w)*1.0/(e*r);
						if((int)temp==temp)
						{
							count++;
						}
					}
				}
				System.out.println("Case"+(flag++)+":"+count);
			}
		}
	}

}
