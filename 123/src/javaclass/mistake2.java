package javaclass;

public class mistake2
{

	public static void main(String[] args)
	{
		int n=-6;
		int jc=0;
		mistaketext mt=new mistaketext();
		
		
		try
		{
			jc=mt.calfac(n);
		}
		catch(selfException e)
		{
			System.out.println(e.toString());
		}
		catch(Exception e)
		{
			System.out.println("����ϵͳ���Բ�׽�����Ĵ���");
		}
	}

}
