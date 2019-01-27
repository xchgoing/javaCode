package workt;

import java.util.Scanner;

public class hedui
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		String[] qwe=new String[468];
		
			String temp;
			for(int a=0;a<467;a++)
			{temp=s.nextLine();
				while(temp.contains("~~"))
				{
					temp=temp.replaceAll("~~", "~");
				}
				String[] arr=temp.split("~");
				qwe[a]=arr[2].trim();
			}
			for(int a=0;a<468;a++)
			{temp=s.nextLine();
				if(!temp.trim().equals(qwe[a]))
				{
					System.err.println("err");
					break;
				}
			}
			
			
		
	}

}
