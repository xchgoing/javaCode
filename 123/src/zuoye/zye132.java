package zuoye;

import java.util.Scanner;

public class zye132
{

	public static void main(String[] args)
	{
		System.out.println("请输入你的18位身份证");
		Scanner s=new Scanner (System.in);
		while(s.hasNext())
		{
			String q=s.nextLine();
			if(q.length()!=18)
			{
				System.out.println("输入有误");
			}else
			{
				int a=Integer.valueOf(q.substring(15,16));
				if(a%2==0)
				{
					System.out.println("恭喜你是个女孩");
				}else
				{
					System.out.println("恭喜你是个男的");
				}
			}
		}
	}

}
