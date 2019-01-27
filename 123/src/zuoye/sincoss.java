package zuoye;
public class sincoss
{
    public static void main(String[] args)
	{
		for(double a=20;a>=0;a--)
		{
			sinq(a);
		}
		for(double a=0;a<=20;a++)
		{
			for(int b=0;b<66;b++)
			{
				System.out.print(" ");
			}
			sinh(a);
		}
	}
	public static void sinq(double a)
	{
		for(int b=(int)(20*Math.asin(a/20));b>=0;b--)
	    {			
			System.out.print(" ");
		}
		System.out.print("*");
		for(int b=31-(int)(20*Math.asin(a/20));b>=0;b--)
	    {			
			System.out.print("  ");
		}
		System.out.println("*");
	}
	public static void sinh(double a)
	{
		for(int b=(int)(20*Math.asin(a/20));b>=0;b--)
	    {			
			System.out.print(" ");
		}
		System.out.print("*");
		for(int b=31-(int)(20*Math.asin(a/20));b>=0;b--)
	    {			
			System.out.print("  ");
		}
		System.out.println("*");
	}
}
