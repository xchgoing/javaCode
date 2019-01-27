package zmeoj;
import java.util.Scanner;


public class zimeoj
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int q=s.nextInt();
			int w=s.nextInt();
			System.out.println(q+w);
		}
	}
}
