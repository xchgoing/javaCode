package qimofuxi;

public class cfbiao
{
	public static void main(String[] args)
	{
		for(int a=1;a<10;a++)
		{
			for(int b=1;b<=a;b++)
			{
				System.out.printf(b+"*"+a+"=%-3d",a*b);
			}
			System.out.println();
		}
	}
}
