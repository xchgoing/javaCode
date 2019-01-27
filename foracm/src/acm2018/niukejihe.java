package acm2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;



public class niukejihe
{

	public static void main(String[] args) throws IOException 
	{
		StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		while(in.nextToken()!=StreamTokenizer.TT_EOF)
		{
			int n=(int) in.nval;in.nextToken();
			int m=(int) in.nval;in.nextToken();
			int[] arr=new int[n];
			for(int a=0;a<n;a++)
			{
				arr[a]=(int) in.nval;
				in.nextToken();
			}
			int[] arr1=new int[m];
			for(int a=0;a<m;a++)
			{
				arr1[a]=(int) in.nval;
				in.nextToken();
			}
				int b=0;
				int a=0;
				int count=0;
				while(b<n&&a<m)
				{
					if(arr[b]==arr1[a])
					{
						count++;
						if(count==1)
						{
							out.print(arr1[a]);
						}else
						{
							out.print(" "+arr1[a]);
						}
					}else if(arr[b]<arr1[a])
					{
						b++;
						a--;
					}
					a++;
				}
				if(count==0)
				{
					out.println("empty");
				}else
				{
					out.println();
				}
			}
		out.flush();
			
		}
	}
