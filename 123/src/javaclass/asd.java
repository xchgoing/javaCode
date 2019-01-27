package javaclass;

public class asd
{

	public static void main(String[] args)
	{
		for(int a=100;a<1000;a++)
		{
			int b=a/100;
			int s=a%100/10;
			int g=a%10;
			if(a==b*b*b+s*s*s+g*g*g)
			{
				System.out.println(a);
			}
		}
	}

}
