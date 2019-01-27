package javamysql.DB;

import java.sql.*;//�������

public class Database 
{
	private Connection con=null;
	private Statement stmt=null;
	ResultSet rs=null;

	String driverName = "com.mysql.jdbc.Driver";  //jdbc��������
	//String dbURL = "jdbc:sqlserver://localhost:1433; DatabaseName=AppJava";  //��������
	String dbURL = "jdbc:mysql://127.0.0.1:3306/work";  //ip��ʽ����
	String userName = "root";  //Ĭ���û���
	String userPwd = "";  //����

	public Database()
	{
		
	}

	/**
	 * �����ݿ�����,��ʱ��д�ھ�̬���У�ֻ���������
	 */
	public void OpenConn()throws Exception
	{
		try
		{
			Class.forName(driverName); 
			con = DriverManager.getConnection(dbURL,userName,userPwd);     
		}
		catch(Exception e)
		{ 
			System.err.println("OpenConn:"+e.getMessage());
		}
	}

	/**
	 * ִ�и���sql��䣬���ؽ����ResultSet ���ͼ��� rs
	 */
	public ResultSet executeQuery(String sql)
	{
		stmt = null;
		rs=null;
		try
		{
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);        
			rs = stmt.executeQuery(sql);
            
		}
		catch(SQLException e)
		{
			System.err.println("executeQuery:"+e.getMessage());
		}
		return rs;
	}

	/**
	 * ִ��sql���
	 */
	public void executeUpdate(String sql)
	{
		stmt=null;
		rs=null;
		try
		{
			stmt=con.createStatement();  
			con.setAutoCommit(false);
			stmt.executeUpdate(sql);//vvip�޸ĳ�update�Ϳ���
			
			con.commit();
		}
		catch(SQLException e)
		{
			System.err.println("executeUpdate:"+e.getMessage()); 
		}
	}
	
	public void closeStmt(){
		try
		{
			stmt.close();
		}
		catch(SQLException e)
		{
			System.err.println("closeStmt:"+e.getMessage()); 
		}
	}

	/**
	 * �ر����ݿ�����
	 */
	public void closeConn()
	{
		try
		{
			con.close();
		}
		catch(SQLException ex)
		{
			System.err.println("aq.closeConn:"+ex.getMessage()); 
		}
	}
	
	/**
	 *ת������
	 */
	public static String toGBK(String str)
	{
		try 
		{
			if(str==null)
				str = "";
			else
				str=new String(str.getBytes("ISO-8859-1"),"GBK"); 
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
		
		return str;
	}
}
