package acm2018;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class poj1004
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		List<String> list=new ArrayList<String>();
		int part=1;
		while(s.hasNext())
		{
			String q=s.next();
			if(q.equals("#"))
			{
//				System.out.println("part "+part);
				part++;
				continue;
			}
			if(part==1)
			{
				list.add(q);
			}else if(part==2)
			{
				if(list.contains(q))
				{
					System.out.println(q+" is correct");
					continue;
				}
				else//顺序先替换再加再减
				{
					System.out.print(q+":");
					for(int a=0;a<list.size();a++)
					{
						String temp=list.get(a);
						if(temp.length()==q.length())//查替换
						{
							int dif=0;
//							System.out.println(q+" "+temp);
							for(int i=0;i<q.length();i++)
							{
								if(temp.charAt(i)!=q.charAt(i))dif++;
							}
							if(dif==1)System.out.print(" "+temp);
						}
						
						
						
						if(temp.length()-1==q.length())//加
						{
							int dif=0;
							int qw=0,tw=0;
							while(qw<q.length()&&tw<temp.length())
							{
								if(q.charAt(qw)!=temp.charAt(tw))
								{
									qw--;
									dif++;
									if(dif>1)break;
								}
								qw++;
								tw++;
							}
							if(dif<=1)System.out.print(" "+temp);
						}
						
						
						
						if(temp.length()+1==q.length())//减
						{
							int dif=0;
							int qw=0,tw=0;
							while(qw<q.length()&&tw<temp.length())
							{
								if(q.charAt(qw)!=temp.charAt(tw))
								{
									tw--;
									dif++;
									if(dif>1)break;
								}
								qw++;
								tw++;
							}
							if(dif<=1)System.out.print(" "+temp);
						}
						
					}
					System.out.println();
				}
			}
		}
	}
}