package ÌìÌÝ×Ü;
import java.util.Scanner;


public class L1L025
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNext())
		{
			String a=s.next();
			String b=s.nextLine().substring(1);
			int aa;
			int bb;
			try
			{
				aa=Integer.valueOf(a);
				a=String.valueOf(aa);
				if(aa<0)a="?";
			} catch (Exception e)
			{
				aa=-1;
				a="?";
			}
			try
			{
				bb=Integer.valueOf(b);
				b=String.valueOf(bb);
				if(bb<0)b="?";
			} catch (Exception e)
			{
				bb=-1;
				b="?";
			}
			String out=(bb==-1||aa==-1)?"?":String.valueOf(aa+bb);
			System.out.println(a+" + "+b+" = "+out);
		}
	}
}
