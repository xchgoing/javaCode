import java.util.Scanner;


public class hdu2090
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		double sum=0;
		while(s.hasNext())
		{
			String q=s.next();
			s.hasNextDouble();
			double w=s.nextDouble();
			double e=s.nextDouble();
			sum+=w*e;
		}
	}

}
