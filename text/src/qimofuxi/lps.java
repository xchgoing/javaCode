package qimofuxi;

public class lps
{
	public static void main(String[] args)
	{
		for(int a=1000;a<10000;a++)
		{
			int q=a%100;
			int w=a/100;
			if((q+w)*(q+w)==a)
			{
				System.out.println(a);
			}
		}
	}
}
