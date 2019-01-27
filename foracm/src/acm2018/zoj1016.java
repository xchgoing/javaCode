package acm2018;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class zoj1016
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			for(int a=0;a<n;a++)
			{
				List<String> list=new ArrayList<String>();
				int i=s.nextInt();
				int temp1=0;
				for(int b=0;b<i;b++)
				{
					int temp=s.nextInt();
					for(int c=0;c<temp-temp1;c++)
					{
						list.add("(");
					}
					list.add(")");
					temp1=temp;
				}
				int count=1;
				int w=0;
				boolean out=true;
				while(list.contains(")"))
				{
					for(int b=0;b<list.size();b++)
					{
						if(list.get(b).equals("("))
						{
							count=1;w=b;
						}else if(list.get(b).equals(" "))
						{
							count++;
						}else if(list.get(b).equals(")"))
						{
							if(out)
							{
								System.out.print(count);
								out=false;
							}
							else
							{
								System.out.print(" "+count);
							}
							list.remove(w);
							list.add(w, " ");
							list.remove(b);
							break;
						}
					}
				}
				System.out.println();
			}
		}
	}

}
