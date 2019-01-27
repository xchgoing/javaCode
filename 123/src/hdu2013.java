import java.util.Scanner;


public class hdu2013
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int sum=1;
			int n=0;
			n=s.nextInt();
			if(n<=1||n>=30)
			{
				break;
			}
			for(int a=1;a<n;a++)
			{
				sum=(sum+1)*2;
			}
			System.out.println(sum);
		}

	}

}
