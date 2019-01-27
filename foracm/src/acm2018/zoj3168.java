package acm2018;

import java.util.Scanner;

public class zoj3168
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNext())
		{
			String q=s.nextLine();
			String out="";
			int l=q.length();
			q=q.replace("Z","");
			out=add(out,"Z",l-q.length());
			l=q.length();
			q=q.replace("O","");
			out=add(out,"O",l-q.length());
			l=q.length();
			q=q.replace("J","");
			out=add(out,"J",l-q.length());
			l=q.length();
			q=q.replace("7","");
			out=add(out,"7",l-q.length());
			out+=q;
			System.out.println(out);
		}
	}
	public static String  add(String out,String re,int count) 
	{
		for(int a=0;a<count;a++)
		{
			out+=re;
		}
		return out;
	}
}
