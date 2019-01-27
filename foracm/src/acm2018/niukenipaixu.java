package acm2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;
import java.util.Scanner;

public class niukenipaixu
{

	public static void main(String[] args) throws IOException
	{
		StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		while(in.nextToken()!=StreamTokenizer.TT_EOF)
		{
			int n=(int) in.nval;
            in.nextToken();
			int[] arr=new int[n];
			int count=0;
			for(int a=0;a<n;a++)
			{
				arr[a]=(int) in.nval;
	            in.nextToken();
			}
			for(int a=0;a<n-1;a++)
			{
				for(int b=0;b<n-1;b++)
				{
					if(arr[b]>arr[b+1])
					{
						arr[b]+=arr[b+1];
						arr[b+1]=arr[b]-arr[b+1];
						arr[b]-=arr[b+1];
						count++;
					}
				}
			}
			System.out.println(count);
		}
		out.flush();
	}

}
