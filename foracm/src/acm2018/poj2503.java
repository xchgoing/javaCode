package acm2018;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class poj2503
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		Map<String,String> map=new HashMap<String,String>();
		while(s.hasNextLine())
		{
			String q=s.nextLine();
			if(q.contains(" "))
			{
				String[] arr=q.split(" ");
				map.put(arr[1], arr[0]);
			}
			else if(q.equals(""))
			{
				continue;
			}else
			{
				if(map.containsKey(q))
				System.out.println(map.get(q));
				else
				System.out.println("eh");
			}
		}
	}

}
