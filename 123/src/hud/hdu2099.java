package hud;

import java.util.Scanner;

public class hdu2099
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int a=s.nextInt()*100;
			int b=s.nextInt();
			if(a==0&&b==0)break;
			String q="";
			for(int n=0;n<100;n++)
			{
				int w=a+n;
				if(w%b==0)
				{
					q=q+" "+String.valueOf(w).substring(String.valueOf(w).length()-2,String.valueOf(w).length());
					//System.out.println(q);
				}
			}
			System.out.println(q.trim());
		}
	}

}
