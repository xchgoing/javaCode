import java.util.Scanner;


public class hdu2042
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			for(int b=0;b<n;b++)
			{
				int a=s.nextInt();
				System.out.println(sl(a));
			}
		}

	}
	public static int sl(int a)
	{
		int s;
		if(a==0)return 3;
		else
		{
			s=(sl(a-1)-1)*2;
			return s;
		}
	}

}
