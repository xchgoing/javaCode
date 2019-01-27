package zuoye;

import java.util.Scanner;

public class sushu
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int a=s.nextInt();
			int i=2;
			for(i=2;i<Math.sqrt(a);i++)
			{
				if(a%i==0)
				{
					System.out.println("·ñ");
					break;
				}
			}
			if(i>=Math.sqrt(a))
			{
				System.out.println("ÊÇ");
			}
		}
	}

}
