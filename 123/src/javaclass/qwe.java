package javaclass;

import java.util.Scanner;

public class qwe
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int a[]=new int[10];
			for(int q=0;q<10;q++)
			{
				a[q]=s.nextInt();
			}
			int n=s.nextInt();
			if(n<10)
			{
				for(int q=n;q<10;q++)
				{
					a[q-1]=a[q];
				}
			}
			a[9]=0;
			for(int x:a)
			{
				System.out.print(x+" ");
			}
			System.out.println();
		}

	}

}
