import java.io.BufferedInputStream;
import java.util.Scanner;


public class hdu2047
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(new BufferedInputStream(System.in));
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			long jg;
			if(n==1)
			{
				jg=3;
			}else if(n==2)
			{
				jg=8;
			}else
			{
				long arr[]=new long[n];
				arr[0]=3;
				arr[1]=8;
				for(int a=2;a<n;a++)
				{
					arr[a]=(arr[a-1]+arr[a-2])*2;
				}
				jg=arr[n-1];
			}
			System.out.println(jg);
		}

	}

}
