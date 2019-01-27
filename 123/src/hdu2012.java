import java.util.Scanner;


public class hdu2012
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		double a=0,b=0;
		while(s.hasNextDouble())
		{
			a=s.nextDouble();
			b=s.nextDouble();
			if(a==0&&b==0)
			{
				break;
			}
			if(a>b)
			{
				double c=a;
				a=b;
				b=c;
			}
			int x=(int)a;
			int y=(int)b;
			if(x-a<0)
			{
				x=x+1;
			}
			if(y-b>0)
			{
				y=y-1;
			}
			if(-39>x||y>50)
			{
				break;
			}
			System.out.println(shifouyouss(x,y));
		}

	}
	public static String shifouyouss(int x,int y)
	{
		int count=0;
		for(int q=x;q<=y;q++)
		{
			int shu=q*q+q+41;
			for(int w=2;w<=Math.sqrt(shu);w++)
			{
				if(shu%w==0)
				{
					count++;
				}
			}
			
		}
		return count==0?"OK":"Sorry";
	}

}
