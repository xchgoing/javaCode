import java.util.Scanner;


public class hdu2032
{

	public static void main(String[] args)
	{
		int arr[][];
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			arr=new int[n][n];
			//System.out.println("1");
			for(int a=0;a<n;a++)
			{
				arr=new int[a+1][a+1];
				for(int b=0;b<a+1;b++)
				{
					if(b==0||b==a||b==0)
						{
						//System.out.println(a+" "+b);
						arr[a][b]=1;
						}
					else
					{
						arr[a][b]=arr[a-1][b-1]+arr[a-1][b];
						//System.out.print(a+" "+b);
					}
					if(b!=a)
					{
						System.out.print(arr[a][b]+" ");
					}
					else
					{
						System.out.println(arr[a][b]);
					}
					
					
				}
			}
			System.out.println();
		}

	}

}
