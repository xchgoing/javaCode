package acm2018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class poj2002
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			s.nextLine();
			if(n==0)break;
			List<String> list=new ArrayList<String>();
			Set<String[]> set=new HashSet<String[]>();
			for(int a=0;a<n;a++)
			{
				list.add(s.nextLine());
			}
//			System.out.println(list.toString());
			for(int a=0;a<list.size()-1;a++)
			{
				String temp=list.get(a);
//				System.out.println(temp);
				String[] stemp=temp.split(" ");
//				System.out.println(Arrays.toString(stemp));
				int[] xy1=new int[]{Integer.valueOf(stemp[0]),Integer.valueOf(stemp[1])};
				for(int b=a+1;b<list.size();b++)
				{
					String tempb=list.get(b);
					String[] stempb=tempb.split(" ");
					int[] xy2=new int[]{Integer.valueOf(stempb[0]),Integer.valueOf(stempb[1])};

					int x3=xy1[0]+(xy1[1]-xy2[1]); int y3=xy1[1]-(xy1[0]-xy2[0]);
					int x4=xy2[0]+(xy1[1]-xy2[1]); int y4=xy2[1]-(xy1[0]-xy2[0]);
					String xy3=String.valueOf(x3)+" "+String.valueOf(y3);
					String xy4=String.valueOf(x4)+" "+String.valueOf(y4);
					if(list.contains(xy3)&&list.contains(xy4))
					{
						String[] in={temp,tempb,xy3,xy4};

						set.add(in);
						
					}
					
					x3=xy1[0]-(xy1[1]-xy2[1]); y3=xy1[1]+(xy1[0]-xy2[0]);
					x4=xy2[0]-(xy1[1]-xy2[1]); y4=xy2[1]+(xy1[0]-xy2[0]);
					xy3=String.valueOf(x3)+" "+String.valueOf(y3);
					xy4=String.valueOf(x4)+" "+String.valueOf(y4);
					if(list.contains(xy3)&&list.contains(xy4))
					{
						String[] in={temp,tempb,xy3,xy4};
						set.add(in);
					}
				}
			}
			System.out.println(set.size()/4);
		}
		
	}

}
