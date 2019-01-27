package sf;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class hdu1548r2
{
	public static void main(String[] args)
	{ 
//		Queue<Integer> q=new LinkedList<Integer>();
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int high=s.nextInt();
			if(high==0)break;
			int start=s.nextInt();
			int end=s.nextInt();
			ArrayList<stop> list=new ArrayList();
			list.add(new stop(start,0));
			int[] arr=new int[high+1];
			int[] book=new int[high+1];
			for(int a=1;a<high+1;a++)
			{
				arr[a]=s.nextInt();
			}
			if(start>high||end>high||start<1||end<1)
			{
				System.out.println("-1");
				continue;
			}
			if(start==end)
			{
				System.out.println("0");
				continue;
			}
			int head=0;
			while(true)
			{
				stop temp=list.get(head);
				int q=temp.q;
				int step=temp.step;
				if((q+arr[q])<=high)
				{
					if(book[q+arr[q]]!=1)
					{
						if(q+arr[q]==end)
						{
							System.out.println(step+1);
							break;
						}else
						{
							list.add(new stop(q+arr[q],step+1));
							book[q+arr[q]]=1;
						}
					}
				}
				if(q-arr[q]>0)
				{
					if(book[q-arr[q]]!=1)
					{
						if(q-arr[q]==end)
						{
							System.out.println(step+1);
							break;
						}else
						{
							list.add(new stop(q-arr[q],step+1));
							book[q-arr[q]]=1;
						}
					}
				}
				if(head==list.size()-1)
				{
					System.out.println(-1);
					break;
				}
				head++;
			}
		}
	}
}
class stop
{
	int q;
	int step;
	public stop(int q,int step)
	{
		this.q=q;
		this.step=step;
	}
}