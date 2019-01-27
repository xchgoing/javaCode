package zuoye;

public class jishuhe
{

	public static void main(String[] args)
	{
		int sum=0;
		for(int a=0;a<=100;a++)
		{
			if(a%2==0)continue;
			sum+=a;
		}
		System.out.println(sum);
	}

}
