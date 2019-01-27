package acm2018;

import java.util.Scanner;

public class a1969
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNext())
		{
			String n=new StringBuffer(s.next()).reverse().toString();
//			int a=Integer.parseInt(n.substring(n.indexOf("+")+1,n.length()));
//			int b=Integer.parseInt(n.substring(n.indexOf("=")+1, n.indexOf("+")));
//			int c=Integer.parseInt(n.substring(0,n.indexOf("=")));
			n=n.replace("+", "=");
			String[] arr=n.split("=");
			if(Integer.parseInt(arr[1])+Integer.parseInt(arr[2])==Integer.parseInt(arr[0]))
				System.out.println("True");
			else
				System.out.println("False");
			
			
			
		}
	

	}

}
