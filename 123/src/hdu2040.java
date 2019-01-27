import java.util.Scanner;


public class hdu2040
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextDouble())
		{
			int q=s.nextInt();
			for(int w=0;w<q;w++)
			{
				int a=s.nextInt();
				int b=s.nextInt();
				double sum=sum(a);
				//System.out.println(sum+" "+b);
				if(sum!=b)//sum(a)==b
				{
					System.out.println("NO");
				}else
				{
				  if(sum(b)==a)System.out.println("YES");
				}
			}
		}

	}
	public static double sum(double a)
	{
		double sum=0;
		if(a%Math.sqrt(a)!=0)
		{
			for(int n=1;n<=Math.sqrt(a);n++)
			{
				if(a%n==0)
				{
					sum=sum+n+a/n;
				}
				//System.out.println(sum);
			}
			sum=sum-a;
		}else
		{
			for(int n=1;n<Math.sqrt(a);n++)
			{
				if(a%n==0)
				{
					sum=sum+n+a/n;
				}
				//System.out.println(sum);
			}
			sum=sum-a+Math.sqrt(a);
		}
		return sum;
	}

}
