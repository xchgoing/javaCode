import java.util.Arrays;
import java.util.Scanner;


public class x123
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			String[] result=new String[2];
			String[] arr;
			long[] resultint=new long[2];
			int count = s.nextInt();
			String temp = "";
			while(count-->0)
			{
				temp=s.next();
				arr=temp.split("/");
				if(resultint[1]!=0)
				{
					long gcdr=gcd(resultint[1],Integer.valueOf(arr[1]));
					
					resultint[0]*=(Integer.valueOf(arr[1])/gcdr);
					resultint[1]*=(Integer.valueOf(arr[1])/gcdr);
					
					
					resultint[0]+=Integer.valueOf(arr[0])*resultint[1]/Integer.valueOf(arr[1]);
					
					if(resultint[1]!=0&&resultint[0]!=0)
					gcdr=gcd(resultint[1],resultint[0]);
					
					resultint[0]/=gcdr;
					resultint[1]/=gcdr;
				}else
				{
					resultint[0]=Integer.valueOf(arr[0]);
					resultint[1]=Integer.valueOf(arr[1]);
				}
				if(resultint[1]==0||resultint[0]==0)
				{
					resultint[1]=0;resultint[0]=0;
				}
			}
			if(resultint[1]==0||resultint[0]==0)
			{
				System.out.println(0);
				continue;
			}
			if(resultint[1]<0)
			{
				resultint[0]=0-resultint[0];
				resultint[1]=0-resultint[1];
			}
			long qian=resultint[0]/resultint[1];
			if(qian!=0)
			{
				System.out.print(qian);
				if(resultint[0]%resultint[1]!=0)
				{
					System.out.println(" "+resultint[0]%resultint[1]+"/"+resultint[1]);
				}
			}else
			{
				System.out.print(resultint[0]+"/"+resultint[1]);
			}
		}
		
	}
	public static long gcd(long q,long w)
	{
		long e=0;
		while(true)
		{
			q=q%w;
			if(q==0)break;
			e=q;
			q=w;
			w=e;
		}
		return w;
	}

}
