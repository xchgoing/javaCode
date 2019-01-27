package 天梯;

import java.util.Arrays;
import java.util.Scanner;

public class tl1t3
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNext())
		{
			String q=s.next();
			String w=s.next();
			String e=s.next();
			if(w.length()<e.length())
			{
				String temp=w;
				w=e;
				e=temp;
			}
//			System.out.println("--------"+q);
//			System.out.println("--------"+w);
//			System.out.println("--------"+e);
			int[] arrq=new int[q.length()];
			int[] arrw=new int[w.length()+1];
			int[] arre=new int[e.length()];
			Arrays.fill(arrw, 0);
			for(int a=0;a<q.length();a++)
			{
				arrq[a]=(q.charAt(a)-'0') ==0? 10:q.charAt(a)-'0';
				if(a+1<=w.length())
				{
					arrw[a+1]=w.charAt(a)-'0';
//					System.out.println("+++++++++++++++++++"+arrw[a+1]);
				}
				if(a<e.length())
				{
					arre[a]=e.charAt(a)-'0';
				}
			}
//			System.out.println(Arrays.toString(arrq));
//			System.out.println(Arrays.toString(arrw));
//			System.out.println(Arrays.toString(arre));
//			System.out.println("************************************");
			for(int a=1;a<=w.length();a++)
			{
//				System.out.println("========================"+a+"=========="+w.length()+"==========="+e.length()+"============"+(a<=e.length()));
				if(a<=e.length())
				{
//					System.out.println("========================"+a+"====================="+e.length()+"============"+(a<=e.length()));
//					System.out.println();
//					System.out.println("进位"+arrw[w.length()-a+1]+"+"+arre[e.length()-a]+"/"+arrq[q.length()-a]+"="+(arrw[w.length()-a+1]+arre[e.length()-a])/arrq[q.length()-a]);
					arrw[w.length()-a]+=(arrw[w.length()-a+1]+arre[e.length()-a])/arrq[q.length()-a];
//					System.out.println("本位"+arrw[w.length()-a+1]+"+"+arre[e.length()-a]+"/"+arrq[q.length()-a]+"="+(arrw[w.length()-a+1]+arre[e.length()-a])%arrq[q.length()-a]);
					arrw[w.length()-a+1]=(arrw[w.length()-a+1]+arre[e.length()-a])%arrq[q.length()-a];
//					System.out.println();
				}else
				{
//					System.out.println(arrw[w.length()-a+1]+"/"+arrq[q.length()-a]+"="+);
					arrw[w.length()-a]+=arrw[w.length()-a+1]/arrq[q.length()-a];
					arrw[w.length()-a+1]=arrw[w.length()-a+1]%arrq[q.length()-a];
				}
//				System.out.println(Arrays.toString(arrq));
//				System.out.println(Arrays.toString(arrw));
//				System.out.println(Arrays.toString(arre));
//				System.out.println("----------------------------------------------------------");
			}
//			System.out.println(Arrays.toString(arrw));
			
			int[] arrf=new int[arrq.length+1];
			for(int a=1;a<=arrw.length;a++)
			{
				arrf[arrf.length-a]=arrw[arrw.length-a];
			}
//			System.out.println(Arrays.toString(arrq));
//			System.out.println(Arrays.toString(arrf));
			for(int a=arrf.length-1;a>0;a--)
			{
//				System.out.println(arrf[a-1]+"="+arrf[a]+"/"+arrq[a-1]);
				arrf[a-1]+=arrf[a]/arrq[a-1];
//				System.out.println(arrf[a]+"="+arrf[a]+"/"+arrq[a-1]);
				arrf[a]=arrf[a]%arrq[a-1];
//				System.out.println(Arrays.toString(arrf));
//				System.out.println("-------------------------------------------------");
			}
			
			boolean qwe=true;
			for(int a=0;a<arrf.length;a++)
			{
				
				if(arrf[a]!=0)qwe=false;
				if(qwe)continue;
				System.out.print(arrf[a]);
			}
			if(qwe)
			{
				System.out.println(0);
			}else
			{
				System.out.println();
			}
		}
	}

}
