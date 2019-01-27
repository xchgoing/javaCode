package acm2018;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;


public class zoj3959
{

	public static void main(String[] args) throws IOException
	{
		StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		while(in.nextToken()!=StreamTokenizer.TT_EOF)
		{
			double n=(int)in.nval;
			in.nextToken();
			for(int a=0;a<n;a++)
			{
				int m=(int)in.nval;
				in.nextToken();
				if(m<10||m>13)
				{
					System.out.println("No");
					int[] arr=new int[m];
					for(int b=0;b<m;b++)
					{
						arr[b]=(int)in.nval;in.nextToken();
					}
				}else
				{
					int[] arr=new int[m];
					for(int b=0;b<m;b++)
					{
						arr[b]=(int)in.nval;in.nextToken();
					}
					Arrays.sort(arr);
					if(arr[0]==arr[1]&&arr[0]==1)
					{
						int b=0;
						for(b=2;b<m-1;b++)
						{
							if(Math.abs(arr[b]-arr[b-1])>2)
							{
								System.out.println("No");
								break;
							}
						}
						if(b==m-1)System.out.println("Yes");
					}else
					{
						System.out.println("No");
					}
				}
			}
		}
		out.flush();
	}

}
