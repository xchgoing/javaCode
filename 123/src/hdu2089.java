import java.util.Scanner;


public class hdu2089
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int a=s.nextInt();
			int b=s.nextInt();
			if(a==0&b==0)break;
			int count=0;
			loop:for(int i=a;i<=b;i++)
			{
				String temp=String.valueOf(i);
				for(int q=0;q<temp.length();q++)
				{
					char w=temp.charAt(q);
					if(w=='4')
					{
						
						continue loop;
					}
					if(w=='2'&&q!=0&&temp.charAt(q-1)=='6')continue loop;
				}
				count++;
			}
			System.out.println(count);
		}
	}

}
