package javamysql.Appstart;

import java.util.List;
import java.util.Scanner;

import StudentBean.StudentBean;
import javamysql.DAO.StudentDAO;

public class AppStart
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		StudentDAO sdo=new StudentDAO();
		int c=0;
		while(true)
		{
			System.out.println("1 print all student");
			System.out.println("2 add");
			System.out.println("exit");
			c=s.nextInt();
			if(c==0)
			{
				System.exit(0);
			}
			else if(c==1)
			{
				List<StudentBean> sblist=sdo.getAllStudent();
				for(int a=0;a<sblist.size();a++)
				{
					System.out.println(sblist.get(a).print());
				}
			}
			else if(c==2)
			{
				System.out.println("please input informations");
				String sid=s.next();
				String sname=s.next();
				int sage=s.nextInt();
//				sdo.addStudent(sid, sname, sage);
			}else if(c==3)
			{
				System.out.println("please inpou the sid");
				String sid=s.next();
				sdo.delete(sid);
			}else if(c==4)
			{
				System.out.println("please inpou the sid");
				String sid1=s.next();
				String sid=s.next();
				String sname=s.next();
				int sage=s.nextInt();
				sdo.update(sid1,sid, sname, sage);
			}
		}
	}

}
