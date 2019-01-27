package javamysql.DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import StudentBean.StudentBean;
import javamysql.DB.Database;

public class StudentDAO
{
	Database shenqi=new Database();
	
	public List<StudentBean> getAllStudent()
	{
		List<StudentBean> stulist=new ArrayList<StudentBean>();
		try
		{
			shenqi.OpenConn();
			ResultSet rs=shenqi.executeQuery("select * from student");
			while(rs.next())
			{
				StudentBean sb=new StudentBean();
				sb.setStuid(rs.getString(1));
				sb.setSname(rs.getString(2));
				sb.setSage(rs.getInt(3));
				stulist.add(sb);
			}
		}
		catch(Exception ex)
		{
			throw new RuntimeException(ex);
		}
		finally
		{
			shenqi.closeConn();
			shenqi.closeStmt();
		}
		return stulist;
	}
	public void addStudent(String sid,String sname,String sage)
	{
		try
		{
			shenqi.OpenConn();
			shenqi.executeUpdate("insert into dbyl1 values('"+sid+"','"+sname+"',"+sage+")");
		}
		catch(Exception ex)
		{
			throw new RuntimeException(ex);
		}
		finally
		{
			shenqi.closeConn();
			shenqi.closeStmt();
		}
	}
	public void delete(String sid)
	{
		try
		{
			shenqi.OpenConn();
			shenqi.executeUpdate("delete from student where sid="+sid);
		}
		catch(Exception ex)
		{
			throw new RuntimeException(ex);
		}
		finally
		{
			shenqi.closeConn();
			shenqi.closeStmt();
		}
	}
	public void update(String sid1,String sid,String sname,int sage)
	{
		try
		{
			shenqi.OpenConn();
			shenqi.executeUpdate("update student set sid='"+sid+"',sname='"+sname+"',sage='"+sage+"'where sid='"+sid1+"'");
		}
		catch(Exception ex)
		{
			throw new RuntimeException(ex);
		}
		finally
		{
			shenqi.closeConn();
			shenqi.closeStmt();
		}
	}
}
