package acm2018;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class zoj2476
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			s.nextLine();
			if(n==0)break;
			BigDecimal out=BigDecimal.ZERO;
			for(int a=0;a<n;a++)
			{
				String temp=s.nextLine();
				temp=temp.replace(",", "");
				temp=temp.replace("$", "");
				out=out.add(BigDecimal.valueOf(Double.valueOf(temp)));
			}
			String q=out.toString();
			for(int a=q.length()-q.indexOf(".");a<3;a++)
			{
				q+="0";
			}
			StringBuffer wa=new StringBuffer();
			wa=wa.append(q.substring(q.length()-3, q.length()));
			int count=0;
			for(int a=q.length()-4;a>=0;a--)
			{
				StringBuffer t;
				if(count%3==0&&count!=0)
				{
					t=new StringBuffer(q.substring(a, a+1)+",");
				}else
				{
					t=new StringBuffer(q.substring(a, a+1));
				}
				wa=t.append(wa);
				count++;
			}
			System.out.println("$"+wa);
			
		}
		
	}

}
