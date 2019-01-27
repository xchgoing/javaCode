package hud;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class hdu2057
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(new BufferedInputStream(System.in));
		while(s.hasNext())
		{
			String a=s.next();
			String b=s.next();
			long q=Long.valueOf(a, 16)+Long.valueOf(b, 16);
			String w=Long.toString(q, 16).toUpperCase();
			System.out.println(w);
		}

	}

}
