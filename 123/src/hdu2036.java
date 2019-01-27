import java.util.Scanner;


public class hdu2036
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			if(n==0)break;
			int arr[][];
			arr=new int[n][2];
			for(int a=0;a<n;a++)
			{
				arr[a][0]=s.nextInt();
				arr[a][1]=s.nextInt();
			}
			double sum=0;
			for(int a=0;a<n-1;a++)
			{
				sum=sum+arr[a][0]*arr[a+1][1]-arr[a+1][0]*arr[a][1];
			}
			sum=sum+arr[n-1][0]*arr[0][1]-arr[n-1][1]*arr[0][0];
			sum=Math.abs(sum)*0.5;
			System.out.println(String.format("%.1f",sum));
		}
			
			

	}

}
