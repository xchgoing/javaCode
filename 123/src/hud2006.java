import java.util.Scanner;


public class hud2006
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		int gs;
		while(s.hasNextInt())
		{
			int b;
			int sum=1;
			gs=s.nextInt();
			for(int a=0;a<gs;a++)
			{
				b=s.nextInt();
				
				if(b%2==1)
				{
					sum=sum*b;
					
				}
				
			}
			System.out.println(sum);
		}
		
		

	}

}
