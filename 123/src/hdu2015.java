import java.util.Scanner;
public class hdu2015
{
   public static void main(String[] args)
	{
		int arr[];
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int n;
			int m;
			n=s.nextInt();
			m=s.nextInt();
			if(n>100)
			{
				break;
			}
			arr=new int [n];
			for(int a=0;a<n;a++)
			{
				arr[a]=2*(a+1);
			}
			int cs=0;
			int sum=0;
			for(int b=1;n-m*b>=0;b++)
			{
				for(int c=m*(b-1);c<m*b;c++)
				{
					sum=sum+arr[c];
				}
				if(n-m*b==0)
				{
					System.out.print(sum/m);
					if(b!=n/m)
					{
						System.out.print(" ");
					}
					else
					{
						System.out.println();
					}
				}else
				{
					System.out.print(sum/m+" ");
				}
				cs++;
				sum=0;
			}
			if(n-m*cs>0)
			{
				for(int q=cs*m;q<n;q++)
				{
					sum=sum+arr[q];
				}
				System.out.println(sum/(n-(cs*m)));
			}
		}

	}

}