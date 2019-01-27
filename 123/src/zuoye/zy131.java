package zuoye;

import java.util.Scanner;

public class zy131
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("如下4行中有你的生日就输入1没有的就输入0");
		System.out.println("羊猴鸡猪狗");
		System.out.println("兔龙蛇马猪");
		System.out.println("牛虎蛇马鸡狗");
		System.out.println("鼠虎龙马猴狗");
		while(s.hasNext())
		{
			String q=s.next();
			String[] arr={"鼠","牛","虎","兔","龙","蛇","马","羊","猴","鸡","狗","猪"};
			if(Integer.parseInt(q, 2)<1||Integer.parseInt(q, 2)>12)
			{
				System.out.println("别逗我");
			}
			System.out.println("你属"+arr[Integer.parseInt(q, 2)-1]);
		}
	}

}
