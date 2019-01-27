package 天梯;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class t7t9
{
//nc 重复的不同元素的个数  nt总元素的个数   输出nc/nt*100%
	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		Set[] hs;
		Set<Integer> first = new HashSet<Integer>(); 
		Set<Integer> has = new HashSet<Integer>(); 
		Set<Integer> all = new HashSet<Integer>(); 
		int size=0;
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			hs=new HashSet[n];
			for(int i=0;i<n;i++)
			{
				size = 0;
				int m=s.nextInt();
				while(m-->0)
				{
					first.add(s.nextInt());
				}
				hs[i]=first;
			}
			int m=s.nextInt();
			while(m-->0)
			{
				int q=s.nextInt();
				int w=s.nextInt();
				Iterator<Integer> it =hs[q].iterator();
				while (it.hasNext())
				{
					 size=all.size();
					 int next = it.next();
					 all.add(next);
					 if(size==all.size())
					 {
						 has.add(next);
					 }
				}
				it =hs[w].iterator();
				while (it.hasNext())
				{
					 size=all.size();
					 int next = it.next();
					 all.add(next);
					 if(size==all.size())
					 {
						 has.add(next);
					 }
				}
				double out=(double)has.size()/all.size()*100;
				System.out.println(String.format("%.2f",out));
			}
			
		}
	}

}
