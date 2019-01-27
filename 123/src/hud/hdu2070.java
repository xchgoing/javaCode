package hud;

import java.util.Scanner;

public class hdu2070
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			if(n==-1)
			{
				break;
			}else if(n==0)
			{
				System.out.println("0");
			}else if(n==1)
			{
				System.out.println("1");
			}else
			{
				long[] arr=new long[n+1];
				arr[0]=0;
				arr[1]=1;
				for(int a=2;a<n+1;a++)
				{
					arr[a]=arr[a-1]+arr[a-2];
				}
				System.out.println(arr[n]);
			}
			
		}
	}
}
