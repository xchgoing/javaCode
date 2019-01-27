import java.util.Scanner;
public class hdu2000
{

	public static void main(String[] args)
	{
		String c;
		int fs,ss,ts;
		char f,s,t;
		Scanner S=new Scanner (System.in);
		while(S.hasNextLine())
		{
		c=S.nextLine();
		f=c.charAt(0);
		s=c.charAt(1);
		t=c.charAt(2);
		fs=(int)f;
		ss=(int)s;
		ts=(int)t;
		System.out.println(f);
		if(fs<=ss&&fs<=ts)
		{
			if(ss<=ts)
			{
				System.out.println(f+" "+s+" "+t);
			}
			else
			{
				System.out.println(f+" "+t+" "+s);
			}
		}else if(ss<fs&&ss<ts)
		{
			if(fs<ts)
			{
				System.out.println(s+" "+f+" "+t);
			}
			else
			{
				System.out.println(s+" "+t+" "+f);
			}
		}else
		{
			if(ss<fs)
			{
				System.out.println(t+" "+s+" "+f);
			}
			else
			{
				System.out.println(t+" "+f+" "+s);
			}
		}
		
	}

	}
}
