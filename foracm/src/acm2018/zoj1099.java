package acm2018;

import java.util.Scanner;

public class zoj1099
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String input="";
		String temp="";
		boolean chose=false;
		int count=0;
		while(s.hasNext())
		{
			input=s.next();
			if(input.equals("<br>"))
			{
				if((!temp.equals("<br>"))&&(!temp.equals("<hr>")))
				{
					System.out.println();
				}
				System.out.println();
				count=0;
				chose=true;
			}else if(input.equals("<hr>"))
			{
				if((!temp.equals("<br>"))&&(!temp.equals("<hr>")))
				{
					System.out.println();
				}
				System.out.println("--------------------------------------------------------------------------------");
				count=0;
				chose=true;
			}else
			{
				if(chose)
				{
					System.out.print(input);
					count+=input.length();
					chose=false;
				}else
				{
					count+=(input.length()+1);
					if(count>80)
					{
						System.out.println();
						System.out.print(input);
						count=input.length();
					}else if(count<80)
					{
						System.out.print(" "+input);
					}else
					{
						System.out.print(" "+input);
						count=0;
						chose=true;
					}
				}
			}
			temp=input;
		}
	}

}