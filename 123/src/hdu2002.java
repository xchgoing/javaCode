import java.util.Scanner;


public class hdu2002
{
	

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNext())
		{
			double v=0;
			double r=0;
			r=s.nextDouble();
			v=3.1415927*r*r*r*4/3;
			System.out.println(String.format("%.3f",v));
					
		}

	}

}
