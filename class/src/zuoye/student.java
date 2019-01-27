package zuoye;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import zuoye.student;

public class student  implements Comparable<student>
{
	String stuid;
	String sname;
	String gender;
	int java;
	int mysql;
	int score;
	
	public student(){};
	
	public student(String sid ,String sname,String gender,int java ,int mysql)
	{
		stuid=sid;
		this.sname=sname;
		this.gender=gender;
		this.java=java;
		this.mysql=mysql;
		score=java+mysql;
	}
	
	public void print()
	{
		System.out.println("ѧ�ţ�"+stuid+"--������"+sname+"--�Ա�"+gender+"--java��"+java+"--mysql��"+mysql+"--�ܷ֣�"+score);
	}

	//����ͨ���ı��ֵ��ѡ�����򷽷������ݣ�������ΪStatic(��̬)�������������������и��Ĳ��������ڴ���
	//ps����̬��������û��ʵ���������ǰ���µ��ã��޸ġ�����̬������ͨ�ģ��Ǵ������ݣ�ֻ����ʵ������������ȷ������������֮ǰ��û������ģ�����ֻ����ʵ����֮����ܵ��ã��޸�
	//��̬�����޷�ʹ��this.����������Ϊǰ׺��this���¶�̬��Ҫʵ��������С�
	//s.reset(); 
	static int i=-1;
	public int compareTo(student s)
	{
		if(i==-1)
		{
			if(this.score>s.score)return -1;
			else if(this.score<s.score) return 1;
			else if(this.score==s.score)
			{
				if(this.java>s.java)return -1;
				else if(this.java<s.java)return 1;
			}
		}else
		{
			int q=0;
			if(this.score>s.score)return 1;
			else if(this.score<s.score) return -1;
			else if(this.score==s.score)
			{
				if(this.java>s.java)return 1;
				else if(this.java<s.java)return -1;
			}
		}
		return 0;
	}
	public static void main(String[] args) throws InterruptedException 
	{
		Scanner s=new Scanner (System.in);
		List<student> stulist=new ArrayList<student>();
		int fflag=0;
		while(true)
		{
			try
			{
				
				if(fflag==0)System.out.println("*******************��ӭʹ��ѧ���ɼ�����ϵͳ***********");//��ӭֻ�ڸս���ʱʹ��
				else
				{
					System.out.println();
					System.out.println();
				}
				System.out.println("*******************1��ѯѧ���ɼ�***********");
				System.out.println("*******************2��ӳɼ���Ϣ***********");
				System.out.println("*******************3�޸�ѧ���ɼ�***********");
				System.out.println("*******************4ɾ��ѧ���ɼ�***********");
				System.out.println("*******************5��ӡ�ɼ�����***********");
				System.out.println("*******************6�˳�***********");
				fflag++;
				int n=s.nextInt();
				if(n==1)
				{
					while(true)
					{
						if(stulist.size()==0)
						{
							System.out.println("Ŀǰû�����ݣ��޷����ҡ�����1��󷵻���ҳ��");
							Thread.currentThread().sleep(1000);
							break;
						}
						System.out.println("ѧ�Ų�ѯ������1������ģ����ѯ������2,������һ��������-1");
						String choice=s.next();
						if(choice.equals("1"))
						{
							while(true)
							{
								System.out.println("������һ��������-1����ѯ��������Ҫ���ҵ�ѧ��ѧ�ţ�");
								String sid=s.next();
								if(sid.equals("-1"))break;
								int count=0;
								for(int i=0;i<stulist.size();i++)
								{
									if(stulist.get(i).stuid.equals(sid))
									{
										stulist.get(i).print();
										count++;
									}
								}
								if(count==0)System.out.println("���޴���");
								
							}
						}else if(choice.equals("2"))
						{
							while(true)
							{
								System.out.println("�˳�������-1����ѯ����������");
								String input=s.next();
								if(input.equals("-1"))break;
								int count=0;
								for(int a=0;a<stulist.size();a++)
								{
									if(like(input,stulist.get(a).sname))
									{
										stulist.get(a).print();
										count++;
									}
								}
								if(count==0)System.out.println("���޴���");
							}
						}else if(choice.equals("-1"))
						{
							break;
						}else
						{
							System.out.println("�޷�ʶ��ָ��");
						}
					}
				}
				else if(n==2)
				{
					int flag=0;
					while(true)
					{
						System.out.println("ֹͣ����������-1,����������ѧ�ţ��������Ա�java��mysql");
						String sid=s.next();
						if(sid.equals("-1"))
						{
							break;
						}
						try
						{
							String sname=s.next();
							String gender =s.next();
							int java=s.nextInt();
							int mysql=s.nextInt();
							if(!(gender.equals("��")||gender.equals("Ů")))System.out.println("�Ա�����������л�Ů");
							else if(java<0||java>100||mysql<0||mysql>100)System.out.println("����ĳɼ���Ч�޷���ӣ��ɼ���0��100֮��Ϊ������");
							else
							{
								int a;
								for(a=0;a<stulist.size();a++)
								{
									if(stulist.get(a).stuid.equals(sid))
									{
										System.out.println("�����ѧ��ѧ���ظ����޷����");
										break;
									}
								}
								if(a==stulist.size())
								{
									stulist.add(new student(sid,sname,gender,java,mysql));
									System.out.println("��ӳɹ�");
								}
							}
							flag++;
						}
						catch (Exception e)
						{
							System.out.println("�������������");
							String qwe=s.nextLine();
						}
						
					}
				}
				else if(n==3)
				{
					int flag=0;
					while(true)
					{
						System.out.println("�˳�������-1���޸���������Ҫ�޸ĵ�ѧ��ѧ��,");
						String sid=s.next();
						if(sid.equals("-1"))break;
						int q=-1;
						for(int i=0;i<stulist.size();i++)
						{
							if(stulist.get(i).stuid.equals(sid))
							{
								System.out.println("��������ѡ���ѧ��������ȷ��:");
								stulist.get(i).print();
								q=i;
								break;
							}
						}
						if(q==-1)
						{
							System.out.println("���޴��ˣ�������ȷ��ѧ��");
						}
						else
						{
							System.out.println("ȷ���޸�����������ѧ�ţ��������Ա�java��mysql����������0");
							try
							{
								String w=s.next();
								if(!w.equals("0"))
								{
									String sname=s.next();
									String gender=s.next();
									int java=s.nextInt();
									int mysql=s.nextInt(); 
									if(!(gender.equals("��")||gender.equals("Ů")))System.out.println("�Ա�����������л�Ů");
									else if(java<0||java>100||mysql<0||mysql>100)System.out.println("����ĳɼ���Ч�޷���ӣ��ɼ���0��100֮��Ϊ������");
									else
									{
										stulist.add(q,new student(w,sname,gender,java,mysql));
										stulist.remove(q+1);
										System.out.println("�޸ĳɹ�");
									}
								}else
								{
									System.out.println("ȡ���ɹ�");
								}
							}
							catch (Exception e)
							{
								System.out.print("�������,�������������");
								String qwe=s.nextLine();
							}
						}
					}
				}else if(n==4)//bug
				{
					int flag=0;
					while(true)
					{
						if(flag==0)System.out.println("�˳�������-1��ɾ����������Ҫɾ����ѧ����ѧ��");
						else System.out.println("����ɾ��������ѧ�ţ��˳�������-1");
						flag++;
						String input=s.next();
						if(input.equals("-1"))break;
						int a;
						for(a=0;a<stulist.size();a++)
						{
							if(stulist.get(a).stuid.equals(input))break;
						}
						if(a==stulist.size())
						{
							System.out.println("���޴���,������ȷ��");
						}else
						{
							System.out.println("������Ҫɾ����ѧ�����ݣ�");
							stulist.get(a).print();
							System.out.println("ȷ��ɾ������1��ȡ��������0");
							String decision=s.next();
							if(decision.equals("1"))stulist.remove(a);
							else if(decision.equals("0"))System.out.println("ɾ����ȡ��");
							else System.out.println("ɾ��ʧ�ܣ��޷�ʶ��ָ��");
						}
					}
				}
				else if(n==5)
				{
					while(true)
					{
						System.out.println("�鿴���Ƴɼ��������Ŀ���ƣ�ֻ�鿴�ܷ�����������score���鿴�ۺ�����������all,�˳�������-1");
						String input=s.next();
						input=input.toLowerCase();
						if(input.equals("java"))
						{
							for(int i=1;i<stulist.size();i++)//����mysqlʱ��ͬ
							{
								for(int a=0;a<stulist.size()-i;a++)
								{
									if(stulist.get(a).java>stulist.get(a+1).java)
									{
										student temp=stulist.get(a);
										stulist.remove(a);
										stulist.add(a+1,temp);
									}
								}
							}
							double average=0;
							double fail=0;
							for(int a=stulist.size()-1;a>=0;a--)
							{
								average+=stulist.get(a).java;
								if(stulist.get(a).java<60)fail++;
								System.out.println("ѧ��"+stulist.get(a).stuid+"--����"+stulist.get(a).sname+"--�Ա�"+stulist.get(a).gender+"--java�ɼ�"+stulist.get(a).java);
							}
							average=average*1.0/stulist.size();
							fail=fail/stulist.size();
							System.out.println("ƽ���ɼ���"+String.format("%.2f",average)+"   �ҿ����ǣ�"+String.format("%.2f",fail));
							System.out.println("java�����"+stulist.get(stulist.size()-1).sname+"--�Ա�"+stulist.get(stulist.size()-1).gender+"  �÷�Ϊ��"+stulist.get(stulist.size()-1).java);
							System.out.println("java�����"+stulist.get(0).sname+"--�Ա�"+stulist.get(0).gender+"  �÷�Ϊ��"+stulist.get(0).java);
						}else if(input.equals("mysql"))
						{
							for(int i=1;i<stulist.size();i++)
							{
								for(int a=0;a<stulist.size()-i;a++)
								{
									if(stulist.get(a).mysql>stulist.get(a+1).mysql)
									{
										student temp=stulist.get(a);
										stulist.remove(a);
										stulist.add(a+1,temp);
									}
								}
							}
							double average=0;
							double fail=0;
							for(int a=stulist.size()-1;a>=0;a--)
							{
								average+=stulist.get(a).mysql;
								if(stulist.get(a).mysql<60)fail++;
								System.out.println("ѧ��"+stulist.get(a).stuid+"--����"+"--�Ա�"+stulist.get(a).gender+stulist.get(a).sname+"--java�ɼ�"+stulist.get(a).mysql);
							}
							average=average*1.0/stulist.size();
							fail=fail/stulist.size();
							System.out.println("ƽ���ɼ���"+String.format("%.2f",average)+"   �ҿ����ǣ�"+String.format("%.2f",fail));
							System.out.println("--����Ŀ�����"+stulist.get(stulist.size()-1).sname+"--�Ա�"+stulist.get(stulist.size()-1).gender+"  �÷�Ϊ��"+stulist.get(stulist.size()-1).mysql);
							System.out.println("--����Ŀ�����"+stulist.get(0).sname+"--�Ա�"+stulist.get(0).gender+"  �÷�Ϊ��"+stulist.get(0).mysql);
						}else if(input.equals("score"))
						{
							for(int i=1;i<stulist.size();i++)
							{
								for(int a=0;a<stulist.size()-i;a++)
								{
									if(stulist.get(a).score>stulist.get(a+1).score)
									{
										student temp=stulist.get(a);
										stulist.remove(a);
										stulist.add(a+1,temp);
									}
								}
							}
							double average=0;
							for(int a=stulist.size()-1;a>=0;a--)
							{
								average+=stulist.get(a).score;
								System.out.println("ѧ��"+stulist.get(a).stuid+"--����"+stulist.get(a).sname+"--�Ա�"+stulist.get(a).gender+"--�ܳɼ�"+stulist.get(a).score);
							}
							average=average*1.0/stulist.size();
							System.out.println("ƽ���ɼ���"+String.format("%.2f",average));
							System.out.println("�ܷ������"+stulist.get(stulist.size()-1).sname+"--�Ա�"+stulist.get(stulist.size()-1).gender+"  �÷�Ϊ��"+stulist.get(stulist.size()-1).score);
							System.out.println("�ܷ������"+stulist.get(0).sname+"--�Ա�"+stulist.get(0).gender+"  �÷�Ϊ��"+stulist.get(0).score);
						}else if(input.equals("all"))
						{
							Collections.sort(stulist);
							for(int a=0;a<stulist.size();a++)
							{
								stulist.get(a).print();
							}
						}
						else if(input.equals("-1"))
						{
							break;	
						}else
						{
							System.out.println("�޷�ʶ��ָ��");
						}
					}
				}else if(n==6)
				{
					System.out.println("ллʹ�ã��ټ�");
					break;
				}else
				{
					System.out.println("�޷�ʶ��ָ�����������");
				}
			}
			catch(Exception e)//��Ϊһ��ʼָ�������int���Դ˷����
			{
				System.out.println("ָ�����������ָʾ���룬����1.5��󷵻���ҳ��");
				String bug=s.nextLine();
				Thread.currentThread().sleep(1500);
			}
		}
	}
	public static boolean like(String input,String i)//ģ����ѯ�ķ���
	{
		for(int a=0;a<i.length()+1-input.length();a++)
		{
			if(i.substring(a, a+input.length()).equals(input))
			{
				return true;
			}
		}
		return false;
	}
	
}