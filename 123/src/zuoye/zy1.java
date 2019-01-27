package zuoye;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class zy1
{

	public static void main(String[] args)
	{
		System.out.println("请输入一个一到十二位整数");
		Scanner s=new Scanner(new BufferedInputStream(System.in));
		while(s.hasNext())
		{
			String q=s.next();
			if(q.length()>12)
			{
				System.out.println("输入有误，请重新输入");
			}else
			{
				char[] qs=q.toCharArray();
				for(int a=0;a<q.length()/2;a++)
				{
					char w=qs[a];
					qs[a]=qs[q.length()-a-1];
					qs[q.length()-a-1]=w; 
				}
				String w=String.valueOf(qs);
				System.out.println("反转后为："+w);
				System.out.println("为"+q.length()+"位数");
			}
		}

	}

}
