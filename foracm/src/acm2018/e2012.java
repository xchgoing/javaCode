package acm2018;

import java.util.Arrays;
import java.util.Scanner;
public class e2012
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			for(int a=0;a<n;a++)
			{
				int m=s.nextInt();
				char[] arr=new char[12];//用于存字母
				int[] arr2=new int[12];//用于存次数
				String q=s.next();
				for(int c=0;c<12;c++)//存入字母
				{
					arr[c]=q.charAt(c);
				}
				Arrays.sort(arr);//因为要字母顺序输出所以先排序
				for(int b=0;b<m-1;b++)//字符串的循环
				{
					q=s.next();//存字符串
					for(int c=0;c<12;c++)//用于q的截取
					{
						for(int d=0;d<12;d++)//用于arr的循环
						{
							if(arr[d]==q.charAt(c)&&arr2[d]==b)//比较并且只有之前一直在重复而且本次没有被加过的才可以次数加一
							{
								arr2[d]++;//次数加一
								break;
							}
						}
					}
				}
				for(int c=0;c<12;c++)//遍历数组找出重复的并输出
				{
					if(arr2[c]==m-1)
					{
						System.out.print(arr[c]);
					}
				}
				System.out.println();
			}
		}
	}
}
//按字典顺序输出
//注意
//输入：AAAAAABBBBBB
//   BBBBBBBBBBBB
//输出：BBBBBB
//的情况
