import java.util.Scanner;


public class hdu2017
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNext())
		{
			String n=s.nextLine();
			int ns=Integer.parseInt(n);
			for(int a=0;a<ns;a++)
			{
				int count=0;
				String zfc=s.nextLine();
				for(int q=0;q<zfc.length();q++)
				{
					char w=zfc.charAt(q);
					int sz=(int)w;
					if(sz>=48&&sz<=57)
					{
						count++;
					}
					
				}
				System.out.println(count);
			}
			
		}

	}

}
