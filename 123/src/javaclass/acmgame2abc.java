package javaclass;

import java.util.Arrays;
import java.util.Scanner;

public class acmgame2abc
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextLine())
		{
			int[] arr=new int [26];
			String q="";
			for(int a=0;a<4;a++)
			{
				q=q+s.nextLine();
			}
			for(int a=0;a<q.length();a++)
			{
				for(int v=0;v<26;v++)
				{
					if((int)q.charAt(a)-65==v)
					{
						arr[v]++;
					}
				}
			}
			int max=0;
			for(int a=0;a<26;a++)
			{
				if(arr[a]>max)
				{
					max=arr[a];
				}
			}
			String[][] arr1=new String[max][26];
			for(int a=max-1;a>=0;a--)
			{
				for(int v=0;v<26;v++)
				{
					if(arr[v]!=0)
					{
						arr1[a][v]="*";
						arr[v]-=1;
					}else
					{
						arr1[a][v]=" ";
					}
				}
			}
			for(int a=0;a<max;a++)
			{
				for(int v=25;v>=0;v--)
				{
					if(arr1[a][v].equals("*"))
					{
						for(int c=0;c<=v;c++)
						{
							if(c==0)
							{
								System.out.print(arr1[a][c]);
							}else
							{
								System.out.print(" "+arr1[a][c]);
							}
						}
						System.out.println();
						break;
					}
				}
			}
			for(int a=0;a<26;a++)
			{
				if(a==0)
				{
					System.out.print((char)(a+65));
				}else
				{
					System.out.print(" "+(char)(a+65));
				}
			}
			System.out.println();
		}
	}

}
