package ÌìÌİ11ÔÂ;

import java.util.Scanner;

public class t7t1
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextLine())
		{
			String input = s.nextLine();
			double l=input.length();
			l=l-input.replace("2", "").length();
			if(input.startsWith("-"))
			{
				l=l/(input.length()-1)*1.5*100;
			}else
			{
				l=l/input.length()*100;
			}
			if(Integer.valueOf(input.substring(input.length()-1))%2==0)
			{
				l*=2;
			}
			System.out.println(String.format("%.2f%%",l));
		}
	}

}
