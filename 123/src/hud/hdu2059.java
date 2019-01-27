package hud;

import java.util.Scanner;

public class hdu2059
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextDouble())
		{
			double luchen=s.nextDouble();
			double n=s.nextDouble();
			double c=s.nextDouble();
			double t=s.nextDouble();
			double vr=s.nextDouble();
			double vt1=s.nextDouble();
			double vt2=s.nextDouble();
			double timer=luchen*1.0/vr;
			int[] arr=new int[(int) (n+1)];
			arr[0]=0;
			for(int a=1;a<n;a++)
			{
				arr[a]=s.nextInt();
			}
			double timeg=0;
			double sy=c;
			for(int a=0;a<n-1;a++)
			{
				double temp=arr[a+1]-arr[a]-sy;
				if(temp==0)
				{
					timeg=timeg+c/vt1;
					sy=0;
				}else if(temp>0)
				{
					timeg=timeg+c/vt1+temp/vt2;
					sy=0;
				}else
				{
					timeg+=(arr[a+1]-arr[a])/vt1;
					sy=-temp;
				}
				
				temp=arr[a+2]-arr[a+1];
				double walk=sy/vt1+(temp-sy)/vt2;
				double che=0;
				if(temp==0)
				{
					che=t+sy/vt1;
				}else if(temp>0)
				{
					che=t+sy/vt1+temp/vt2;
				}else
				{
					che=t+(arr[a+1]-arr[a])/vt1;
				}
				
				if(walk>=che)
				{
					sy+=c;
				}
			}
			System.out.println(timeg+" "+timer);
			if(timeg<timer)
			{
				System.out.println("What a pity rabbit!");
			}else
			{
				System.out.println("Good job,rabbit!");
			}
		}
	}
}
