import java.util.Arrays;
import java.util.Scanner;


public class hdu2039
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextDouble())
		{
			double n=s.nextDouble();
			double arr[];
			arr=new double[3];
			for(int a=0;a<n;a++)
			{
				for(int b=0;b<3;b++)
				{
					arr[b]=s.nextDouble();
				}
				Arrays.sort(arr);
				if(arr[0]+arr[1]>arr[2]&&arr[2]-arr[0]<arr[1])
				{
					System.out.println("YES");
				}else
				{
					System.out.println("NO");
				}
			}
		}

	}

}
