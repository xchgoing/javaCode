package zuoye;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class zyy
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (new BufferedInputStream(System.in));
		System.out.println("请输入你的成绩（0——100）");
		while(s.hasNextInt())
		{
			int a=s.nextInt();
			if(a<0||a>100)
			{
				System.out.println("你的分数输入有误，请重新输入。");
			}else if(a>=90)
			{
				System.out.println("你的等级是：A");
				System.out.println("请继续保持");
			}else if(a>=80)
			{
				System.out.println("你的等级是：B");
				System.out.println("请继续努力A在向你招手");
			}else if(a>=70)
			{
				System.out.println("你的等级是：C");
				System.out.println("成绩欠佳，要学习注意方法了");
			}else if(a>=60)
			{
				System.out.println("你的等级是：D");
				System.out.println("警报范围，小心变成E");
			}else
			{
				System.out.println("你的等级是：E");
				System.out.println("我都不好意思说你了");
			}
		}
	}

}
