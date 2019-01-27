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
		System.out.println("学号："+stuid+"--姓名："+sname+"--性别："+gender+"--java："+java+"--mysql："+mysql+"--总分："+score);
	}

	//可以通过改变的值来选择排序方法，依据，将设置为Static(静态)后可以再启动项里面进行更改并且适用于此类
	//ps：静态量可以再没有实例化对象的前提下调用，修改。而动态量（普通的）是待定数据，只有在实例化对象后才能确定下来，在这之前是没有意义的，所以只有在实例化之后才能调用，修改
	//静态函数无法使用this.————因为前缀是this的事动态量要实例化后才有。
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
				
				if(fflag==0)System.out.println("*******************欢迎使用学生成绩管理系统***********");//欢迎只在刚进入时使用
				else
				{
					System.out.println();
					System.out.println();
				}
				System.out.println("*******************1查询学生成绩***********");
				System.out.println("*******************2添加成绩信息***********");
				System.out.println("*******************3修改学生成绩***********");
				System.out.println("*******************4删除学生成绩***********");
				System.out.println("*******************5打印成绩排名***********");
				System.out.println("*******************6退出***********");
				fflag++;
				int n=s.nextInt();
				if(n==1)
				{
					while(true)
					{
						if(stulist.size()==0)
						{
							System.out.println("目前没有数据，无法查找。将在1秒后返回主页面");
							Thread.currentThread().sleep(1000);
							break;
						}
						System.out.println("学号查询请输入1，姓名模糊查询请输入2,返回上一层请输入-1");
						String choice=s.next();
						if(choice.equals("1"))
						{
							while(true)
							{
								System.out.println("返回上一层请输入-1，查询请输入你要查找的学生学号：");
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
								if(count==0)System.out.println("查无此人");
								
							}
						}else if(choice.equals("2"))
						{
							while(true)
							{
								System.out.println("退出请输入-1，查询请输入名字");
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
								if(count==0)System.out.println("查无此人");
							}
						}else if(choice.equals("-1"))
						{
							break;
						}else
						{
							System.out.println("无法识别指令");
						}
					}
				}
				else if(n==2)
				{
					int flag=0;
					while(true)
					{
						System.out.println("停止输入请输入-1,请依次输入学号，姓名，性别，java，mysql");
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
							if(!(gender.equals("男")||gender.equals("女")))System.out.println("性别错误请输入男或女");
							else if(java<0||java>100||mysql<0||mysql>100)System.out.println("输入的成绩无效无法添加（成绩在0到100之间为整数）");
							else
							{
								int a;
								for(a=0;a<stulist.size();a++)
								{
									if(stulist.get(a).stuid.equals(sid))
									{
										System.out.println("输入的学生学号重复，无法添加");
										break;
									}
								}
								if(a==stulist.size())
								{
									stulist.add(new student(sid,sname,gender,java,mysql));
									System.out.println("添加成功");
								}
							}
							flag++;
						}
						catch (Exception e)
						{
							System.out.println("请输入合理数据");
							String qwe=s.nextLine();
						}
						
					}
				}
				else if(n==3)
				{
					int flag=0;
					while(true)
					{
						System.out.println("退出请输入-1，修改请输入你要修改的学生学号,");
						String sid=s.next();
						if(sid.equals("-1"))break;
						int q=-1;
						for(int i=0;i<stulist.size();i++)
						{
							if(stulist.get(i).stuid.equals(sid))
							{
								System.out.println("这是你所选择的学生数据请确认:");
								stulist.get(i).print();
								q=i;
								break;
							}
						}
						if(q==-1)
						{
							System.out.println("查无此人，请重新确认学号");
						}
						else
						{
							System.out.println("确定修改请依次输入学号，姓名，性别，java，mysql，否则输入0");
							try
							{
								String w=s.next();
								if(!w.equals("0"))
								{
									String sname=s.next();
									String gender=s.next();
									int java=s.nextInt();
									int mysql=s.nextInt(); 
									if(!(gender.equals("男")||gender.equals("女")))System.out.println("性别错误请输入男或女");
									else if(java<0||java>100||mysql<0||mysql>100)System.out.println("输入的成绩无效无法添加（成绩在0到100之间为整数）");
									else
									{
										stulist.add(q,new student(w,sname,gender,java,mysql));
										stulist.remove(q+1);
										System.out.println("修改成功");
									}
								}else
								{
									System.out.println("取消成功");
								}
							}
							catch (Exception e)
							{
								System.out.print("输入错误,请输入合理数据");
								String qwe=s.nextLine();
							}
						}
					}
				}else if(n==4)//bug
				{
					int flag=0;
					while(true)
					{
						if(flag==0)System.out.println("退出请输入-1，删除请输入你要删除的学生的学号");
						else System.out.println("继续删除请输入学号，退出请输入-1");
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
							System.out.println("查无此人,请重新确认");
						}else
						{
							System.out.println("这是你要删除的学生数据：");
							stulist.get(a).print();
							System.out.println("确认删除输入1，取消请输入0");
							String decision=s.next();
							if(decision.equals("1"))stulist.remove(a);
							else if(decision.equals("0"))System.out.println("删除已取消");
							else System.out.println("删除失败，无法识别指令");
						}
					}
				}
				else if(n==5)
				{
					while(true)
					{
						System.out.println("查看单科成绩请输入科目名称，只查看总分排名请输入score，查看综合排名请输入all,退出请输入-1");
						String input=s.next();
						input=input.toLowerCase();
						if(input.equals("java"))
						{
							for(int i=1;i<stulist.size();i++)//排序，mysql时相同
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
								System.out.println("学号"+stulist.get(a).stuid+"--姓名"+stulist.get(a).sname+"--性别："+stulist.get(a).gender+"--java成绩"+stulist.get(a).java);
							}
							average=average*1.0/stulist.size();
							fail=fail/stulist.size();
							System.out.println("平均成绩："+String.format("%.2f",average)+"   挂科率是："+String.format("%.2f",fail));
							System.out.println("java最高是"+stulist.get(stulist.size()-1).sname+"--性别："+stulist.get(stulist.size()-1).gender+"  得分为："+stulist.get(stulist.size()-1).java);
							System.out.println("java最低是"+stulist.get(0).sname+"--性别："+stulist.get(0).gender+"  得分为："+stulist.get(0).java);
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
								System.out.println("学号"+stulist.get(a).stuid+"--姓名"+"--性别："+stulist.get(a).gender+stulist.get(a).sname+"--java成绩"+stulist.get(a).mysql);
							}
							average=average*1.0/stulist.size();
							fail=fail/stulist.size();
							System.out.println("平均成绩："+String.format("%.2f",average)+"   挂科率是："+String.format("%.2f",fail));
							System.out.println("--本科目最高是"+stulist.get(stulist.size()-1).sname+"--性别："+stulist.get(stulist.size()-1).gender+"  得分为："+stulist.get(stulist.size()-1).mysql);
							System.out.println("--本科目最低是"+stulist.get(0).sname+"--性别："+stulist.get(0).gender+"  得分为："+stulist.get(0).mysql);
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
								System.out.println("学号"+stulist.get(a).stuid+"--姓名"+stulist.get(a).sname+"--性别："+stulist.get(a).gender+"--总成绩"+stulist.get(a).score);
							}
							average=average*1.0/stulist.size();
							System.out.println("平均成绩："+String.format("%.2f",average));
							System.out.println("总分最高是"+stulist.get(stulist.size()-1).sname+"--性别："+stulist.get(stulist.size()-1).gender+"  得分为："+stulist.get(stulist.size()-1).score);
							System.out.println("总分最低是"+stulist.get(0).sname+"--性别："+stulist.get(0).gender+"  得分为："+stulist.get(0).score);
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
							System.out.println("无法识别指令");
						}
					}
				}else if(n==6)
				{
					System.out.println("谢谢使用，再见");
					break;
				}else
				{
					System.out.println("无法识别指令，请重新输入");
				}
			}
			catch(Exception e)//因为一开始指令变量是int型以此防恶搞
			{
				System.out.println("指令错误，请依照指示输入，将在1.5秒后返回主页面");
				String bug=s.nextLine();
				Thread.currentThread().sleep(1500);
			}
		}
	}
	public static boolean like(String input,String i)//模糊查询的方法
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