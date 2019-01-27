package acm2018;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class f2012
{

	public static void main(String[] args) throws IOException
	{
		StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		while(in.nextToken()!=StreamTokenizer.TT_EOF)
		{
			int n=(int) in.nval;in.nextToken();
			for(int a=0;a<n;a++)
			{
				Map map=new HashMap<String,ArrayList<String>>();
				int boy=(int) in.nval;in.nextToken();

				
				int girl=(int) in.nval;in.nextToken();
				int party=(int) in.nval;in.nextToken();
				for(int b=0;b<boy+girl;b++)
				{
					String name=in.sval;in.nextToken();
					int people=(int) in.nval;in.nextToken();
					List<String> temp=new ArrayList();
					for(int c=0;c<people;c++)
					{
						temp.add(in.sval);in.nextToken();
					}
					map.put(name, temp);
				}
				for(int i=0;i<party;i++)
				{
					int pp=(int) in.nval;in.nextToken();
					String[] arr=new String[pp];
					List<String> list=new ArrayList();
					for(int b=0;b<pp;b++)
					{
						arr[b]=in.sval;in.nextToken();
						list.add(arr[b]);
					}
					for(int b=0;b<arr.length;b++)
					{
						for(int c=0;c<arr.length;c++)
						{
							if(b==c)continue;
							ArrayList<String> temp=(ArrayList<String>) map.get(arr[b]);
							if(!temp.contains(arr[c]))
							{
								list.remove(arr[b]);
							}
							temp=(ArrayList<String>) map.get(arr[c]);
							if(!temp.contains(arr[b]))
							{
								list.remove(arr[c]);
							}
							if(list.isEmpty())
							{
								break;
							}
						}
						if(list.isEmpty())
						{
							out.println(0);
							break;
						}
					}
					if(!list.isEmpty())
					{
						out.println("1 "+list.get(0));
					}
				}
				out.println();
			}
		}
	}

}
