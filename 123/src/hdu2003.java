import java.util.Scanner;


public class hdu2003
{

	public static void main(String[] args)
	{
		double a;
		Scanner s=new Scanner(System.in);
		while(s.hasNextDouble())
		{
			a=s.nextDouble();
			if(a<0)
			{
				System.out.println(String.format("%.2f",-a));
			}
			else
			{
				System.out.println(String.format("%.2f",a));
				
			}
		}

	}

}
