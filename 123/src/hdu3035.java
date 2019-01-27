import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;


public class hdu3035
{

	public static void main(String[] args)
	{
		BigInteger a;
		int b;
		Scanner s=new Scanner (System.in);
		while(s.hasNext())
		{
			BigInteger w=new BigInteger("0");
			a=s.nextBigInteger();
			b=s.nextInt();
			//System.out.println(a+" "+w+" "+b);
			if(a.equals(w)&&b==0)break;
			BigInteger ji;
			ji=a.pow(b);
			BigInteger q=new BigInteger("1000");
			System.out.println(ji.divideAndRemainder(q)[1]);
		}

	}

	

}
