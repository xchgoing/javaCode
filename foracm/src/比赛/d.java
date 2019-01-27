package ±ÈÈü;

import java.util.Arrays;
import java.util.Scanner;

public class d
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int a=s.nextInt();
			int b=s.nextInt();
			int[] arra=new int[a];
			int[] arrb=new int[b];
			for(int i=0;i<a;i++)
			{
				arra[i]=s.nextInt();
			}
//			System.out.println("ok");
			for(int i=0;i<b;i++)
			{
				arrb[i]=s.nextInt();
			}
			Arrays.sort(arra);
			Arrays.sort(arrb);
			int aq=0;
			int bq=0;
			int count=0;
			while(true)
			{
				if(arra[aq]==arrb[bq])
				{
					count++;
				}else
				{
					if(arra[aq]>arrb[bq])
					{
						aq--;
					}else
					{
						bq--;
					}
				}
				aq++;bq++;
				if(aq==a||bq==b)break;
			}
			System.out.println(count);
		}
	}

}
