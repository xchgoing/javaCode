package ����;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class tl3t1
{

	static List<HashSet> hb=new ArrayList<>();
	static List<Integer> pp=new ArrayList<>();
	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			while(n-->0)
			{
				String input=s.next();
				int m=input.charAt(0)-'0';//3:
				HashSet<Integer> temphb=new HashSet<>();
				
				while(m-->0)
				{
					int in=s.nextInt();
					temphb.add(in);
				}
//				System.out.println("���뼯��Ϊ��"+temphb.toString());
				if(hb.size()>0)
				{
					int firsthas=-1;
					for(int a=0;a<hb.size();a++)
					{
//						System.out.println("��ǰaΪ"+a);
						Iterator<Integer> it=temphb.iterator();
						while(it.hasNext())
						{
							int temp=it.next();
							if(hb.get(a).contains(temp))
							{
//								System.out.println("����"+temp+"�ظ���");
								if(firsthas==-1)
								{
									firsthas=a;
									HashSet settemp=hb.get(a);
									settemp.addAll(temphb);
									int q=pp.get(a)+1;
									pp.remove(a);
									pp.add(a,q);
									hb.remove(a);
									hb.add(a,settemp);
//									System.out.println("�ҵ����ǵ�һ���ظ������ǵ�"+(a+1)+"��    Ϊ��"+hb.get(a).toString());
								}else
								{
//									System.out.println("�ҵ��Ĳ��Ǹ��ظ������ǵ�"+(a+1)+"��    Ϊ��"+hb.get(a).toString());
//									System.out.println("Ҫ�����ϲ��ļ����ǵ�"+(firsthas+1)+"��    Ϊ��"+hb.get(firsthas).toString());
									HashSet settemp=hb.get(firsthas);
									settemp.addAll(hb.get(a));
									int q=pp.get(a)+pp.get(firsthas);
									pp.remove(a);
									pp.remove(firsthas);
									pp.add(firsthas,q);
									hb.remove(a);
									hb.remove(firsthas);
									hb.add(firsthas,settemp);
									a--;
								}
//								System.out.println("������Ȥ���Ϻ������У�");
//								for(int q=0;q<hb.size();q++)
//								{
//									System.out.println(hb.get(q).toString()+"    "+pp.get(q));
//								}
								break;
							}
						}
						
					}
					
					if(firsthas==-1)
					{
						hb.add(temphb);
						pp.add(1);
					}
				}else
				{
					hb.add(temphb);
					pp.add(1);
				}
//				System.out.println("-----------------------------------------------------------------------");
//				System.out.println(pp.size());
			}
			System.out.println(pp.size());
			Collections.sort(pp);
			for(int a=pp.size()-1;a>=0;a--)
			{
				if(a==pp.size()-1)
				{
					System.out.print(pp.get(a));
				}else
				{
					System.out.print(" "+pp.get(a));
				}
			}
			System.out.println();
		}
	}
}
