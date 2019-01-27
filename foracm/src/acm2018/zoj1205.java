package acm2018;

import java.math.BigInteger;
import java.util.Scanner;

public class zoj1205
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNext())
		{
			String a=s.next();
			String b=s.next();
			BigInteger q=new BigInteger(a,20);
			BigInteger w=new BigInteger(b,20);
			System.out.println(q.add(w).toString(20));
		}
	}

}
