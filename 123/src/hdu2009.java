import java.util.Scanner;
public class hdu2009
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=0,m=0;
		while(s.hasNextInt())
		{
			n=s.nextInt();
			m=s.nextInt();
			if(n>=10000||m>1000||n<=0||m<=0)
			{
				break;
			}
			double sum=0,z=n;
			double[] arr=new double[m];
			for(int a=1;a<m;a++)
			{
				arr[0]=n;
				arr[a]=Math.sqrt(arr[a-1]);
			}
			for(int b=0;b<m;b++)
			{
				sum=sum+arr[b];
				//System.out.println(arr[b]+" "+b);
			}
			System.out.println(String.format("%.2f",sum));
			sum=0;
			
		}
	}
}
