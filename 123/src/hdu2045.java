import java.io.BufferedInputStream;
import java.util.Scanner;


public class hdu2045
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(new BufferedInputStream(System.in));
		while(s.hasNextInt())
		{
			long jg=0;
			int n=s.nextInt();
			if(n==1)
			{
				jg=3;
			}else if(n==2||n==3)
			{
				jg=6;
			}else
			{
				long arr[]=new long[n];
				arr[0]=3;
				arr[1]=6;
				arr[2]=6;
				for(int a=3;a<n;a++)
				{
					arr[a]=arr[a-1]+2*arr[a-2];
				}
				jg=arr[n-1];
			}
			System.out.println(jg);
		}
	}

}
