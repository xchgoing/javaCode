package hud;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class hdu2051
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(new BufferedInputStream(System.in));
		while(s.hasNextInt())
		{
			int a=s.nextInt();
			System.out.println(Integer.toString(a, 2));
		}
		
	}

}
