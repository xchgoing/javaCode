package �ڶ���;

import java.util.Arrays;
import java.util.Scanner;

public class J
{

	public static void main(String[] args)
	{
		boolean o=true;
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		c[] arr=new c[n];
		for(int a=0;a<n;a++)
		{
			arr[a]=new c(s.nextInt());
		}
		for(int a=0;a<n;a++)
		{
			arr[a].start=s.nextInt();
		}
		Arrays.sort(arr,(c c1,c c2)->(c1.start-c2.start));
		int time=0;
		for(int a=0;a<n;a++)
		{
			int temp=arr[a].start-a*2;
			if(temp-time<arr[a].nt)
			{
				o=false;
				break;
			}
			time+=arr[a].nt;
		}
		System.out.println(o==true?"YES":"NO");
	}
}

class c
{
	c(int ndi)
	{
		nt=ndi;
	}
	int start;
	int nt;
}
