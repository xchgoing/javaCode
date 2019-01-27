package acm2018;

import java.util.Scanner;

public class a2017
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			for(int a=0;a<n;a++)
			{
				int m=s.nextInt();
				int q=0;
				int w=0; 
				for(int i=0;i<m;i++)
				{
					int temp=s.nextInt();
					if(temp==1)q++;
					if(temp==2)w++;
				}
				String end="Draw";
				if(q>w)end="Kobayashi";
				if(q<w)end="Tohru";
				System.out.println(end);
			}
			
		}
	}

}
