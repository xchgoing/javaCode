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
			System.out.println("ArithmeticException-��׽������");
		}
		catch(Exception e)
		{
			System.out.println("ArithmeticException-��׽������");
		}
		finally
		{
			System.out.println("��ͷ��");
		}
	}

}
