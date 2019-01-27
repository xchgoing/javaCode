import java.util.Arrays;
import java.util.Scanner;


public class hdu2020
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			if(n==0||n>100)
			{
				break;
			}
			int arr[]=new int[n];
			int arrs[]=new int[n];
			for(int a=0;a<n;a++)
			{
				arrs[a]=arr[a]=s.nextInt();
				if(arr[a]<0)
				{
					arr[a]=Math.abs(arr[a]);
				}
			}
			Arrays.sort(arr);
			for(int d=0;d<=n/2-1;d++)
			{
				int q=arr[d];
				arr[d]=arr[n-1-d];
				arr[n-1-d]=q;
			}
			for(int b=0;b<n;b++)
			{
				for(int c=0;c<n;c++)
				{
					if(arr[b]==Math.abs(arrs[c]))
					{
						arr[b]=arrs[c];
					}
				}
			}
			for(int e=0;e<n-1;e++)
			{
				System.out.print(arr[e]+" ");
			}
			System.out.println(arr[n-1]);
						
		}

	}

}
