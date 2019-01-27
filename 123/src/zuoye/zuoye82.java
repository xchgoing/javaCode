package zuoye;

public class zuoye82
{

	public static void main(String[] args)
	{
		for(int a=100;a<1000;a++)
		{
			int ge=a%10;
			int shi=a%100/10;
			int bai=a/100;
			if(ge*ge*ge+shi*shi*shi+bai*bai*bai==a)
			{
				System.out.println(a);
			}
		}
	}
}
