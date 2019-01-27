package zuoye;

public class zuoye9
{

	public static void main(String[] args)
	{
		for(int a=1000;a<1100;a++)
		{
			if(a%3==2&&a%5==4&&a%7==6)
			{
				System.out.println(a);
				break;
			}
		}
	}
}
