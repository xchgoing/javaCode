package acm2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.math.BigInteger;
//import java.util.Arrays;
//import java.util.Scanner;

public class JRSA
{

	public static void main(String[] args) throws IOException
	{

		StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

		while (in.nextToken() != StreamTokenizer.TT_EOF)
		{
//			System.out.println("q");
//			in.nextToken();
			int p=(int)in.nval;
//			System.out.println(p);
			in.nextToken();
			int q=(int)in.nval;
			in.nextToken();
			int e=(int)in.nval;
			long n=p*q;
			long fn=(p-1)*(q-1);
//			System.out.println("qwer");
			long qwe=1;
			while(true)
			{
				qwe+=fn;
				if(qwe%e==0)
					break;
			}
			int d=(int) (qwe/e);
			in.nextToken();
			int l=(int)in.nval;
//			System.out.println("qwer");
			for(int i=0;i<l;i++) 
			{
//				System.out.println(i);
				in.nextToken();
				long qwer=(long) in.nval;
//				System.out.println(qwer);
				BigInteger a=new BigInteger(String.valueOf(qwer));//读入下一个数
				BigInteger N=new BigInteger(String.valueOf(n));
				BigInteger M=a.pow(d).mod(N);//%n
				int A=Integer.parseInt(M.toString());
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
//		out.flush();
	}

}
