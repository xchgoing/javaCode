import java.util.Arrays;
import java.util.Scanner;


public class hdu2049
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			for(int a=0;a<n;a++)
			{
				int q=s.nextInt();
				int w=s.nextInt();
				long[] arr=new long[w];
				arr[0]=0;
				arr[1]=1;
				for(int b=2;b<w;b++)
				{
					arr[b]=b*(arr[b-1]+arr[b-2]);
				}
				arr[w-1]*=(jc(q)/(jc(w)*jc(q-w)));
				System.out.println(arr[w-1]);
			}
		}
	}
	public static long jc(int n)
	{
		long sum=1;
		for(int a=1;a<=n;a++)
		{
			sum*=a;
		}
		return sum;
	}
}
