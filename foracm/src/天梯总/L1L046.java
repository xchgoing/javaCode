package ������;

import java.math.BigInteger;
import java.util.Scanner;

public class L1L046
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextBigInteger())
		{
			BigInteger in=s.nextBigInteger();
			String str="";
			while(true)
			{
				str+="1";
				BigInteger big=new BigInteger(str);
				if(big.mod(in).toString().equals("0"))
				{
					System.out.println(big.divide(in)+" "+str.length());
					break;
				}
			}
		}
	}

}
