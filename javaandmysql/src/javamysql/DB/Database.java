package javamysql.DB;

import java.sql.*;//引入类库

public class Database 
{
	private Connection con=null;
	private Statement stmt=null;
	ResultSet rs=null;

	String driverName = "com.mysql.jdbc.Driver";  //jdbc驱动名称
	//String dbURL = "jdbc:sqlserver://localhost:1433; DatabaseName=AppJava";  //本地连接
	String dbURL = "jdbc:mysql://127.0.0.1:3306/work";  //ip方式连接
	String userName = "root";  //默认用户名
	String userPwd = "";  //密码

	public Database()
	{
		
	}

	/**
	 * 打开数据库连接,到时候写在静态快中，只需加载依次
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
	 * 执行给定sql语句，返回结果集ResultSet 类型集合 rs
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
	 * 执行sql语句
	 */
	public void executeUpdate(String sql)
	{
		stmt=null;
		rs=null;
		try
		{
			stmt=con.createStatement();  
			con.setAutoCommit(false);
			stmt.executeUpdate(sql);//vvip修改成update就可以
			
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
	 * 关闭数据库连接
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
	 *转换编码
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
