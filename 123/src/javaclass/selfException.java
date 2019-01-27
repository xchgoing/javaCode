package javaclass;

public class selfException extends Exception
{
	String mistake="";
	
	selfException(int n)
	{
		mistake=n+" 阶乘必须是0以上的才有意义";
	}
	
	public String toString()
	{
		return mistake;
	}
}
