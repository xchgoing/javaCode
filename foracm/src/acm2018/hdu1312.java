package acm2018;

import java.util.Arrays;
import java.util.Scanner;


public class hdu1312
{
	static int min;;
	static int[][] book;
	static String[][] arr;
	static int q;
	static int w;
	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			q=s.nextInt();
			w=s.nextInt();
			min=q*w;
			arr=new String[w][q];
			book=new int[w][q];
//			Arrays.fill(book, 0);
			book[0][0]=1;
			for(int a=0;a<w;a++)
			{
				String temp=s.next();
				for(int b=0;b<temp.length();b++)
				{
//					System.out.println(arr[a][b]=temp.substring(b, b+1));
					arr[a][b]=temp.substring(b, b+1);
				}
			}
			for(int a=0;a<arr.length;a++)
			{
				System.out.println(Arrays.toString(arr[a]));
			}
			for(int a=0;a<book.length;a++)
			{
				System.out.println(Arrays.toString(book[a]));
			}
			dfs(0,0,1);
			System.out.println(min);
			
		}
	}
	public static void dfs(int q1,int w1,int count)
	{
		if(arr[q1][w1].equals("@"))
		{
			
			if(min>count)min=count;
			return;
		}
		if(count>=min)
		{
			System.out.println("return 2");
			return;
		}
		System.out.println(q1+"   "+w1+"    "+count+"----"+arr[q1][w1]);
		if(w1+1<q&&(!arr[q1][w1+1].equals("#"))&&book[q1][w1+1]==0)
		{
			book[q1][w1+1]=1;
			dfs(q1,w1+1,count+1);
			book[q1][w1+1]=0;
		}
		if(w1-1>=0&&(!arr[q1][w1-1].equals("#"))&&book[q1][w1-1]==0)
		{
			book[q1][w1-1]=1;
			dfs(q1,w1-1,count+1);
			book[q1][w1-1]=0;
		}
		if(q1+1<w&&(!arr[q1+1][w1].equals("#"))&&book[q1+1][w1]==0)
		{
			book[q1+1][w1]=1;
			dfs(q1+1,w1,count+1);
			book[q1+1][w1]=0;
		}
		if(q1-1>=0&&(!arr[q1-1][w1].equals("#"))&&book[q1-1][w1]==0)
		{
			book[q1-1][w1]=1;
			dfs(q1-1,w1,count+1);
			book[q1-1][w1]=0;
		}
		return;
	}

}
