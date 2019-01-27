package zuoye;

import java.util.Scanner;

public class zuoye7
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		try
		{
			while(true)
			{
				int temp=s.nextInt();
				if(temp<0||temp>100)
				{
					System.out.println("输入错误,请重新输入");
					continue;
				}
				temp=temp/10;
				switch(temp)
				{
				   case 10:
				   case 9:System.out.println("你的成绩是"+"A"+"继续保持");break;
				   case 8:System.out.println("你的成绩是"+"B"+"加把油快到A了");break;
				   case 7:System.out.println("你的成绩是"+"C"+"你不够努力啊");break;
				   case 6:System.out.println("你的成绩是"+"D"+"别浪了，船要翻了");break;
				   default:System.out.println("你的成绩是"+"E"+"自己面壁");
				}
			}
		}	
		catch(Exception ex)
		{
			System.out.println("哥别逗我");
			String temp=s.next();
		}
			
	}
}


