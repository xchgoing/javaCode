package µÚÒ»³¡0122;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;
import java.util.HashSet;

public class J
{

	public static void main(String[] args) throws IOException
	{
		StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();
		int n=(int) in.nval;
		in.nextToken();
		int m=(int) in.nval;
		
		HashSet<Integer>[] sets=new HashSet[n+1]; 
		int[] arr=new int[n+1];
//		Arrays.fill(arr,0);
		while(m-->0)
		{
			in.nextToken();
			int opt=(int) in.nval;
			in.nextToken();
			int l=(int) in.nval;
			in.nextToken();
			int r=(int) in.nval;
			in.nextToken();
			int x=(int) in.nval;
			if(opt==1)
			{
				for(int a=l;a<=r;a++)
				{
					if(sets[a]==null)sets[a]=new HashSet<Integer>();
					if(sets[a].add(x))
					arr[a]^=x;
				}
			}else if(opt==2){
				for(int a=l;a<=r;a++)
				{
					if(sets[a]!=null&&sets[a].remove(x))
					arr[a]^=x;
				}
			}else
			{
				int result=0;
				for(int a=l;a<=r;a++)
				{
					result^=arr[a];
				}
				System.out.println(result);
			}
		}
	}
}
