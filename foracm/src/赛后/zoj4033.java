package Èüºó;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class zoj4033
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			while(n-->0)
			{
				int m=s.nextInt();
				String qwe=s.next();
				if(!(m%4==0||(m+1)%4==0))
				{
					System.out.println(-1);
				}else
				{
					int[] arr=new int[m];
					if(m%4==0)
					{
						for(int a=0;a<m;a++)
						{
							if(a%2==0)
							{
								if(qwe.charAt(a)=='0')
								{
									arr[a]=1;
								}else
								{
									arr[a]=3;
								}
								if(qwe.charAt(m-1-a)=='0')
								{
									arr[m-1-a]=1;
								}else
								{
									arr[m-1-a]=3;
								}
							}else
							{
								if(qwe.charAt(a)=='0')
								{
									arr[a]=2;
								}else
								{
									arr[a]=4;
								}
								if(qwe.charAt(m-1-a)=='0')
								{
									arr[m-1-a]=2;
								}else
								{
									arr[m-1-a]=4;
								}
							}
						}
					}else
					{
						for(int a=0;a<(m+1)/2-2;a++)
						{
							if(a%2==0)
							{
								if(qwe.charAt(a)=='0')
								{
									arr[a]=1;
								}else
								{
									arr[a]=3;
								}
								if(qwe.charAt(m-1-a)=='0')
								{
									arr[m-1-a]=1;
								}else
								{
									arr[m-1-a]=3;
								}
							}else
							{
								if(qwe.charAt(a)=='0')
								{
									arr[a]=2;
								}else
								{
									arr[a]=4;
								}
								if(qwe.charAt(m-1-a)=='0')
								{
									arr[m-1-a]=2;
								}else
								{
									arr[m-1-a]=4;
								}
							}
						}
						if(arr[(m+1)/4-1]==1||arr[(m+1)/4-1]==3)
						{
							if(qwe.charAt((m+1)/2-2)=='0')
							{
								arr[(m+1)/2-2]=1;
							}else
							{
								arr[(m+1)/2-2]=3;
							}
						}else
						{
							if(qwe.charAt((m+1)/2-2)=='0')
							{
								arr[(m+1)/2-2]=2;
							}else
							{
								arr[(m+1)/2-2]=4 ;
							}
						}
					}
				}
			}
		}
	}
}
