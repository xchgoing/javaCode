package ±ÈÈü;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;


public class g
{
	static st[] arr;
	public static void main(String[] args) throws IOException
	{
		StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		int f=1;
		while(in.nextToken()!=StreamTokenizer.TT_EOF)
		{
			if(f!=1)System.out.println();
			System.out.println("Case "+f+":");
			f++;
			int n=(int)in.nval;
			in.nextToken();
			int m=(int)in.nval;
			arr=new st[n+1];
			for(int a=1;a<arr.length;a++)
			{
				arr[a]=new st(a,1);
			}
			while(m-->0)
			{
				in.nextToken();
				String q=in.sval;
				if(q.equals("M"))
				{
					in.nextToken();
					int q1=(int)in.nval;
					in.nextToken();
					int w1=(int)in.nval;
					if(arr[search(q1)].f!=arr[search(w1)].f)
					{
						arr[search(q1)].c=arr[search(q1)].c+arr[search(w1)].c;
						arr[search(w1)].f=arr[search(q1)].f;
						
					}
				}else
				{
					in.nextToken();
					int e1=(int)in.nval;
					out.println(arr[search(e1)].c);
					out.flush();
				}
			}
			
		}
	}
	public static int search(int a)
	{
		if(arr[a].f!=a)
		{
			arr[a].f=search(arr[a].f);
		}
		return arr[a].f;
	}
	

}
class st
{
	int f;
	int c;
	public st(int q,int w)
	{
		f=q;
		c=w;
	}
}