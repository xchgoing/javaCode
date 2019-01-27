import java.util.Scanner;


public class hdu2011
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int cishu=0;
			cishu=s.nextInt();
			if(cishu>=100||cishu<=0)
			{
				break;
			}
			for(int a=0;a<cishu;a++)
			{
				double sum=0;
				double z=0;
				int n=s.nextInt();
				for(double b=0;b<n;b++)
				{
					z=Math.pow(-1,b)*(1/(b+1));
					sum=sum+z;
					//System.out.println(z);
				}
				System.out.println(String.format("%.2f",sum));
			}
		}

	}

}
