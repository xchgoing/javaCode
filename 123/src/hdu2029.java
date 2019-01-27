import java.util.Scanner;


public class hdu2029
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextLine())
		{
			String a=s.nextLine();
			int n=Integer.parseInt(a);
			for(int b=0;b<n;b++)
			{
				String shuru=s.nextLine();
				StringBuffer hw=new StringBuffer(String.valueOf(shuru));
				if(String.valueOf(shuru).equals(hw.reverse().toString()))
				{
					System.out.println("yes");
				}
				else
				{
					System.out.println("no");
				}
			}
		}

	}

}
