import java.util.Scanner;


public class hdu2044
{

	public static void main(String[] args)
	{
		int n;
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int q=0,h=0;
			n=s.nextInt();
			for(int a=0;a<n;a++)
			{
				q=s.nextInt();
				h=s.nextInt();
				int c=h-q;
				long arr[];
				if(c==1)
				{
					System.out.println(1);
				}else if(c==2)
				{
					System.out.println(2);
				}else
				{
					arr=new long[c];
					arr[0]=1;
					arr[1]=2;
					for(int b=2;b<c;b++)
					{
						arr[b]=arr[b-1]+arr[b-2];
					}
					System.out.println(arr[c-1]);
				}
			}
			
		}
	}
	

}
