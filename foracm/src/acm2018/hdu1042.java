package acm2018;

import java.math.BigInteger;
import java.util.Scanner;

public class hdu1042
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			BigInteger sum=new BigInteger("1");
			for(int a=1;a<=n;a++)
			{
				sum=sum.multiply(BigInteger.valueOf(a));
			}
			System.out.println(sum);
		}
			
	}

}
