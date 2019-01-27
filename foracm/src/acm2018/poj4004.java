package acm2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;
import java.util.Scanner;

public class poj4004
{

	public static void main(String[] args) throws IOException
	{
		StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		while(in.nextToken()!=StreamTokenizer.TT_EOF)
		{
			int q=(int) in.nval;
			in.nextToken();
			for(int a=0;a<q;a++)
			{
				int n=(int) in.nval;
				in.nextToken();
				int[] arr=new int[n];
				int m=(int) in.nval;
				in.nextToken();
				for(int b=0;b<n;b++)
				{
					arr[b]=(int) in.nval;
					in.nextToken();
				}
				Arrays.sort(arr);
				long sum=0;
				for(int b=0;b<m;b++)
				{
					sum+=arr[b]*arr[2*m-1-b];
				}
				System.out.println(sum);
				out.flush();
			}
		}
	}
}
