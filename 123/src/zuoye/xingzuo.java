package zuoye;

import java.util.Scanner;

public class xingzuo
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNext())
		{
			String id=s.next();
			if(check(id))
			{
				String subid=id.substring(10,14);
				int day=Integer.parseInt(subid);
				if(day>=321&&day<=419)
				{
					System.out.println("°×Ñò×ù");
				}else if(day>=420&&day<=520)
				{
					System.out.println("½ğÅ£×ù");
				}else if(day>=521&&day<=621)
				{
					System.out.println("Ë«×Ó×ù");
				}else if(day>=622&&day<=722)
				{
					System.out.println("¾ŞĞ·×ù");
				}
				else if(day>=723&&day<=822)
				{
					System.out.println("Ê¨×Ó×ù");
				}else if(day>=823&&day<=922)
				{
					System.out.println("´¦Å®×ù");
				}else if(day>=923&&day<=1023)
				{
					System.out.println("Ìì³Ó×ù");
				}else if(day>=1024&&day<=1122)
				{
					System.out.println("ÌìĞ«×ù");
				}else if(day>=1123&&day<=1221)
				{
					System.out.println("ÉäÊÖ×ù");
				}else if(day>=1222||day<=119)
				{
					System.out.println("Ä¦ôÉ×ù");
				}else if(day>=120&&day<=218)
				{
					System.out.println("Ë®Æ¿×ù");
				}else if(day>=219&&day<=320)
				{
					System.out.println("Ë«Óã×ù");
				}
			}
		}
	}
	public static boolean check(String id)
	{
		id=id.toLowerCase();
		if(id.length()!=18)
		{
			return false;
		}else
		{
			for(int a=0;a<18;a++)
			{
				if(a<17)
				{
					if(id.charAt(a)<'0'||id.charAt(a)>'9')
					{
						return false;
					}
				}else
				{
					if(id.charAt(a)<'0'||id.charAt(a)>'9'||id.charAt(a)!='x')
					{
						return false;
					}
				}
			}
		}
		return true;
	}
}
