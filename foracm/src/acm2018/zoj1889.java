package acm2018;

import java.math.BigInteger;
import java.util.Scanner;

public class zoj1889
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextBigInteger())
		{
			BigInteger n=s.nextBigInteger();
			BigInteger one=new BigInteger("1");
			while(true)
			{
				if(one.mod(n).toString().equals("0"))
				{
					break;
				}
				one=one.multiply(new BigInteger("10")).add(new BigInteger("1"));
			}
			System.out.println(one.toString().length());
		}
	}

}
