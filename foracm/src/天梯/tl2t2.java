package ÌìÌİ;


import java.util.Arrays;
import java.util.Scanner;

public class tl2t2 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			student[] arr=new student[n];
			for(int a=0;a<arr.length;a++)
			{
				arr[a]=new student(a+1,0,0);
			}
			for(int a=0;a<n;a++)
			{
				int outcount=s.nextInt();;
				while(outcount-->0)
				{
					int m=s.nextInt();
					int money=s.nextInt();
					arr[m-1].money+=money;
					arr[m-1].count++;
					arr[a].money-=money;
				}
			}
			Arrays.sort(arr);
			double money;
			for(int a=0;a<arr.length;a++)
			{
				money=arr[a].money;
				System.out.printf("%d %.2f\n",arr[a].number,money/100);
			}
		}
	}

}
class student implements Comparable<student>
{
	int number;
	int money;
	int count;
	
	public student(int number,int money,int count)
	{
		this.number=number;
		this.money=money;
		this.count=count;
	}


	@Override
	public int compareTo(student o)
	{
		if(this.money!=o.money)
		{
			return o.money-this.money;
		}else if(this.count!=o.count)
		{
			return o.count-this.count;
		}else
		{
			return this.number-o.number;
		}
	}
}
