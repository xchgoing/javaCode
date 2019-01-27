package acm2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;




public class hdu1879
{
	static int[] city;
	public static void main(String[] args) throws IOException
	{
		StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		while(in.nextToken()!=StreamTokenizer.TT_EOF)
		{
			int n=(int)in.nval;
			if(n==0)break;
			city=new int[n+1];
			for(int a=0;a<city.length;a++)
			{
				city[a]=a;
			}
			jlc[] qwe=new jlc[n*(n-1)/2];
			for(int a=0;a<n*(n-1)/2;a++)
			{
				in.nextToken();
				int q=(int)in.nval;in.nextToken();
				int w=(int)in.nval;in.nextToken();
				int e=(int)in.nval;in.nextToken();
				int r=(int)in.nval;
				if(r==1)e=0;
				qwe[a]=new jlc(q,w,e,r);
			}
			Arrays.sort(qwe);
			int pre=0;
			int count=0;
			for(int a=0;a<qwe.length;a++)
			{
				int temp1=qwe[a].a;
				int temp2=qwe[a].b;
				if(!pd(temp1,temp2))
				{
					city[search(temp1)]=city[search(temp2)];
					pre+=qwe[a].dis;
					count+=qwe[a].dis;
				}
				if(count==n-1)break;
			}
			System.out.println(count);
			out.flush();
		}
	}
	public static boolean pd(int a,int b)
	{
		if(search(a)==search(b))return true;
		else return false;
	}
	public static int search(int a)
	{
		if(city[a]==a)
		{
			return a;
		}else
		{
			city[a]=search(city[a]);
			return city[a];
		}
	}
}
 class jlc implements Comparable<jlc>
{
	int a;
	int b;
	int dis;
	int ok;
	public jlc(int q,int w,int e,int r)
	{
		a=q;
		b=w;
		dis=e;
		ok=r;
	}
	public int compareTo(jlc o)
	{
		return this.dis-o.dis;
	}
}
