package xzshuxue;

public class xzmath
{
	public static int getmax(int a,int b)
	{
		return (a<b)? b:a;
	}
	
	public int getmax3(int a,int b,int c)
	{
		return getmax(a,getmax(b,c));
	}
}
