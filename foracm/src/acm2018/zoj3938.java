package acm2018;

import java.util.Scanner;

public class zoj3938
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			for(int a=0;a<n;a++)
			{
				int shishu=0;//显示的数字
				int[] arr=new int[5];//存按钮的数字和位子
				int[][] output=new int[5][2]; //存储输出记录
				shishu=s.nextInt();//显示的数字
				for(int b=1;b<5;b++)
				{
					arr[b]=s.nextInt();
				}
				if(shishu==1||shishu==2)//第一阶段
				{
					output[0][0]=2;output[0][1]=arr[2];
				}
				else if(shishu==3)
				{
					output[0][0]=3;output[0][1]=arr[3];
				}
				else if(shishu==4)
				{
					output[0][0]=4;output[0][1]=arr[4];
				}
				shishu=s.nextInt();//显示的数字
				for(int b=1;b<5;b++)
				{
					arr[b]=s.nextInt();
				}
				if(shishu==1)//第二阶段
				{
					for(int b=1;b<5;b++)
					{
						if(arr[b]==4)
						{
							output[1][0]=b;output[1][1]=4;
						}
					}
				}else if(shishu==2||shishu==4)
				{
					output[1][0]=output[0][0];output[1][1]=arr[output[0][0]];
				}else if(shishu==3)
				{
					output[1][0]=1;output[1][1]=arr[1];
				}
				shishu=s.nextInt();//显示的数字
				for(int b=1;b<5;b++)
				{
					arr[b]=s.nextInt();
				}
				if(shishu==1)//第三阶段
				{
					for(int c=1;c<5;c++)
					{
						if(arr[c]==output[1][1])
						{
							output[2][0]=c;output[2][1]=arr[c];
						}
					}
				}else if(shishu==2)
				{
					for(int c=1;c<5;c++)
					{
						if(arr[c]==output[0][1])
						{
							output[2][0]=c;output[2][1]=arr[c];
						}
					}
				}else if(shishu==3)
				{
					output[2][0]=3;output[2][1]=arr[3];
				}else if(shishu==4)
				{
					for(int b=1;b<5;b++)
					{
						if(arr[b]==4)
						{
							output[2][0]=b;output[2][1]=4;
						}
					}
				}
				shishu=s.nextInt();//显示的数字
				for(int b=1;b<5;b++)
				{
					arr[b]=s.nextInt();
				}
				if(shishu==1)//第四阶段
				{
					output[3][0]=output[0][0];output[3][1]=arr[output[0][0]];
				}else if(shishu==2)
				{
					output[3][0]=1;output[3][1]=arr[1];
				}else if(shishu==3||shishu==4)
				{
					output[3][0]=output[1][0];output[3][1]=arr[output[1][0]];
				}
				shishu=s.nextInt();//显示的数字
				for(int b=1;b<5;b++)
				{
					arr[b]=s.nextInt();
				}
				if(shishu==1)//第五阶段
				{
					for(int c=1;c<5;c++)
					{
						if(arr[c]==output[0][1])
						{
							output[4][0]=c;output[4][1]=arr[c];
						}
					}
				}else if(shishu==2)
				{
					for(int c=1;c<5;c++)
					{
						if(arr[c]==output[1][1])
						{
							output[4][0]=c;output[4][1]=arr[c];
						}
					}
				}else if(shishu==3)
				{
					for(int c=1;c<5;c++)
					{
						if(arr[c]==output[3][1])
						{
							output[4][0]=c;output[4][1]=arr[c];
						}
					}
				}else if(shishu==4)
				{
					for(int c=1;c<5;c++)
					{
						if(arr[c]==output[2][1])
						{
							output[4][0]=c;output[4][1]=arr[c];
						}
					}
				}
				for(int b=0;b<5;b++)
				{
					System.out.println(output[b][0]+" "+output[b][1]);
				}
			}
		}
	}
}
