

import java.util.Arrays;
import java.util.Scanner;

public class ls
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			student[] st=new student[n];
			for(int i=0;i<n;i++)
			{
//				String name=s.next();
//				int score=s.nextInt();
				st[i]=new student();
				st[i].name=s.next();
				st[i].score=s.nextInt();
			}
			Arrays.sort(st);
			for(int i=0;i<n;i++)
			   System.out.println(st[i].name);
		}
	}
}
class student implements Comparable<student>
{
	String name="";
	int    score=0;
//	student(String name,int score)
//	{
//		this.name=name;
//		this.score=score;
//	}
	@Override
	public int compareTo(student o)
	{
	    if(this.score>o.score)return -1;
	    else if (this.score<o.score)return 1;
	    return 0;
	}
}