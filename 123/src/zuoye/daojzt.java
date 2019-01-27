package zuoye;

import java.util.Scanner;

public class daojzt
{
    public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			for(int a=0;a<n;a++)
			{
				shuchu(a,n);
			}
		}
	}
    public static void shuchu(int a,int n)
    {
    	for(int b=0;b<a;b++)
    	{
    		System.out.print(" ");
    	}
    	System.out.print("*");
    	for(int b=0;b<n-a-1;b++)
    	{
    		System.out.print("**");
    	}
    	System.out.println();
    }
}
