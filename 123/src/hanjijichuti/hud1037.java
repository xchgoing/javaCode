package hanjijichuti;

import java.util.Scanner;

public class hud1037
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			for(int a=0;a<3;a++)
			{
				int temp=s.nextInt();
				if(temp<168)
				{
					System.out.println("CRASH "+temp);
					break;
				}
			}
		}
	}

}
