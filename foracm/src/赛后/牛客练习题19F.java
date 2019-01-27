package 赛后;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Scanner;

public class 牛客练习题19F
{

	public static void main(String[] args) throws IOException
	{
		StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		while(in.nextToken()!=StreamTokenizer.TT_EOF)
		{
			int n=(int) in.nval;
			in.nextToken();
			int m=(int) in.nval;
			int[] arr=new int[n];
			for(int a=0;a<n;a++)
			{
				in.nextToken();
				arr[a]=(int) in.nval;
			}
			while(m-->0)
			{
				in.nextToken();
				int choise=(int) in.nval;
				if(choise==1)
				{
					in.nextToken();
					int v=(int) in.nval;
					in.nextToken();
					int x=(int) in.nval;
					arr[v-1]=x;
					
				}else if(choise==2)
				{
					in.nextToken();
					int temp=(int) in.nval;
					for(int a=0;a<n;a++)
					{
						arr[a]+=temp;
					}
					
				}else
				{
					in.nextToken();
					int output=(int) in.nval;
					out.println(arr[output-1]);
				}
			}
			out.flush();
		}
	}

}
