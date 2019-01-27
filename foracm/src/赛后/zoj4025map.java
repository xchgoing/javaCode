package Èüºó;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class zoj4025map
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			while(n-->0)
			{
				int m=s.nextInt();
				String qwe=s.next();
				if(!(m%4==0||(m+1)%4==0))
				{
					out.println(-1);
					continue;
				}else
				{
					int[] arr=new int[m];
					if(m%4==0)
					{
						for(int a=0;a<m/2;a++)
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
								if(qwe.charAt(m-a-1)=='0')
								{
									arr[m-a-1]=1;
								}else
								{
									arr[m-a-1]=3;
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
								if(qwe.charAt(m-a-1)=='0')
								{
									arr[m-a-1]=2;
								}else
								{
									arr[m-a-1]=4;
								}
							}
						}
					}else
					{
						if(m==3)
						{
							if(qwe.charAt(0)=='0')
							{
								arr[0]=1;
							}else
							{
								arr[0]=3;
							}
							if(qwe.charAt(1)=='0')
							{
								arr[1]=1;
							}else
							{
								arr[1]=3;
							}
							if(qwe.charAt(2)=='0')
							{
								arr[2]=2;
							}else
							{
								arr[2]=4;
							}
							continue;
						}else
						{
							for(int a=0;a<(m-1)/2-1;a++)
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
									if(qwe.charAt(m-a-1)=='0')
									{
										arr[m-a-1]=1;
									}else
									{
										arr[m-a-1]=3;
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
									if(qwe.charAt(m-a-1)=='0')
									{
										arr[m-a-1]=2;
									}else
									{
										arr[m-a-1]=4;
									}
								}
							}
							if((arr[(m+1)/4-1]==1)||(arr[(m+1)/4-1]==3))
							{
								if(qwe.charAt((m+1)/2-1)=='0')
								{
									arr[(m+1)/2-1]=1;
								}else
								{
									arr[(m+1)/2-1]=3;
								}
								if(qwe.charAt((m+1)/2+1)=='0')
								{
									arr[(m+1)/2+1]=1;
								}else
								{
									arr[(m+1)/2+1]=3;
								}
								if(qwe.charAt((m+1)/4+2)=='0')
								{
									arr[(m+1)/4-1]=2;
								}else
								{
									arr[(m+1)/4-1]=4;
								}
								if(qwe.charAt((m+1)/4+2)=='0')
								{
									arr[(m-1)/2]=2;
								}else
								{
									arr[(m-1)/2]=4;
								}
							}else
							{
								if(qwe.charAt((m+1)/2-1)=='0')
								{
									arr[(m+1)/2-1]=2;
								}else
								{
									arr[(m+1)/2-1]=4;
								}
								if(qwe.charAt((m+1)/2+1)=='0')
								{
									arr[(m+1)/2+1]=2;
								}else
								{
									arr[(m+1)/2+1]=4;
								}
								if(qwe.charAt((m+1)/4+2)=='0')
								{
									arr[(m+1)/4-1]=1;
								}else
								{
									arr[(m+1)/4-1]=3;
								}
								if(qwe.charAt((m+1)/4+2)=='0')
								{
									arr[(m-1)/2]=1;
								}else
								{
									arr[(m-1)/2]=3;
								}
							}
						}
					}
						
					for(int a=0;a<m;a++)
					{
						out.print(arr[a]);
					}
					out.println();
				}
			}
		}
		out.flush();
	}

}
