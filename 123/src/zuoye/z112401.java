package zuoye;

import java.util.Scanner;

public class z112401
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		loop:while(s.hasNext())
		{
			String shuru=s.next();
			String temp="";
			String shuchu="";
			for(int a=0;a<shuru.length();a++)
			{
				temp=temp+shuru.charAt(a);
				switch(temp)
				{
				    case "1":shuchu=shuchu+"A";temp="";break;
				    case "01":shuchu=shuchu+"B";temp="";break;
				    case "001":shuchu=shuchu+"C";temp="";break;
				    default:
				    {
				    	if(temp.length()>2)
				    	{
				    	   System.out.println(" ‰¥Ì¡À");continue loop;
				    	}
				    	else 
				    	{
				    	   continue;
				    	}
				    }
				}
			}
			System.out.println(shuchu);
		}
	}

}
