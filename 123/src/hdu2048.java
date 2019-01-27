import java.io.BufferedInputStream;
import java.math.BigDecimal;
import java.util.Scanner;


public class hdu2048
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(new BufferedInputStream(System.in));
		while(s.hasNextInt())
		{
			int q=s.nextInt();
			for(int w=0;w<q;w++)
			{
				int n=s.nextInt();
				double jg;
				if(n==2)
				{
					jg=50;
				}else
				{
					double arr[]=new double[n];
					arr[0]=0;
					arr[1]=50;
					for(int a=2;a<n;a++)
					{
						arr[a]=100*((jc(a)*(arr[a-1]*0.01))*(a))/jc(a+1);
					}
					jg=arr[n-1];
				}
				System.out.println(String.format("%.2f",jg)+"%");
			}
		}

	}
	
	public static int jc(int n)
	{
		int sum=1;
		for(int a=1;a<=n;a++)
		{
			sum=sum*a;
		}
		return sum;
	}

}
