package acm2018;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class zoj3987wa
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			for(int a=0;a<n;a++)
			{
				BigInteger q=s.nextBigInteger();
				BigInteger w=s.nextBigInteger();
				BigInteger out=BigInteger.ZERO;
				int max=q.toString(2).length();
				for(int b=max-1;b>=0;b--)
				{
					BigInteger com=new BigInteger("2").pow(b);
						if(q.compareTo(((com.subtract(BigInteger.ONE)).multiply(w)))>0)
						{
							q=q.subtract(com.multiply(q.divide(com)));
							out=out.add(com);
						}
				}
				System.out.println(out);
			}
		}
	}

}
