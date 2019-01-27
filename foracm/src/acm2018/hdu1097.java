package acm2018;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class hdu1097
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int a=s.nextInt()%10;
			int b=s.nextInt();
			List<Integer> list=new ArrayList<Integer>();
			int pow=1;
			while(true)
			{
				if(list.contains(((int)Math.pow(a,pow))%10))
				break;
				else
				list.add(((int)Math.pow(a,pow))%10);
				
				pow++;
			}
			list.add(0, list.remove(list.size()-1));
//			System.out.println(list.toString());
			System.out.println(list.get(b%list.size()));
		}
	}

}