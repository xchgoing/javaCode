import java.util.Scanner;
public class hdu2004
{
  public static void main(String[] args)
	{
		int a;
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			a=s.nextInt();
			if(a<=100&&a>=0)
			{
				if(a>=90)
				{
					System.out.println("A");
				}else if(a>=80)
				{
					System.out.println("B");
				}else if(a>=70)
				{
					System.out.println("C");
				}else if(a>=60)
				{
					System.out.println("D");
				}else
				{
					System.out.println("E");
				}
			}
			else
			{
				System.out.println("Score is error!");
			}
		}

	}

}
