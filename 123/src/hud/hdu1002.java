package hud;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class hdu1002
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextLong())
		{
			long q=s.nextLong();
			for(int a=0;a<q;a++)
			{
				BigInteger w=new BigInteger(s.next());
				BigInteger e=new BigInteger(s.next());
				System.out.println(String.format("Case %1d:",a+1));
				System.out.println(String.format("%d + %d = %d",w,e,w.add(e)));
				if(a!=q-1)System.out.println();
			} 
		}
	}
}