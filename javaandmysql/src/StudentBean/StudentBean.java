package StudentBean;

public class StudentBean
{
	public String getStuid()
	{
		return stuid;
	}
	public void setStuid(String stuid)
	{
		this.stuid = stuid;
	}
	public String getSname()
	{
		return sname;
	}
	public void setSname(String sname)
	{
		this.sname = sname;
	}
	public int getSage()
	{
		return sage;
	}
	public void setSage(int sage)
	{
		this.sage = sage;
	}
	private String stuid;
	private String sname;
	private int sage;
	public StudentBean()
	{
		
	}
	
	public StudentBean(String sid,String sname,int age)
	{
		this.stuid=sid;
		this.sname=sname;
		this.sage=age;
	}
	
	public String print()
	{
		return "Ñ§ºÅ£º"+stuid+"  ĞÕÃû£º"+sname+"  ÄêÁä£º"+sage;
	}
}
