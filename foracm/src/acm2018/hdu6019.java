package acm2018;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.HashSet;
import java.util.Set;

public class hdu6019
{
	public static void main(String[] args) throws IOException
	{
		StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		while(in.nextToken()!=StreamTokenizer.TT_EOF)
		{
			int n=(int)in.nval;in.nextToken();
			while(n-->0)
			{
				Set set=new HashSet<Integer>();
				int a=(int)in.nval;in.nextToken();
				int count=0;
				int end=1;
				for(int i=0;i<a;i++)
				{
					int temp=(int)in.nval;in.nextToken();
					set.add(temp);
					if(count==set.size())
					{
						end++;
						set.clear();
						set.add(temp);
						count=1;
					}else
					{
						count++;
					}
				}
				System.out.println(end);
			}
			out.flush();
		}
	}
}
