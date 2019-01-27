package acm2018;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class zoj2343
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			for(int a=0;a<n;a++)
			{
				double people=s.nextDouble();
				double money=s.nextDouble();
				double fmu=s.nextDouble();
				int duoyu=(int) money;
				dz[] arr=new dz[(int) people];
				for(int b=0;b<people;b++)
				{
					double temp=s.nextDouble();
					arr[b]=new dz(money*(temp/fmu),(int)(money*(temp/fmu)),money*(temp/fmu)-(int)(money*(temp/fmu)),b);
					duoyu-=(int)(money*(temp/fmu));
				}
				Arrays.sort(arr,new Comparator<dz>()
				{
					public int compare(dz a,dz b)
					{
						if(a.xiaoshu>b.xiaoshu)return -1;
						else if(a.xiaoshu<b.xiaoshu)return 1;
						else return 0;
					}
				});
				for(int b=0;b<duoyu;b++)
				{
					arr[b].xs++;
				}
				for(int b=0;b<arr.length;b++)
				{
					if(b==0)
					{
						for(int c=0;c<arr.length;c++)
						{
							if(b==arr[c].bianhao)
							{
								System.out.print((int)arr[c].xs);
								break;
							}
						}
					}
					else 
					{
						for(int c=0;c<arr.length;c++)
						{
							if(b==arr[c].bianhao)
							{
								System.out.print(" "+(int)arr[c].xs);
								break;
							}
						}
					}
				}
				System.out.println();
			}
		}
		
	}
}
class dz 
{
	double yl;
	double xs;
	double xiaoshu;
	int bianhao;
	public dz(double a,double b,double c,int bh)
	{
		yl=a;
		xs=b;
		xiaoshu=c;
		bianhao=bh;
	}
	
	
	
}