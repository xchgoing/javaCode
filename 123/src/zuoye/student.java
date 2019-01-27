package zuoye;

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
	
	@Override
	public int compareTo(student s)
	{
		if(this.score>s.score)return -1;
		else if(this.score<s.score) return 1;
		else if(this.score==s.score)
		{
			if(this.java>s.java)return -1;
			else if(this.java<s.java)return 1;
		}
		return 0;
	}
}