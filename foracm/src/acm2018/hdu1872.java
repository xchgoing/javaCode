package acm2018;

import java.util.Arrays;
import java.util.Scanner;

public class hdu1872
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			st[] chushi=new st[n];
			st[] bijiao=new st[n];
			for(int a=0;a<n;a++)
			{
				String name=s.next();
				int fs=s.nextInt();
				chushi[a]=new st(name,fs);
			}
			for(int a=0;a<n;a++)
			{
				String name=s.next();
				int fs=s.nextInt();
				bijiao[a]=new st(name,fs);
			}
			Arrays.sort(chushi);
			if(qwe(chushi,bijiao))
			{
				System.out.println("Right");
			}else
			{
				boolean stable=true;
				for(int a=0;a<chushi.length;a++)
				{
					if(chushi[a].fs!=bijiao[a].fs)
					{
						stable=false;
						break;
					}
				}
				if(stable)
				{
					System.out.println("Not Stable");
					for(int a=0;a<chushi.length;a++)
					{
						System.out.println(chushi[a].name+" "+chushi[a].fs);//+"-----"+bijiao[a].name+" "+bijiao[a].fs
					}
				}else
				{
					System.out.println("Error");
					for(int a=0;a<chushi.length;a++)
					{
						System.out.println(chushi[a].name+" "+chushi[a].fs);
					}
				}
			}
		}
	}
	public static boolean qwe(st[] q,st[] w)
	{
		boolean out=true;
		for(int a=0;a<q.length;a++)
		{
			if((!q[a].name.equals(w[a].name))||q[a].fs!=w[a].fs)
			{
				out=false;
				break;
			}
		}
		return out;
	}
}
class st implements Comparable<st>
{
	String name;
	int fs;
	public st(String a,int b)
	{
		name=a;
		fs=b;
	}
	public int compareTo(st o)
	{
		return (o.fs-this.fs);
	}
}
