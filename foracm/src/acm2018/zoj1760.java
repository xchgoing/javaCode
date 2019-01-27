package acm2018;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class zoj1760
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			Set set=new TreeSet<Integer>();
			int n=-1;
			int count=0;
			while(n!=0)
			{
				n=s.nextInt();
				if(n==-1)break;
				if(set.contains(2*n))count++;
				if(n%2==0)
				{
					if(set.contains(n/2))count++;
				}
				set.add(n);
			}
			if(n==-1)break;
			System.out.println(count);
		}
		
	}

}
