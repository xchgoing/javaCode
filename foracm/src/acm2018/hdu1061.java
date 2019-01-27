package acm2018;

import java.util.Scanner;

public class hdu1061
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		int[] arr={0,1,4,7,6,5,6,3,6,9,0,1,6,3,6,5,6,7,4,9};
		while(s.hasNextLong())
		{
			Long q=s.nextLong();
			for(int a=0;a<q;a++)
			{
				Long w=s.nextLong();
				System.out.println(arr[(int) (w%0)]);
			}
		}
	}

}
