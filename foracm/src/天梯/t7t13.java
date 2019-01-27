package ÌìÌÝ;

import java.util.Arrays;
import java.util.Scanner;

public class t7t13
{
	static int[][][] arr;
	static int[][][] book;
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			int m=s.nextInt();
			int t=s.nextInt();
			int l=s.nextInt();
			arr=new int[t][n][m];
			book=new int[t][n][m];
			
			int count=0;
			for(int a=0;a<t;a++)
			{
				for(int c=0;c<n;c++)
				{
					for(int b=0;b<m;b++)
					{
						arr[a][c][b]=s.nextInt();
					}
				}
			}
//			for(int a=0;a<t;a++)
//			{
//				for(int b=0;b<n;b++)
//				{
//					System.out.println(Arrays.toString(arr[a][b]));
//				}
//			}
			for(int a=0;a<t;a++)
			{
				for(int b=0;b<m;b++)
				{
					for(int c=0;c<n;c++)
					{
						if(arr[a][c][b]==1&&book[a][c][b]==0)
						{
							int temp=fds(0,a,c,b);
//							System.out.println("************************"+temp);
							count=temp<l?count:count+temp;
						}
					}
				}
			}
			System.out.println(count);
			
		}
	}
	
	public static Integer fds(int count,int t,int x,int y)
	{
		if(arr[t][x][y]!=1)return count;
		book[t][x][y]=1;
		count++;
		if(x-1>=0&&book[t][x-1][y]!=1)
		{
			count=fds(count,t,x-1,y);
		}
		if(y-1>=0&&book[t][x][y-1]!=1)
		{
			count=fds(count,t,x,y-1);
		}
		if(x+1<arr[t].length&&book[t][x+1][y]!=1)
		{
			count=fds(count,t,x+1,y);
		}
		if(y+1<arr[t][0].length&&book[t][x][y+1]!=1)
		{
			count=fds(count,t,x,y+1);
		}
		if(t-1>=0&&book[t-1][x][y]!=1)
		{
			count=fds(count,t-1,x,y);
		}
		if(t+1<arr.length&&book[t+1][x][y]!=1)
		{
			count=fds(count,t+1,x,y);
		}
//		System.out.println("-----------------------"+count);
		return count;
	}
}
