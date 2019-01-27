import java.util.Scanner;


public class hdu2018
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			if(n==0)
			{
				break;
			}
			System.out.println(f(n));
		}

	}
	public static int f (int n)
	{
		if(n==1)
		{
		  return 1;	
		}
		else if(n==2)
		{
			return 2;
		}
		else if(n==3)
		{
			return 3;
		}
		else
		{
			return f(n-1)+f(n-3);
		}
		
	}

}
