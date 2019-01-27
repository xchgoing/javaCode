package µÚÒ»³¡0122;

import java.util.Arrays;
import java.util.Scanner;

public class B
{
//4 0 4 0 2 2 16*4+4
//4 0 4 2 0 2 16*3+4*3
	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int sum=0;
			int last=0;
			int next=0;
			int[] arr=new int[5];
			int n=s.nextInt();
			while(n-->0)
			{
				int temp=s.nextInt();
				arr[temp]++;
			}
			while(true)
			{
				if(last==0)
				{
					if(arr[4]!=0)
					{
						sum+=16;
						arr[4]--;
						last=4;
					}else if(arr[2]!=0)
					{
						sum+=4;
						arr[2]--;
						last=2;
					}
				}else if(last==4)
				{
					if(arr[0]!=0)
					{
						sum+=16;
						arr[0]--;
						last=0;
					}else if(arr[2]!=0)
					{
						sum+=4;
						arr[2]--;
						last=2;
					}
				}else if(last==2)
				{
					if(arr[0]!=0)
					{
						sum+=4;
						last=0;
						arr[0]--;
					}else if(arr[4]!=0)
					{
						sum+=4;
						last=4;
						arr[4]--;
					}else {
						break;
					}
				}
				if(arr[0]+arr[2]+arr[4]==0)break;
			}
			System.out.println(sum);
				
			 
		}
	}

}
