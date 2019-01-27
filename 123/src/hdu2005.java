import java.util.Scanner;


public class hdu2005
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextLine())
		{
			String riqi=s.nextLine();
			String[] nyr=riqi.split("/");
			int nian=Integer.parseInt(nyr[0]);
			int yue=Integer.parseInt(nyr[1]);
			int ri=Integer.parseInt(nyr[2]);
			int sum=0;
			if((nian%4==0&&nian%100!=0)||nian%400==0)
			{
				int arr[]={31,29,31,30,31,30,31,31,30,31,30,31};
				for(int a=0;a<yue-1;a++)
				{
					sum=sum+arr[a];
				}
			}else
			{
				int arr[]={31,28,31,30,31,30,31,31,30,31,30,31};
				for(int a=0;a<yue-1;a++)
				{
					sum=sum+arr[a];
				}
			}
			System.out.println(sum+ri);
		}

	}

}
