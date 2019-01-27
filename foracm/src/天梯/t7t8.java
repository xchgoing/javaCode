package ÌìÌÝ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class t7t8
{
//
	public static void main(String[] args)
	{
		int[] arr={7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
		String[] last={"1","0","X","9","8","7","6","5","4","3","2"};
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			boolean out=true;
			int n=s.nextInt();
			s.nextLine();
			for(int i=0;i<n;i++)
			{
				int z=0;
				String sfz=s.nextLine();
				for(int a=0;a<17;a++)
				{
					z+=arr[a]*(int)(sfz.charAt(a)-'0');
//					System.out.print((int)(sfz.charAt(a)-'0'));
				}
				z%=11;
//				System.out.println("-------"+last[z]);
				if(!sfz.endsWith(last[z]))
				{
					out=false;
					System.out.println(sfz);
				}
			}
			
			if(out)System.out.println("All passed");
			
		}
	}

}
