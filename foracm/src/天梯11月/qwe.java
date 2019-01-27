package 天梯11月;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class qwe
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) 
		{
			int p=sc.nextInt();
			int q=sc.nextInt();
			int e=sc.nextInt();
			long n=p*q;
			long fn=(p-1)*(q-1);
			
			long qwe=1;
			while(true)
			{
				qwe+=fn;
				if(qwe%e==0)break;
			}
			int d=(int) (qwe/e);
//			int d=0;
//			while(d*e%fn!=1) 
//			{
//				d++;
//			}
			String b=""+n;
			int l=sc.nextInt();
			for(int i=1;i<=l;i++) 
			{
				BigInteger a=sc.nextBigInteger();//读入下一个数
				BigInteger M=new BigInteger("0");
				BigInteger N=new BigInteger(b);
				M=a.pow(d);//c^d
				M=M.mod(N);//%n
				String c=""+M;
				int A=Integer.parseInt(c);
				if(i!=l) 
				{
					System.out.print((char)A);
				}
				else 
				{
					System.out.println((char)A);
				}
			}
			
		}
	}

}