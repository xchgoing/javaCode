package acm2018;

import java.util.Scanner;

public class zoj2478
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			while(n-->0)
			{
				String q=s.next();
				int count=0;
				char temp='0';
				for(int a=0;a<q.length();a++)
				{
					if(a!=0)
					{
						if(temp!=q.charAt(a))
						{
							if(count!=1)
							{
								System.out.print(count+""+temp);
							}else
							{
								System.out.print(temp);
							}
							count=1;
							temp=q.charAt(a);
						}else
						{
							count++;
						}
					}else
					{
						temp=q.charAt(a);
						count=1;
					}
				}
				if(count!=1)
				{
					System.out.print(count+""+temp);
				}else
				{
					System.out.print(temp);
				}
					
				System.out.println();
			}
		}
	}

}
