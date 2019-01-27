package workt;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import StudentBean.StudentBean;
import javamysql.DB.Database;

public class inputtable
{
	static Database shenqi=new Database();
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
//		int row=1;
		while(s.hasNextLine())
		{
			String temp=s.nextLine();
			while(temp.contains("~~"))
			{
				temp=temp.replaceAll("~~", "~");
			}
			System.out.println("ok");
			String[] arr=temp.split("~");
//			temp=arr[1]+"   "+dz(arr[3])+"   "+(arr[4])+"   "+number(arr[4])+"   "+number(arr[3]);
//			System.out.println(temp);
			addkh(arr[1],arr[2],dz(arr[3]),dz(arr[4]),number(arr[4]),number(arr[3]));
//			double temp=s.nextDouble();
//			temp=temp*25;
//			String input=String.valueOf(temp);
//			addmj(input);
			
		}
	}
		
	
	public static String number(String q)
	{
		int nl=q.length();
		for(int a=nl-1;a>-1;a--)
		{
			if((q.charAt(a)!=45)&&(q.charAt(a)<48||q.charAt(a)>57))
			{
				return q.substring(a+1,q.length());
			}
		}
		return "no return";
	}
	public static String dz(String q)
	{
		int nl=q.length();
		for(int a=nl-1;a>-1;a--)
		{
			if((q.charAt(a)!=45)&&(q.charAt(a)<48||q.charAt(a)>57))
			{
				return q.substring(0,a+1);
			}
		}
		return "no return";
	}
	
	
	public static void addkh(String name,String sh,String dz,String bank,String bankNumber ,String number)
	{
		try
		{
			shenqi.OpenConn();
			shenqi.executeUpdate("insert into q values('"+name+"','"+"!"+sh+"','"+dz+"','"+bank+"','"+"!"+bankNumber+"','"+number+"')");
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
	
	public static void addmj(String mj)
	{
		try
		{
			shenqi.OpenConn();
			shenqi.executeUpdate("insert into mj values('"+mj+"')");
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
