import java.util.Scanner;


public class hdu2027
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextLine())
		{
			String q=s.nextLine();
			int n=Integer.parseInt(q);
			for(int a=0;a<n;a++)
			{
				String shuru=s.nextLine();
				char[] arr;
				arr=new char[shuru.length()];
				int[] yy={97,101,105,111,117};
				for(int b=0;b<shuru.length();b++)
				{
					arr[b]=shuru.substring(b, b+1).charAt(0);
					for(int w=0;w<5;w++)
					{
						if(arr[b]==yy[w]%1000)yy[w]=yy[w]+1000;
					}
				}
				for(int w=0;w<5;w++)
				{
					System.out.println((char)(yy[w]%1000)+":"+yy[w]/1000);
				}
				if(a<n-1)
				{
					System.out.println();
				}
			}
		}

	}

}
