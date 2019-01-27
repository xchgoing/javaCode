import java.util.Scanner;


public class hdu2041
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			for(int a=0;a<n;a++)
			{
				int m=s.nextInt();
				System.out.println(cs(m-1));
			}
		}

	}
	public static int cs(int m)
	{
		if(m==1)
		{
			return 1;
		}
		if(m==2)
		{
			return 2;
		}
		int sum=0;
		sum=cs(m-1)+cs(m-2);
		return sum;
	}

}
