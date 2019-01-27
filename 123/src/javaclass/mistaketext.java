package javaclass;

public class mistaketext
{

	public int calfac(int n) throws selfException
	{
		int fac=1;
		if(n<0)
		{
			selfException se=new selfException(n);
			throw se;
		}
		else
		{
			for(int a=1;a<=n;a++)
			{
				fac*=fac;
			}
		}
		return fac;
	}

}
