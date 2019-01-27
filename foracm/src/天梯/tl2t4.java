package ÌìÌİ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class tl2t4
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		int[] addr=new int[100000];
		int[] arrv=new int[100000];
		Arrays.fill(arrv, -1);
		Set<Integer> set=new HashSet<Integer>();
		int other=-1;
		while(s.hasNextInt())
		{
			int nextaddress=s.nextInt();
			int count=s.nextInt();
			for(int a=0;a<count;a++)
			{
				int taddr=s.nextInt();
				int value=s.nextInt();
				int naddr=s.nextInt();
				System.out.println("+++++++++++++++"+taddr+" "+value+" "+naddr);
				arrv[taddr]=value;
				addr[taddr]=naddr;
			}
//			set.add(arrv[nextaddress]);

			int cd=nextaddress;
			int t=-1;
			int os=-1;
			int ol=-1;
			while(true)
			{
				if(addr[cd]==-1)break;
				if(!set.add(Math.abs(arrv[cd])))
				{
//					System.out.println("-----------------"+cd+"===="+t);
					addr[t]=addr[cd];
					if(os==-1)os=cd;
					ol=cd;
					addr[ol]=-1;
				}else
				{
					cd=addr[cd];
					t=cd;
				}
			}
			while(true)
			{
//				System.out.println("ok");
				System.out.println(String.format("%05d %d %05d",nextaddress,arrv[nextaddress],arrv[nextaddress]));
				if(arrv[nextaddress]==-1)break;
				
				nextaddress=arrv[nextaddress];
				
			}
			
		}
		
	}
}
