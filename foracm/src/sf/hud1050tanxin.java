package sf;

import java.math.BigInteger;
import java.util.Scanner;

public class hud1050tanxin
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			for(int a=0;a<n;a++)
			{
				BigInteger q=new BigInteger(s.next());
				BigInteger w=new BigInteger(s.next());
				BigInteger e=q.divide(w);
				//w>q;q%w==0
				String f=e.toString(2);
				max(f,q.mod(w),w);
			}
		}
	}
	public static void max(String f,BigInteger yushu,BigInteger w)
	{
		String c1="";
		String f1="";
		for(int a=f.length()-1;a>=0;a--)
		{
			if(f.substring(a, a+1).equals("1"))
			{
				c1+="1";
			}else
			{
				break;
			}
		}
		f1=f.substring(0,f.length()-c1.length())+"1";
		int out=c1.length();
		BigInteger q=new BigInteger(f,2).multiply(w).add(yushu);
		BigInteger jw=new BigInteger("1"+c1.replace("1", "0"),2);
		while(q.compareTo(jw)>0)
		{
			q=q.subtract(jw);
		}
		String nt=q.toString(2);
		if(!q.divide(w).toString().equals("0"))
		{
			int temp=c1.length();
			for(int a=0;a<f.length()-q.divide(w).toString(2).length()-temp;a++)
			{
				f1+="0";
			}
			f1+=q.divide(w).toString(2);
			max(f1,q.mod(w),w);
		}else
		{
			int temp=c1.length();
			for(int a=0;a<f.length()-q.divide(w).toString(2).length()-temp;a++)
			{
				f1+="0";
			}
			f1+="1";
			System.out.println(f1);
		}
	}
}
