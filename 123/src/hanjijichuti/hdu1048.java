package hanjijichuti;

import java.util.Scanner;

public class hdu1048
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int count=0;
		while(s.hasNextLine())
		{
			String temp=s.nextLine();
			if(temp.equals("ENDOFINPUT"))break;
			else if(count!=0)System.out.println();
			count++;
			temp=s.nextLine();
			String[] arr=temp.split(" ");
			for(int a=0;a<arr.length;a++)
			{
				for(int b=0;b<arr[a].length();b++)
				{
					int order=arr[a].charAt(b)-5;
					if(order<60||order>85)order+=5;
					else if(order<65)order+=26;
					System.out.print((char)order);
				}
				if(a!=arr.length-1)
				{
					System.out.print(" ");
				}
			}
			temp=s.nextLine();
		}
	}

}
