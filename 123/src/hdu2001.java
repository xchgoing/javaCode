import java.util.Scanner;


public class hdu2001
{

	public static void main(String[] args)
	{
		double x1;
		double y1;
		double x2;
		double y2;
		double d;
		Scanner s=new Scanner (System.in);
		while(s.hasNextDouble())
		{
			x1=s.nextDouble();
			y1=s.nextDouble();
			x2=s.nextDouble();
			y2=s.nextDouble();
			d=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
			System.out.println(String.format("%.2f",d));
					
			
		}

	}

}
