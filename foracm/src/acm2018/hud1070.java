package acm2018;

import java.util.Scanner;

public class hud1070
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			for(int a=0;a<n;a++)
			{
				int m=s.nextInt();
				String end="";
				double min=-1;
				int temp=0;
				for(int b=0;b<m;b++)
				{
					String name=s.next();
					int price=s.nextInt();
					int capacity=s.nextInt();
					if(capacity<200)continue;
					int fact=capacity/200;
					double fprice=fact>=5 ? price*1.0/5:price*1.0/fact;
					if(min<0)
					{
						min=fprice;
						end=name;
						temp=capacity;
					}else
					{
						if(min>fprice)
						{
							min=fprice;
							end=name;
							temp=capacity;
						}
						else if(min==fprice)
						{
							if(capacity>temp)
							{
								min=fprice;
								end=name;
								temp=capacity;
							}
						}
					}
				}
				System.out.println(end);
			}
		}
	}

}
