import java.util.Scanner;


public class hdu2007
{

	public static void main(String[] args)
	{
		int a,b;
		Scanner s=new Scanner(System.in);
		int asum=0;int bsum=0;
		while(s.hasNextInt())
		{
			a=s.nextInt();
			b=s.nextInt();
			if(a>b)
			{
				int z=a;
				a=b;
				b=z;
			}
			for(int q=a;q<=b;q++)
			{
				if(q%2==1) 
				{
					asum=asum+q*q*q;
					//System.out.println(asum);
				}else
				{
					bsum=bsum+q*q;
					//System.out.println(bsum);
				}
			}System.out.println(bsum+" "+asum);
			bsum=0;
			asum=0;
		}
	}

}
