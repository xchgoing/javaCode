package zuoye;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class zy
{

	public static void main(String[] args)
	{
		System.out.println("请输入一个一到十二位的数字");
		Scanner s=new Scanner( new BufferedInputStream(System.in));
		while(s.hasNext())
		{
			String q=s.next();
			if(q.length()>12)
			{
				System.out.println("输入有误，请重新输入");
			}else
			{
				StringBuffer  w=new StringBuffer(q);
				w=w.reverse();
				System.out.println("反转后为："+w);
				System.out.println("为"+q.length()+"位数");
			}
		}
    }

}
