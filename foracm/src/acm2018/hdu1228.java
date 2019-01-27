package acm2018;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hdu1228
{
//zero, one, two, three, four, five, six, seven, eight, nine.
	public static void main(String[] args)
	{
		Map<String,Integer> map=new HashMap();
		map.put("zero", 0);
		map.put("one", 1);
		map.put("two", 2);
		map.put("three",3);
		map.put("four", 4);
		map.put("five", 5);
		map.put("six", 6);
		map.put("seven", 7);
		map.put("eight", 8);
		map.put("nine", 9);
		Scanner s=new Scanner (System.in);
		while(s.hasNextLine())
		{
			String temp=s.nextLine();
			String[] in=temp.split(" ");
			int q1=0;
			int q2=0;
			boolean j=false;
			for(int a=0;a<in.length;a++)
			{
				if(map.containsKey(in[a])) 
				{
					if(!j)
					{
						if(q1!=0)q1*=10;
						q1+=map.get(in[a]);
					}else
					{
						if(q2!=0)q2*=10;
						q2+=map.get(in[a]);
					}
				}else
				{
					if(in[a].equals("+"))j=true;
				}			
			}
			if(q1==0&&q2==0)break;
			System.out.println(q1+q2);
		}
	}

}
