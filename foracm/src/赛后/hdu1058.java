package Èüºó;

import java.util.Scanner;

public class hdu1058
{

	public static void main(String[] args)
	{
		long[] arr=new long[5843];
		int qwe=1;
		for(long a=1;a<=2000000000;a++)
		{
			if(ish(a))
			{
				arr[qwe]=a;
				qwe++;
			}
		}
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int q=s.nextInt();
			if(q==0)break;
			if(q%10==1)
			{
				System.out.print("The "+q+"st ");
			}else if(q%10==2)
			{
				System.out.print("The "+q+"nd ");
			}else if(q%10==3)
			{
				System.out.print("The "+q+"rd ");
			}else
			{
				System.out.print("The "+q+"th ");
			}
			System.out.println("humble number is "+arr[q]);
		}
	}
	public static boolean ish(long q)
	{
		while(true)
		{
			if(q%2==0)q/=2;
			else break;
		}
		while(true)
		{
			if(q%3==0)q/=3;
			else break;
		}
		while(true)
		{
			if(q%5==0)q/=5;
			else break;
		}
		while(true)
		{
			if(q%7==0)q/=7;
			else break;
		}
		if(q==1)return true;
		else return false;
	}

}
