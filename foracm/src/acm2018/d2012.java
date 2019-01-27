package acm2018;

import java.util.Scanner;

public class d2012
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			for(int a=0;a<n;a++)
			{
				int people=s.nextInt();
				int[] price=new int[people];
				int[] time=new int[people];
				for(int b=0;b<people;b++)
				{
					price[b]=s.nextInt();
				}
				int temp=0;
				for(int b=0;b<people;b++)
				{
					time[b]=s.nextInt()-temp;
					temp+=time[b];
				}
				for(int b=0;b<people-1;b++)
				{
					for(int c=b;c<people-1;c++)
					{
						if(time[c]>time[c+1])
						{
							int exchange=time[c];
							time[c]=time[c+1];
							time[c+1]=exchange;
							exchange=price[c];
							price[c]=price[c+1];
							price[c+1]=exchange;
						}
					}
				}
				double ant=0;
				double anp=0;
				for(int b=0;b<time.length;b++)
				{
					if(ant==time[b])continue;
					double empty=0;
					int count=0;
					for(int c=0;c<time.length&&time[c]<=time[b];c++)
					{
						empty+=price[c];
						count++;
					}
					empty/=count;
					if(empty>anp)
					{
						anp=empty;
						ant=(double) time[b];
					}
				}
				System.out.printf("%.6f",ant);
				System.out.println(String.format("%.6f",anp));
			}
		}
	}
}
