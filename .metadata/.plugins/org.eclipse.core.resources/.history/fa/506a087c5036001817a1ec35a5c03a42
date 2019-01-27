package acm2018;

import java.util.Arrays;
import java.util.Scanner;

public class zoj3944
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			for(int a=0;a<n;a++)
			{
				int count=0;
				int h=s.nextInt();
				int w=s.nextInt();
				String[][] arr=new String[h+4][w+4];
				String temp="";
				String[][] mb={{"-","O","-"},{"/","|","\\"},{"(","-",")"}};
				for(int b=0;b<h;b++)
				{
					temp+=s.next();
				}
				int sub=0;
				for(int b=0;b<arr.length;b++)
				{
					for(int c=0;c<arr[b].length;c++)
					{
						if(b<2||c<2||b>arr.length-3||c>arr[0].length-3)
						{
							arr[b][c]="*";
						}else
						{
							arr[b][c]=temp.substring(sub,sub+1);
							sub++;
						}
					}
				}
				for(int b=0;b<arr.length-2;b++)
				{
					for(int c=0;c<arr[b].length-2;c++)
					{
//						System.out.println();
						if(bidui(arr,mb,b,c))count++;
					}
				}
				System.out.println(count);
			}
		}
	}
	public static boolean bidui(String[][] arr,String[][] mb,int b,int c)
	{
		for(int i=0;i<3;i++)
		{
			for (int j = 0; j < 3; j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		for(int a=0;a<3;a++)
		{
			for(int i=0;i<3;i++)
			{
				if(arr[b+a][c+i].equals(mb[a][i]))
				{
					return true;
				}
			}
//			System.out.println();
		}
		return false;
	}

}
