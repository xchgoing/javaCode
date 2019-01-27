package zmeoj;

import java.util.LinkedList;
import java.util.Scanner;

public class LL
{

	public static void main(String[] args)
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		
		
		list.remove();//移除第一个元素
		list.remove(0);//移除并返回那个元素
		list.remove("9");//移除指定项返回true或false
		
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int q=s.nextInt();
			int w=s.nextInt();
			while(w-->0)
			{
				
			}
		}
	}

}
