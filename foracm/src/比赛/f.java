package ±ÈÈü;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Scanner;

public class f
{

	public static void main(String[] args) throws IOException
	{
		StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		while(in.nextToken()!=StreamTokenizer.TT_EOF)
		{
			int q=(int)in.nval;
			boolean ok=false;;
			for(int a=2;a<=Math.sqrt(q);a++)
			{
				if(q%a==0&&isp(a)&&isp(q/a))
				{
					System.out.println("Yes");
					ok=true;
					break;
				}
			}
			if(!ok)System.out.println("No");
			out.flush();
		}
	}
	public static boolean isp(int q)
	{
		boolean r=true;
		if(q<2)return false;
		else
		{
			for(int a=2;a<=Math.sqrt(q);a++)
			{
				if(q%a==0)r=false;
			}
			return r;
		}
	}

}
