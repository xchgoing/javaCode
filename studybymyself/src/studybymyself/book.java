package studybymyself;

public class book
{
	boolean checkedOut=false;
	String name="123";
	book(boolean checkOut,String name)
	{
		checkedOut=checkOut;
		this.name=name;
	}
	void checkin()
	{
		checkedOut =false;
	}
	protected void finalize()
	{
		if(checkedOut)
			System.out.println("error:checked out123    "+name);
	}
	public static class TerminationCondition
	{
		public static void main(String[] args)
		{
			book novel=new book(true,"novel");
			novel.checkin();
			new book(true,"new");
			System.gc();
		}
	}
}
