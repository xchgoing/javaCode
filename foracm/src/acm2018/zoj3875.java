package acm2018;
import java.util.Arrays;
import java.util.Scanner;
public class zoj3875
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNext())
		{
			int n=s.nextInt();
			for(int a=0;a<n;a++)
			{
				int q=s.nextInt();
				int w=s.nextInt();
				int e=s.nextInt();
				cd[] arrq=new cd[q];
				cd[] arrw=new cd[w];
				cd[] arre=new cd[e];
				for(int b=0;b<q;b++)
				{
					arrq[b]=new cd(s.next(),s.nextInt());
				}
				Arrays.sort(arrq);
				for(int b=0;b<w;b++)
				{
					arrw[b]=new cd(s.next(),s.nextInt());
				}
				Arrays.sort(arrw);
				for(int b=0;b<e;b++)
				{
					arre[b]=new cd(s.next(),s.nextInt());
				}
				Arrays.sort(arre);
				String tempn=zhong(arrq).name+" "+zhong(arrw).name+" "+zhong(arre).name;
				int tempp=zhong(arrq).price+zhong(arrw).price+zhong(arre).price;
				System.out.println(tempp+" "+tempn);
			}
		}
	}
	public static cd zhong(cd[] arr)
	{
		if(arr.length%2==0)
		{
			return arr[arr.length/2];
		}else
		{
			return arr[(arr.length-1)/2];
		}
	}
}

class cd implements Comparable<cd>
{
	String name;
	int price;
	public cd(String n,int p)
	{
		name=n;
		price=p;
	}
	public int compareTo(cd c)
	{
		return price-c.price;
	}
}
