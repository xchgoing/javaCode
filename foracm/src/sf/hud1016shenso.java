package sf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class hud1016shenso
{
	static int[] arr;
	static int[] book;
	static List list=new ArrayList<Integer>(); 
	public static void main(String[] args) throws IOException
	{
		StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		int flag=1;
		loop:for(int a=1;a<40;a++)
		{
			for(int b=2;b<=(int)Math.sqrt(a);b++)
			{
				if(a%b==0)continue loop;
			}
			list.add(a);
		}
		while(in.nextToken()!=StreamTokenizer.TT_EOF)
		{
//			count=0;
			int q=(int)in.nval;in.nextToken();
			arr=new int[q];
			arr[0]=1;
			book=new int[q];
			dfs(1,arr,book);
			System.out.println("Case "+flag+":");
			flag++;
		}
	}
	public static void dfs(int step,int[] arr,int[] book)//因为第一个一定是1所以可以直接从第二个开始看
	{
		if(step==arr.length)
		{
			if(list.contains(arr[0]+arr[arr.length-1]))
			{
				for(int a=0;a<arr.length;a++)
				{
					if(a==0)System.out.print(arr[a]);
					else System.out.print(" "+arr[a]);
				}
				System.out.println();
			}
			else return;
		}
		for(int a=1;a<book.length;a++)
		{
			if(book[a]!=1)
			{
				if(list.contains(arr[step-1]+a+1))
				{
					arr[step]=a+1;
					book[a]=1;
					
					dfs(step+1,arr,book);
					
					book[a]=0;
				}
			}
		}
		return;
	}
}
