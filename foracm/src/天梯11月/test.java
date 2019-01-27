package ÌìÌÝ11ÔÂ;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class test 
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
			int n=s.nextInt();
			while(n-->0)
			{
				int resulttime=0;
				int resultcount=0;
				int[] arr=new int[1001];
				Arrays.fill(arr, -1);
				while(true)
				{
					
					int nub=s.nextInt();
					if(nub==0)
					{
						s.nextLine();
						if(resultcount==0)System.out.println(0+" "+0);
						else
						System.out.printf("%d %.0f\n",resultcount,(resulttime*1.0/resultcount));
						break;
					}else
					{ 
						String se=s.next();
						if(se.equals("S"))
						{
							String[] temp=s.next().split(":");
//							if(arr[nub]==-1)
							arr[nub]=Integer.valueOf(temp[0])*60+Integer.valueOf(temp[1]);
						}else
						{
							String[] temp=s.next().split(":");
							if(arr[nub]!=-1)
							{
								resulttime+=Integer.valueOf(temp[0])*60+Integer.valueOf(temp[1])-arr[nub];
								arr[nub]=-1;
								resultcount++;
							}
						}
					}
				}
			
		}
	}
	
}

