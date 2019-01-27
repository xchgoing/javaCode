import java.util.Scanner;


public class hdu2031
{

	public static void main(String[] args)
	{
		int n=0;
		int r=0;
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			n=s.nextInt();
			r=s.nextInt();
			System.out.println(Integer.toString(n,r).toUpperCase());
		}

	}

}
