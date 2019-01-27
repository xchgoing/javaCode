import java.util.Scanner;


public class hdu2021
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNext())
		{
			int n=s.nextInt();
			if(n==0)
			{
				break;
			}
			int count=0;
			for(int a=0;a<n;a++)
			{
				int gz=s.nextInt();
				int bai=gz/100;
				int wushi=(gz%100)/50;
				int shi=((gz%100)%50)/10;
				int wu=(((gz%100)%50)%10)/5;
				int er=((((gz%100)%50)%10)%5)/2;
				int yi=((((gz%100)%50)%10)%5)%2;
				count=count+bai+wushi+shi+wu+er+yi;
			}
			System.out.println(count);
			
		}

	}

}
