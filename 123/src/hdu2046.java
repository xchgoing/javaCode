import java.io.BufferedInputStream;
import java.util.Scanner;



public class hdu2046
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(new BufferedInputStream(System.in));
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			if(n==1)
			{
			  System.out.println(1);
			}else if(n==2)
			{
				 System.out.println(2);
			}else
			{
				Long arr[]=new Long[n];
				arr[0]=(long) 1;
				arr[1]=(long) 2;
				for(int a=2;a<n;a++)
				{
					arr[a]=arr[a-1]+arr[a-2];
				}
				System.out.println(arr[n-1]);
				/*for(int x:arr)
				{
					System.out.println(x+" ");
				}*/
			}
			
		}

	}

}
