package acm2018;

import java.util.Scanner;

public class a2012
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();//用n来存储测试的组数
			for(int a=0;a<n;a++)//用for循环来控制测试组数
			{
				s.next();//跳过第一个名字
				String q=s.next();//用q来存储第二个名字
				s.next();//条过第三个单词
				System.out.println(q+" will survive");//按格式输出答案
			}
		}
	}
}
