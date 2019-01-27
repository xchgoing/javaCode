package zuoye;

import java.util.Scanner;

public class y1124
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int a=(s.nextInt()-1)/3;
			switch(a)
			{
			   case 0:System.out.println("´º¼¾");break;
			   case 1:System.out.println("ÏÄ¼¾");break;
			   case 2:System.out.println("Çï¼¾");break;
			   case 3:System.out.println("¶¬¼¾");break;
			   default:
			   {
			     System.out.println("´óÔ¼ÔÚ¶¬¼¾");
			   }
			}
		}
	}

}
