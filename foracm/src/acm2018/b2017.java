package acm2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;
import java.util.Scanner;

public class b2017
{

	public static void main(String[] args) throws IOException
	{
		StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		while(in.nextToken()!=StreamTokenizer.TT_EOF)
		{
			int n=(int) in.nval;
			in.nextToken();
			for(int a=0;a<n;a++)
			{
				int m=(int) in.nval;
				in.nextToken();
				int[] arr=new int[m];
				for(int b=0;b<m;b++)
				{
					arr[b]=(int) in.nval;
					in.nextToken();
				}
				if(m<10||m>13)
				{
					System.out.println("No");
					continue;
				}
				Arrays.sort(arr);
				if(arr[0]!=1||arr[1]!=1)
				{
					System.out.println("No");
					continue;
				}
				String end="Yes";
				for(int b=2;b<m-1;b++)
				{
					if(arr[b]-arr[b-1]>2)
					{
						end="No";
						break;
					}
				}
				System.out.println(end);
			}
					
		}
		out.flush();
	}

}
