package javaclass;

public class selfException extends Exception
{
	String mistake="";
	
	selfException(int n)
	{
		mistake=n+" �׳˱�����0���ϵĲ�������";
	}
	
	public String toString()
	{
		return mistake;
	}
}
