import java.util.Arrays;
import java.util.Scanner;


public class hdu2014
{

	public static void main(String[] args)
	{
		int gs=0;
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			gs=s.nextInt();
			int arr[];
			double sum=0;
			arr=new int[gs];
			for(int a=0;a<gs;a++)
			{
				arr[a]=s.nextInt();
			}
			Arrays.sort(arr);
			for(int b=1;b<gs-1;b++)
			{
				sum=sum+arr[b];
			}
			System.out.println(String.format("%.2f",(sum/(gs-2))));
			
			
		}

	}

}
