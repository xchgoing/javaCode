package acm2018;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.io.PrintWriter;
import java.io.StreamTokenizer;
public class zoj4014
{
	public static void main(String[] args) throws IOException
	{
		StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
//		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		int n,row,col,min,max,count,temp,b;
		while(in.nextToken()!=StreamTokenizer.TT_EOF)
		{
			
			n=(int) in.nval;in.nextToken();
//			for(a=0;a<n;a++)
			while(n-->0)
			{
				row=(int) in.nval;in.nextToken();
				col=(int) in.nval;in.nextToken();
				min=(int) in.nval;in.nextToken();
				max=(int) in.nval;in.nextToken();
				count=0;
				for(b=0;b<row*col;b++)
				{
					temp=(int)in.nval;in.nextToken();
					if(temp>max||temp<min)count++;
				}
				if(min>max)
				{
					System.out.println("No Solution");
					continue;
				}
				System.out.println(count);
			}
		}
	}
}