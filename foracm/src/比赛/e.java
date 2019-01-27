package ±ÈÈü;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;


public class e
{

	public static void main(String[] args) throws IOException
	{
		StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		while(in.nextToken()!=StreamTokenizer.TT_EOF)
		{
			boolean ok=true;
			int q=(int)in.nval;
			if(q==0)break;
			for(int a=2;a<q;a++)
			{
				if(ispr(a)&&ispr(q-a))
				{
					out.println(q+" = "+a+" + "+(q-a));
					ok=true;
					break;
				}
			}
			if(!ok)out.println("Goldbach's conjecture is wrong.");
			out.flush();
		}
	}
	public static boolean ispr(int q)
	{
		boolean r=true;
		for(int a=2;a<=Math.sqrt(q);a++)
		{
			if(q%a==0)r=false;
		}
		return r;
	}

}
