package javaclass;

public class mistake
{

	public static void main(String[] args)
	{
		try
		{
			int a=3;
			int b=0;
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException-捕捉到错误");
		}
		catch(Exception e)
		{
			System.out.println("ArithmeticException-捕捉到错误");
		}
		finally
		{
			System.out.println("出头了");
		}
	}

}
