package hud;

import java.util.Scanner;

public class hdu2074
{
    public static void main(String[] args)
	{
    	int flag=0;
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			if(flag!=0)
			{
				System.out.println();
			}
			int n=s.nextInt();
			s.hasNext();
			String q=s.next();
			String w=s.next();
			if(n==1)
			{
				System.out.println(q);
			}else
			{
				String[][] arr=new String[n][n];
				int count=1;
				if(((n+1)/2)%2==1)
				{
					String e=q;
					q=w;
					w=e;
				}
				for(int a=0;a<(n/2)+1;a++)
				{
					count=1;
					for(int b=0;b<(n/2)+1;b++)
					{
						if(b<a)
						{
							if(count==1)
							{
								arr[a][n-1-b]=w;
								arr[a][b]=w;
								arr[n-1-a][b]=w;
								arr[n-1-a][n-1-b]=w;
								count=-count;
							}else
							{
								arr[a][n-1-b]=q;
								arr[a][b]=q;
								arr[n-1-a][b]=q;
								arr[n-1-a][n-1-b]=q;
								count=-count;
							}
						}else
						{
							if(count==1)
							{
								arr[a][n-1-b]=w;
								arr[a][b]=w;
								arr[n-1-a][b]=w;
								arr[n-1-a][n-1-b]=w;
							}else
							{
								arr[a][n-1-b]=q;
								arr[a][b]=q;
								arr[n-1-a][b]=q;
								arr[n-1-a][n-1-b]=q;
								
							}
						}
					}
				}
				arr[0][0]=" ";
				arr[0][n-1]=" ";
				arr[n-1][0]=" ";
				arr[n-1][n-1]=" ";
				for(int a=0;a<n;a++)
				{
					for(int b=0;b<n;b++)
					{
						System.out.print(arr[a][b]);
					}
					System.out.println();
				}
			}
			flag++;
		}
	}
	
}
