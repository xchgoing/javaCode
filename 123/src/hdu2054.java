import java.io.BufferedInputStream;
import java.math.BigDecimal;
import java.util.Scanner;


public class hdu2054
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(new BufferedInputStream(System.in));
		while(s.hasNextBigDecimal())
		{
			BigDecimal a=new BigDecimal(s.next());
			BigDecimal b=new BigDecimal(s.next());
			if(a.compareTo(b)==0)
			{
				System.out.println("YES");
			}else
			{
				System.out.println("NO");
			}
		}

	}

}
