import java.util.Scanner;


public class hdu2008
{

	public static void main(String[] args)
	{
		int gs;
		double zhi;
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int a=0;
			int b=0;
			int c=0;
			gs=s.nextInt();
			if(gs==0||gs>=100)
			{
				break;
			}
			for(int q=0;q<gs;q++)
			{
				zhi=s.nextDouble();
				if(zhi<0)
				{
					a++;
				}
				if(zhi==0)
				{
					b++;
				}
				if(zhi>0)
				{
					c++;
				}
			}
			System.out.println(a+" "+b+" "+c);
			
		}

	}

}
