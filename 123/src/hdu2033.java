import java.util.Scanner;


public class hdu2033
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			for(int a=0;a<n;a++)
			{
				int arr[][];
				arr=new int [2][3];
				for(int b=0;b<2;b++)
				{
					for(int c=0;c<3;c++)
					{
						arr[b][c]=s.nextInt();
					}
					
				}
				int arrs[];
				arrs=new int[3];
				if(arr[0][2]+arr[1][2]>=60)
				{
					arrs[2]=arr[0][2]+arr[1][2]-60;
					arrs[1]=1;
				}
				else
				{
					arrs[2]=arr[0][2]+arr[1][2];
				}
				if(arr[0][1]+arr[1][1]+arrs[1]>=60)
				{
					arrs[1]=arr[0][1]+arr[1][1]+arrs[1]-60;
					arrs[0]=1;
				}
				else
				{
					arrs[1]=arr[0][1]+arr[1][1]+arrs[1];
				}
				arrs[0]=arrs[0]+arr[0][0]+arr[1][0];
				for(int q=0;q<2;q++)
				{
					System.out.print(arrs[q]+" ");
				}
				System.out.println(arrs[2]);
			}
		}

	}

}
