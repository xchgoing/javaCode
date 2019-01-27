package acm2018;

import java.util.Scanner;

public class zoj1969
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNext())
		{
			String q=s.next();
			q=q.replace("+","=");
			String[] arr=q.split("=");
			
//			StringBuffer w=new StringBuffer(arr[0]);
//			int a=Integer.parseInt(w.reverse().toString());
//			
//			StringBuffer e=new StringBuffer(arr[1]);
//			int b=Integer.parseInt(e.reverse().toString());
//			
//			StringBuffer r=new StringBuffer(arr[2]);
//			int c=Integer.parseInt(r.reverse().toString());
			
			if(qwe(arr[0])+qwe(arr[1])==qwe(arr[2]))
			{
				System.out.println("True");
			}else
			{
				System.out.println("False");
			}
		}
	}
	public static int qwe(String q)
	{
		StringBuffer w=new StringBuffer(q);
		int e=Integer.parseInt(w.reverse().toString());
		return e;
	}

}
