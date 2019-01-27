package hud;

import java.util.Scanner;

public class hdu2061
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			int a;
			for(a=0;a<n;a++)
			{
				int m=s.nextInt();
				int sum=0;
				int count=0;
				int b;
				for(b=0;b<m;b++)
				{
					s.hasNext();
					String temp=s.next();
					s.hasNextInt();
					int q=s.nextInt();
					int w=s.nextInt();
					if(w<60)
					{
						System.out.println("Sorry!");
						break;
					}
					sum=sum+q*w;
					count+=q;
				}
				if(b==m)
				{
					System.out.printf("%.2f",(1.0*sum)/count);
					System.out.println();
				}
				if(a!=n-1)
				{
					System.out.println();
				}
			}
		}
	}

}
