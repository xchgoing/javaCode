import java.util.Arrays;
import java.util.Scanner;


public class hdu2019
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			int x=s.nextInt();
			if(n==0&&x==0)
			{
				break;
			}
			int arr[]=new int[n+1];
			for(int a=0;a<n;a++)
			{
				arr[a]=s.nextInt();
			}
			arr[n]=x;
			Arrays.sort(arr);
			for(int b=0;b<n;b++)
			{
				System.out.print(arr[b]+" ");
			}
			System.out.println(arr[n]);
		}

	}

}
