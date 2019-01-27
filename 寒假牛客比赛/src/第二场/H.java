package µÚ¶þ³¡;

import java.math.BigInteger;
import java.util.Scanner;

public class H
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext())
		{
			BigInteger in=sc.nextBigInteger();
			char[] a=in.toString(3).toCharArray();
			boolean flag=true;
			for (int i = 0; i < a.length; i++)
			{
				if(a[i]-'0'==0)break;
				if(a[i]-'0'==2)
				{
					flag=false;
					break;
				}
			}
			if (flag==true)
			{
				System.out.println(in.toString(3).length());
			}
			else
			{
				System.out.println(in.toString(3).length()+1);
			}
			
		}
	}

}