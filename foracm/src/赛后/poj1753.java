package 赛后;

import java.util.Arrays;
import java.util.Scanner;

public class poj1753
{
	static int min=0;
	static int[][] arr=new int[4][4];
	static int[][] book=new int[4][4];
	static int x=0;
	static int y=0;
	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNext())
		{
			for(int a=0;a<4;a++)
			{
				Arrays.fill(arr[a],0);
			}
			min=0;
			x=0;
			y=0;
			for(int a=0;a<4;a++)
			{
				String temp=s.nextLine();
				for(int b=0;b<4;b++)
				{
					arr[a][b]=temp.substring(b, b+1).equals("w")?-1:1;
				}
			}
			//存入数组完毕
			dfs(1);
			System.out.println(min==0?"Impossible":min);
			System.out.println("over");
//			System.out.println(x+"  "+y);
			
		}
	}
	public static void go()
	{
		if(y<3)y++;
		else x++;
	}
	public static void back()
	{
		if(y>0)y--;
		else x--;
	}
	public static void change()
	{
		arr[x][y]=0-arr[x][y];
		if(y<3)
		{
			arr[x][y+1]=0-arr[x][y+1];
		}
		if(y>0)
		{
			arr[x][y-1]=0-arr[x][y-1];
		}
		if(x<3)
		{
			arr[x+1][y]=0-arr[x+1][y];
		}
		if(x>0)
		{
			arr[x-1][y]=0-arr[x-1][y];
		}
	}
	public static void dfs(int count)//深搜
	{
		if(count==6)
		{
//			System.out.println("------------------------------------------------");
//			System.out.println(Arrays.deepToString(arr));
//			System.out.println("------------------------------------------------");
			back();
			return;
		}
		while(true)
		{
			go();
			if(y==4||x==4)
			{
//				System.out.println("break;"+x+"  "+y);
				break;
			}
			change();
			if(cheak())
			{
				min=count;
				back();
				return;
			}else
			{
				dfs(++count);
			}
			change();
			count--;
		}
		back();
		return;
		
		
	}
	public static boolean cheak()
	{
		int sum=0;
		for(int a=0;a<4;a++)
		{
			for(int b=0;b<4;b++)
			{
				sum+=arr[a][b];
			}
		}
		return sum==16||sum==-16?true:false;
	}
}
