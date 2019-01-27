package qimofuxi;

public class sxhs
{
	public static void main(String[] args)
	{
		for(int a=100;a<1000;a++)
		{
			int g=a%10;
			int s=a%100/10;
			int b=a/100;
			if(g*g*g+s*s*s+b*b*b==a)
			{
				System.out.println(a);
			}
		}
	}
}
