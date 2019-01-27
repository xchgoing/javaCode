package Èüºó;

import java.util.Scanner;

public class zoj4036
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			while(n-->0)
			{
				int m=s.nextInt();
				int[] arr=new int[m];
				int add=s.nextInt();
				boolean ok=false;
				for(int a=0;a<m;a++)
				{
					arr[a]=s.nextInt()+add;
					if(arr[a]%7==0)ok=true;
				}
				if(ok)System.out.println("Yes");
				else System.out.println("No");
			}
		}
	}

}
