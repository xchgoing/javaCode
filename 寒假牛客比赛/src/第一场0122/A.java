package µÚÒ»³¡0122;

import java.util.Scanner;

public class A
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in); 
		while(s.hasNextLong())
		{
			int n=s.nextInt();
			long in=s.nextLong();
			long[] arr=new long[n];
			long[] arr1=new long[n];
			for(int a=0;a<n;a++)
			{
				arr[a]=s.nextLong();
				arr1[a]=s.nextLong();
			}
			for(int a=n-1;a>-1;a--)
			{
				if(arr[a]==1)
				{
					in-=arr1[a];
				}else if(arr[a]==2)
				{
					in+=arr1[a];
				}else if(arr[a]==3)
				{
					in/=arr1[a];
				}else if(arr[a]==4)
				{
					in*=arr1[a];
				}
			}
			System.out.println(in);
		}
	}

}
