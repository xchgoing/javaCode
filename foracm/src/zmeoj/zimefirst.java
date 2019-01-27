package zmeoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class zimefirst
{

	public static void main(String[] args) throws IOException
	{
		StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		while(in.nextToken()!=StreamTokenizer.TT_EOF)
		{
			int people=(int) in.nval;in.nextToken();
			int relation=(int) in.nval;in.nextToken();
			int select=(int) in.nval;in.nextToken();
			int[] arr=new int[people+1];
			for(int a=0;a<people+1;a++)
			{
				arr[a]=a;
			}
			for(int a=0;a<relation;a++)
			{
				int q=(int) in.nval;in.nextToken();
				int w=(int) in.nval;in.nextToken();
				int temp=arr[w];
				for(int b=0;b<people+1;b++)
				{
					if(arr[b]==temp)arr[b]=arr[q];
				}
			}
			for(int a=0;a<select;a++)
			{
				int q=(int) in.nval;in.nextToken();
				int w=(int) in.nval;in.nextToken();
				if(arr[q]==arr[w])out.println("Yes");
				else out.println("No");
			}
			out.flush();
		}
	}

}
