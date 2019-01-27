package Èüºó;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class zoj4025
{

	public static void main(String[] args) throws IOException
	{
		StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		while(in.nextToken()!=StreamTokenizer.TT_EOF)
		{
			int n=(int)in.nval;
			while(n-->0)
			{
				in.nextToken();
				int m=(int)in.nval;
				long[] arr=new long[m];
				for(int a=0;a<m;a++)
				{
					in.nextToken();
					arr[a]=(int)in.nval;
				}
				for(int a=0;a<m;a++)
				{
					in.nextToken();
					arr[a]-=in.nval;
				}
				Arrays.sort(arr);
				int shuchu=1;
				int max=0;
				for(int a=1;a<m;a++)
				{
					if(arr[a]==arr[a-1])shuchu++;
					else 
					{
						if(shuchu>max)max=shuchu;
						shuchu=1;
					}
				}
				if(shuchu>max)max=shuchu;
				out.println(max);
			}
			out.flush();
		}
		
	}

}
